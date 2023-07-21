import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Clase que representa la interfaz gráfica de la aplicación de Autobuses C&N
class InterfazGrafica extends JFrame {
    // Variables miembro de la clase
    private int indiceSeleccionadoBarra1 = -1;
    private Image imagenfondo;
    private JPanel panel1;
    private String origen, destino, fecha;
    private JComboBox<String>[] comboBoxes;
    private JButton boton;
    private PasajesGUI pasajesgui;
    private Filtro_Pasajes filtro;
    private ArrayList<String> listaCiudades;

    // Constructor de la clase
    public InterfazGrafica() {
        // Configuración de la ventana
        setTitle("Autobuses C&N");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Establecer null layout
        int screenWidth =1350;
        int screenHeight =800;
        setSize(screenWidth, screenHeight);
        setResizable(false);
        setLocationRelativeTo(null);

        //Imagen de fondo
        imagenfondo = new ImageIcon("src/dibujos/autobus2.png").getImage();
        imagenfondo = imagenfondo.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel principal = new JLabel(new ImageIcon(imagenfondo));
        setContentPane(principal);

        // Panel que contendrá el botón de búsqueda
        panel1 = new JPanel();
        panel1.setBounds(620, 398, 200, 30);
        panel1.setOpaque(false);

        // Cargar la lista de ciudades desde un archivo de texto
        Ciudades ciudades = new Ciudades("src/Archivos/ciudades.txt");
        listaCiudades = ciudades.getCiudades();

        // Crear las barras desplegables y establecer sus coordenadas
        String[] textos = {"¿De donde partes?", "¿A donde quieres ir?", "Día"};
        comboBoxes = new JComboBox[3];
        for (int i = 0; i < 3; i++) {
            comboBoxes[i] = new JComboBox<>();
            comboBoxes[i].setMaximumSize(new Dimension(200, comboBoxes[i].getPreferredSize().height));

            int x = 50 + i * 210; // Coordenada x
            int y = 403; // Coordenada y

            comboBoxes[i].setBounds(x, y, 200, comboBoxes[i].getPreferredSize().height); // Establecer posición y tamaño

            JLabel label = new JLabel(textos[i]);
            label.setBounds(x, y - 22, 200, 20); // Establecer la posición y el tamaño del JLabel
            label.setForeground(new Color(0, 0, 0));
            Font font = label.getFont();
            Font fontNueva = font.deriveFont(font.getSize() + 4.0f); // Aumentar en 2 puntos el tamaño de la fuente
            label.setFont(fontNueva);
            add(label);
            add(comboBoxes[i]); // Agregar al contenedor principal

            // Agregar opciones a las barras desplegables según el índice actual
            if (i == 0) {
                comboBoxes[i].addItem("Origen");
                for (String ciudad : listaCiudades) {
                    comboBoxes[i].addItem(ciudad);
                }
            } else if (i == 1) {
                comboBoxes[i].addItem("Destino");
                for (String ciudad : listaCiudades) {
                    comboBoxes[i].addItem(ciudad);
                }
            } else {
                comboBoxes[2].addItem("fecha");

                // Obtener la fecha actual
                LocalDate fechaActual = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                // Agregar los próximos 7 días a la barra desplegable
                for (int j = 0; j < 7; j++) {
                    LocalDate siguienteDia = fechaActual.plusDays(j);
                    String fechaFormateada = siguienteDia.format(formatter);
                    comboBoxes[2].addItem(fechaFormateada);
                }
            }
        }

        // Creación del botón y establecer sus coordenadas
        boton = new JButton("Buscar");
        int buttonX = 620;
        int buttonY = 398;
        boton.setBounds(buttonX, buttonY, 200, 30); // Establecer posición y tamaño
        panel1.add(boton);
        add(panel1); // Agregar al contenedor principal
    }

    // Método para establecer la lógica de selección en las barras desplegables y el botón de búsqueda
    public void BarrasSeleccion(){
        // Aquí se configura el evento para cuando se selecciona un elemento en la barra 1
        comboBoxes[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el índice seleccionado en la primera barra desplegable
                int selectedIndex = comboBoxes[0].getSelectedIndex();

                // Si se selecciona un elemento diferente al anteriormente seleccionado en la barra 1
                if (selectedIndex != indiceSeleccionadoBarra1) {
                    comboBoxes[1].removeAllItems(); // Eliminar todos los elementos de la barra 2

                    // Agregar todos los elementos de la listaCiudades a la barra 2 excepto el seleccionado en la barra 1
                    comboBoxes[1].addItem("Destino");
                    for (String ciudad : listaCiudades) {
                        // Si el índice de la ciudad no coincide con el índice seleccionado en la barra 1, agregarlo
                        if (listaCiudades.indexOf(ciudad) != selectedIndex - 1) {
                            comboBoxes[1].addItem(ciudad);
                        }
                    }

                    indiceSeleccionadoBarra1 = selectedIndex; // Actualizar el índice seleccionado en la barra 1
                }
            }
        });

        // Configurar evento para el botón de búsqueda
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndexBarra1 = comboBoxes[0].getSelectedIndex();
                int selectedIndexBarra2 = comboBoxes[1].getSelectedIndex();
                int selectedIndexBarra3 = comboBoxes[2].getSelectedIndex();

                // Verificar que se haya seleccionado una opción válida en todas las barras desplegables
                if (selectedIndexBarra1 > 0 && selectedIndexBarra2 > 0 && selectedIndexBarra3 > 0) {
                    origen = (String) comboBoxes[0].getSelectedItem();
                    destino = (String) comboBoxes[1].getSelectedItem();
                    fecha = (String) comboBoxes[2].getSelectedItem();
                    GuardaDatos.guardarDatosU(origen, destino, fecha); // Guardar los datos seleccionados
                    dispose(); // Cerrar la ventana actual

                    // Crear una nueva ventana para mostrar los resultados
                    pasajesgui = new PasajesGUI();
                    pasajesgui.ImplementarFiltro();
                    pasajesgui.mostrarDatos();
                    pasajesgui.setVisible(true); // Hacer visible la nueva ventana
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona un origen, destino y horario válidos");
                }
            }
        });
    }
}
