import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsientosSemiGUI extends AsientosGUI {
    private Asientos asientos;
    private Image imagenfondo1, imagen2;
    private JButton botonReserva;
    private JButton[] botonesAsiento = new JButton[40];
    private AsientosSemiGUI selfReference;

    // Constructor de la clase AsientosSemiGUI
    public AsientosSemiGUI() {
        selfReference = this; 
        asientos = new Asientos(); // Crear una instancia de la clase Asientos

        if(asientos.getSeleccionAsientos().size()<40) {
            // Crear la ventana de selección de asientos
            setTitle("Asientos");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int screenWidth = 1350;
            int screenHeight = 800;
            setSize(screenWidth, screenHeight);
            setResizable(false);
            setLocationRelativeTo(null);

            // Cargar y configurar la imagen de fondo de la ventana
            imagenfondo1 = new ImageIcon("src/dibujos/autobus3.png").getImage();
            imagenfondo1 = imagenfondo1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
            JLabel principal = new JLabel(new ImageIcon(imagenfondo1));
            setContentPane(principal);

            // Cargar y configurar la imagen del autobús doble en la ventana
            imagen2 = new ImageIcon("src/dibujos/bus4.png").getImage();
            imagen2 = imagen2.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
            JLabel busdoble = new JLabel(new ImageIcon(imagen2));
            busdoble.setBounds(550, 250, 450, 350);
            add(busdoble);

            // Crear y configurar los botones para los asientos
            for (int i = 0; i < 20; i++) {
                botonesAsiento[i] = new JButton();
                botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
                int posX = 240 + (i % 2) * 40; // Calcular la posición en X del botón
                int posY = 270 + (i / 2) * 40; // Calcular la posición en Y del botón
                botonesAsiento[i].setBounds(posX, posY, 30, 30);

                // Cargar y configurar la imagen del asiento disponible en el botón
                ImageIcon imagenAsiento = new ImageIcon("src/dibujos/AsientoDisp1.png");
                Image imagenAsientoEscalada = imagenAsiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                ImageIcon asientoListo = new ImageIcon(imagenAsientoEscalada);
                botonesAsiento[i].setIcon(asientoListo);

                add(botonesAsiento[i]);
            }

            for (int i = 20; i < 40; i++) {
                botonesAsiento[i] = new JButton();
                botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
                int posX = 360 + (i % 2) * 40; // Calcular la posición en X del botón
                int posY = 270 + ((i - 20) / 2) * 40; // Calcular la posición en Y del botón
                botonesAsiento[i].setBounds(posX, posY, 30, 30);

                // Cargar y configurar la imagen del asiento disponible en el botón
                ImageIcon imagenAsiento = new ImageIcon("src/dibujos/AsientoDisp1.png");
                Image imagenAsientoEscalada = imagenAsiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                ImageIcon asientoListo = new ImageIcon(imagenAsientoEscalada);
                botonesAsiento[i].setIcon(asientoListo);

                add(botonesAsiento[i]);
            }
        }
    }

    // Sobrescribir el método ElegirAsientos de la clase AsientosGUI para personalizar la selección de asientos
    @Override
    public void ElegirAsientos() {
        // Verificar si no hay asientos disponibles para comprar y mostrar un mensaje de advertencia
        if (asientos.getSeleccionAsientos().size() == 40) {
            JOptionPane.showMessageDialog(this, "No hay asientos disponibles para comprar.\nDebe escoger otro viaje.", "Advertencia", JOptionPane.WARNING_MESSAGE);

            // Cerrar la ventana actual y abrir la ventana PasajesGUI
            selfReference.dispose();
            PasajesGUI pasajesGUI = new PasajesGUI();
            pasajesGUI.ImplementarFiltro();
            pasajesGUI.mostrarDatos();
            pasajesGUI.setVisible(true);
        } else {
            // Si hay asientos disponibles, mostrar los asientos seleccionados y configurar los botones
            if (!asientos.getSeleccionAsientos().isEmpty()) {
                for (String asiento : asientos.getSeleccionAsientos()) {
                    for (int i = 0; i < botonesAsiento.length; i++) {
                        if (asiento.equals(asientos.valor_asiento(i))) {
                            // Cargar y configurar la imagen del asiento reservado en el botón
                            ImageIcon imagenAsientoSeleccionado = new ImageIcon("src/dibujos/AsientoResv.png");
                            Image imagenAsientoEscalada = imagenAsientoSeleccionado.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                            ImageIcon asientoSeleccionado = new ImageIcon(imagenAsientoEscalada);
                            botonesAsiento[i].setIcon(asientoSeleccionado);
                            break;
                        }
                    }
                }
            }

            // Configurar los botones para permitir la selección de asientos
            for (int i = 0; i < botonesAsiento.length; i++) {
                int finalI = i;
                botonesAsiento[i].addActionListener(new ActionListener() {
                    int click = 0;

                    @Override
                    public void actionPerformed(ActionEvent event) {
                        switch (click % 2) {
                            case 0:
                                // Cargar y configurar la imagen del asiento reservado en el botón
                                ImageIcon imagenAsiento2 = new ImageIcon("src/dibujos/AsientoResv.png");
                                Image imagenAsientoEscalada2 = imagenAsiento2.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                ImageIcon asientoListo2 = new ImageIcon(imagenAsientoEscalada2);
                                botonesAsiento[finalI].setIcon(asientoListo2);
                                asientos.addAsiento(finalI);
                                break;
                            case 1:
                                // Cargar y configurar la imagen del asiento disponible en el botón
                                ImageIcon imagenAsiento3 = new ImageIcon("src/dibujos/AsientoDisp2.png");
                                Image imagenAsientoEscalada3 = imagenAsiento3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                ImageIcon asientoListo3 = new ImageIcon(imagenAsientoEscalada3);
                                botonesAsiento[finalI].setIcon(asientoListo3);
                                asientos.eraseAsiento(finalI);
                                break;
                        }
                        click++;
                    }
                });
            }

            // Crear y configurar el botón de reserva
            botonReserva = new JButton("Reservar");
            botonReserva.setFont(botonReserva.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
            botonReserva.setBounds(700, 600, 100, 30);
            add(botonReserva);

            // Configurar el ActionListener para el botón de reserva
            botonReserva.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Verificar si se han seleccionado asientos para la reserva
                    if (!asientos.getSeleAsientos().isEmpty()) {
                        // Cerrar la ventana actual
                        dispose();

                        // Realizar la reserva de los asientos seleccionados
                        asientos.AsientosSeleccionados();
                        asientos.DatosParaReserva();

                        // Abrir la ventana ReservaGUI para mostrar los detalles de la reserva
                        ReservaGUI nuevaReserva = new ReservaGUI();
                        nuevaReserva.ImplementarFiltro();
                        nuevaReserva.MuestraReserva(asientos);
                        nuevaReserva.setVisible(true);
                    } else {
                        // Mostrar un mensaje de error si no se ha seleccionado ningún asiento
                        JOptionPane.showMessageDialog(AsientosSemiGUI.this, "Debe seleccionar al menos un asiento.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }
    }
}
