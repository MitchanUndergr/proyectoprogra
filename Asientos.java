import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Asientos extends JFrame {

    Image imagenfondo1,imagen2;
    String desde,hasta,dia;
    private JButton botonReserva;
    private JButton[] botonesAsiento = new JButton[40];

    private String[] vectorComposiciones;

    public void agregarContenido(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
        for (String elemento : arrayList1) {
            arrayList2.add(elemento);
        }
    }
    public ArrayList<String> seleccionAsientos;
    public ArrayList<String> seleAsientos=new ArrayList<>();

    public Asientos() {
        vectorComposiciones = new String[40];
        int indice = 0;

        for (char letra = 'A'; letra <= 'D'; letra++) {
            // Iterar sobre los números del 1 al 11
            for (int numero = 1; numero <= 10; numero++) {
                // Combinar la letra y el número en una composición
                String composicion = letra + Integer.toString(numero);
                // Agregar la composición al vector
                vectorComposiciones[indice] = composicion;
                indice++;
            }
        }

        setTitle("Asientos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Configurar el tamaño de la ventana para ocupar toda la pantalla
        setSize(screenWidth, screenHeight);

        imagenfondo1 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/autobus3.png").getImage();
        imagenfondo1 = imagenfondo1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel principal = new JLabel(new ImageIcon(imagenfondo1));
        setContentPane(principal);

        imagen2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/bus4.png").getImage();
        imagen2 = imagen2.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        JLabel busdoble = new JLabel(new ImageIcon(imagen2));
        busdoble.setBounds(550, 250, 450, 350);
        add(busdoble);

        //Asientos

         // Crear un vector de botones con tamaño 36

        for (int i = 0; i < 20; i++) {
            botonesAsiento[i] = new JButton();
            botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
            int posX = 240 + (i % 2) * 40; // Calcular la posición en X del botón
            int posY = 270 + (i / 2) * 40; // Calcular la posición en Y del botón
            botonesAsiento[i].setBounds(posX, posY, 30, 30);

            ImageIcon imagenAsiento = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/AsientoDisp1.png");
            Image imagenAsientoEscalada = imagenAsiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            ImageIcon asientoListo = new ImageIcon(imagenAsientoEscalada);
            botonesAsiento[i].setIcon(asientoListo);

            add(botonesAsiento[i]);
        }

        for (int i = 20; i < 40; i++) {
            botonesAsiento[i] = new JButton();
            botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
            int posX = 360 + (i % 2) * 40; // Calcular la posición en X del botón
            int posY = 270 + ((i-20) / 2) * 40; // Calcular la posición en Y del botón
            botonesAsiento[i].setBounds(posX, posY, 30, 30);

            ImageIcon imagenAsiento = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/AsientoDisp1.png");
            Image imagenAsientoEscalada = imagenAsiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            ImageIcon asientoListo = new ImageIcon(imagenAsientoEscalada);
            botonesAsiento[i].setIcon(asientoListo);

            add(botonesAsiento[i]);
        }
    }

    public void elegir(){

        if(seleccionAsientos==null){
            seleccionAsientos=new ArrayList<>();
        }else{
            for (String asiento : seleccionAsientos) {
                for (int i = 0; i < botonesAsiento.length; i++) {
                    if (asiento.equals(vectorComposiciones[i])) {
                        ImageIcon imagenAsientoSeleccionado = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/AsientoResv.png");
                        Image imagenAsientoEscalada = imagenAsientoSeleccionado.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientoSeleccionado = new ImageIcon(imagenAsientoEscalada);
                        botonesAsiento[i].setIcon(asientoSeleccionado);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < botonesAsiento.length; i++) {
            int finalI = i;
            int finalI1 = i;
            botonesAsiento[i].addActionListener(new ActionListener() {
                int click = 0;

                @Override
                public void actionPerformed(ActionEvent event) {
                    switch (click % 2) {
                        case 0:
                            ImageIcon imagenasiento2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/AsientoResv.png");
                            Image imagenasie2 = imagenasiento2.getImage();
                            Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                            ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                            botonesAsiento[finalI].setIcon(asientolisto2);
                            //seleccionAsientos.add(vectorComposiciones[finalI1]);
                            seleAsientos.add(vectorComposiciones[finalI1]);
                            break;
                        case 1:
                            ImageIcon imagenasiento3 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/AsientoDisp2.png");
                            Image imagenasie3 = imagenasiento3.getImage();
                            Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                            ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                            botonesAsiento[finalI].setIcon(asientolisto3);
                            //seleccionAsientos.remove(vectorComposiciones[finalI1]);
                            seleAsientos.remove(vectorComposiciones[finalI1]);
                            break;
                    }
                    click++;
                }
            });
        }

    }

    public void agregafiltro(Pasajes pasaje){
        dia=pasaje.getDia();
        desde=pasaje.getDesde();
        hasta=pasaje.getHasta();

        JLabel origen1 = new JLabel(desde);
        origen1.setForeground(new Color(35, 35, 35)); // Color de fuente
        Font font = origen1.getFont();
        Font fontNueva = font.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
        origen1.setFont(fontNueva);
        origen1.setBounds(95, 110, 100, 30);
        add(origen1);

        JLabel destino = new JLabel(hasta);
        destino.setForeground(new Color(35, 35, 35)); // Color de fuente
        Font font2 = destino.getFont();
        Font fontNueva2 = font2.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
        destino.setFont(fontNueva2);
        destino.setBounds(285, 110, 100, 30);
        add(destino);

        JLabel fecha = new JLabel(dia);
        fecha.setForeground(new Color(35, 35, 35)); // Color de fuente
        Font font3 = fecha.getFont();
        Font fontNueva3 = font3.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
        fecha.setFont(fontNueva3);
        fecha.setBounds(470, 110, 100, 30);
        add(fecha);

        botonReserva = new JButton("Reservar");
        botonReserva.setFont(botonReserva.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonReserva.setBounds(700, 600, 100, 30);
        add(botonReserva);

        botonReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!seleAsientos.isEmpty()) {
                    dispose();
                    agregarContenido(seleAsientos,seleccionAsientos);
                    Reserva nuevareserva = new Reserva();
                    ArrayList<String> asiento=nuevareserva.agregaasieentos(Asientos.this);
                    nuevareserva.arrayasientos=asiento;
                    nuevareserva.agregafiltro(Asientos.this);
                    nuevareserva.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(Asientos.this, "Debe seleccionar al menos un asiento.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public ArrayList<String> getSeleccion() {
        return seleccionAsientos;
    }

    public ArrayList<String> getSeleAsientos() {
        return seleAsientos;
    }

    public String getDia() {
        return dia;
    }

    public String getDesde() {
        return desde;
    }

    public String getHasta() {
        return hasta;
    }

}
