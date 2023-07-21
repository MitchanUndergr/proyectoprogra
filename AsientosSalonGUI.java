import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsientosSalonGUI extends AsientosGUI {
    private Asientos asientos;
    private Image imagenfondo1, imagen2;
    private JButton botonReserva;
    private JButton[] botonesAsiento = new JButton[60];
    private AsientosSalonGUI selfReference;

    public AsientosSalonGUI() {
        // Constructor de la clase AsientosSalonGUI
        asientos = new Asientos(); // Crear una instancia de la clase Asientos
        selfReference = this; // Referencia a la propia instancia para utilizarla dentro de ActionListener


        if(asientos.getSeleccionAsientosdob().size()<60) {
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

            // Cargar y configurar la imagen del autobús doble piso en la ventana
            imagen2 = new ImageIcon("src/dibujos/bus5.png").getImage();
            imagen2 = imagen2.getScaledInstance(300, 250, Image.SCALE_SMOOTH);
            JLabel busdoble = new JLabel(new ImageIcon(imagen2));
            busdoble.setBounds(800, 300, 300, 250);
            add(busdoble);

            // Crear y configurar etiquetas de texto para indicar el piso de los asientos
            JLabel texto1 = new JLabel("Piso 2");
            texto1.setForeground(new Color(35, 35, 35)); // Color de fuente
            Font font = texto1.getFont();
            Font fontNueva3 = font.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
            texto1.setFont(fontNueva3);
            texto1.setBounds(270, 250, 100, 30);
            add(texto1);

            JLabel texto2 = new JLabel("Piso 1");
            texto2.setForeground(new Color(35, 35, 35)); // Color de fuente
            Font font2 = texto2.getFont();
            Font fontNueva2 = font2.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
            texto2.setFont(fontNueva2);
            texto2.setBounds(600, 250, 100, 30);
            add(texto2);

            // Crear y configurar los botones para los asientos
            for (int i = 0; i < botonesAsiento.length; i++) {
                botonesAsiento[i] = new JButton();
                botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón

                // Cargar y configurar la imagen del asiento disponible en el botón
                ImageIcon imagenAsiento = new ImageIcon("src/dibujos/AsientoDisp1.png");
                Image imagenAsientoEscalada = imagenAsiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                ImageIcon asientoListo = new ImageIcon(imagenAsientoEscalada);
                botonesAsiento[i].setIcon(asientoListo);

                add(botonesAsiento[i]);
            }

            // Posicionar los botones de los asientos en sus respectivas ubicaciones según el piso
            int x = 240;
            int y = 300;

            for (int i = 0; i < 18; i++) {
                botonesAsiento[i].setBounds(x, y, 30, 30);

                // Actualizar las coordenadas x e y para el siguiente botón
                if (i % 2 == 1) {
                    x = 240;
                    y += 40;
                } else {
                    x += 40;
                }
            }

            x = 360;
            y = 300;
            for (int i = 18; i < 36; i++) {
                botonesAsiento[i].setBounds(x, y, 30, 30);

                // Actualizar las coordenadas x e y para el siguiente botón
                if (i % 2 == 1) {
                    x = 360;
                    y += 40;
                } else {
                    x += 40;
                }
            }

            x = 540;
            y = 300;
            for (int i = 36; i < 48; i++) {
                botonesAsiento[i].setBounds(x, y, 30, 30);

                // Actualizar las coordenadas x e y para el siguiente botón
                if (i % 2 == 1) {
                    x = 540;
                    y += 40;
                } else {
                    x += 40;
                }
            }

            x = 660;
            y = 300;
            for (int i = 48; i < 60; i++) {
                botonesAsiento[i].setBounds(x, y, 30, 30);

                // Actualizar las coordenadas x e y para el siguiente botón
                if (i % 2 == 1) {
                    x = 660;
                    y += 40;
                } else {
                    x += 40;
                }
            }
        }
    }

    // Sobrescribir el método ElegirAsientos de la clase AsientosGUI para personalizar la selección de asientos
    @Override
    public void ElegirAsientos() {
        // Verificar si no hay asientos disponibles para comprar y mostrar un mensaje de advertencia
        if (asientos.getSeleccionAsientosdob().size() == 60) {
            JOptionPane.showMessageDialog(this, "No hay asientos disponibles para comprar.\nDebe escoger otro viaje.", "Advertencia", JOptionPane.WARNING_MESSAGE);

            // Cerrar la ventana actual y abrir la ventana PasajesGUI
            selfReference.dispose();
            PasajesGUI pasajesGUI = new PasajesGUI();
            pasajesGUI.ImplementarFiltro();
            pasajesGUI.mostrarDatos();
            pasajesGUI.setVisible(true);
        } else {
            // Si hay asientos disponibles, mostrar los asientos seleccionados y configurar los botones
            if (!asientos.getSeleccionAsientosdob().isEmpty()) {
                for (String asiento : asientos.getSeleccionAsientosdob()) {
                    for (int i = 0; i < botonesAsiento.length; i++) {
                        if (asiento.equals(asientos.valor_asientodob(i))) {
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

            // Configurar los ActionListener para los botones de los asientos
            for (int i = 0; i < botonesAsiento.length; i++) {
                int finalI = i;
                botonesAsiento[i].addActionListener(new ActionListener() {
                    int click = 0;

                    @Override
                    public void actionPerformed(ActionEvent event) {
                        switch (click % 2) {
                            case 0:
                                // Cargar y configurar la imagen del asiento reservado en el botón
                                ImageIcon imagenasiento2 = new ImageIcon("src/dibujos/AsientoResv.png");
                                Image imagenasie2 = imagenasiento2.getImage();
                                Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                                botonesAsiento[finalI].setIcon(asientolisto2);
                                asientos.addAsientodob(finalI);
                                break;
                            case 1:
                                // Cargar y configurar la imagen del asiento disponible en el botón
                                ImageIcon imagenasiento3 = new ImageIcon("src/dibujos/AsientoDisp2.png");
                                Image imagenasie3 = imagenasiento3.getImage();
                                Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                                botonesAsiento[finalI].setIcon(asientolisto3);
                                asientos.eraseAsientodob(finalI);
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
                    if (!asientos.getSeleasientosdob().isEmpty()) {
                        // Cerrar la ventana actual
                        dispose();

                        // Realizar la reserva de los asientos seleccionados
                        asientos.AsientosSeleccionadosDob();
                        asientos.DatosParaReservaDob();

                        // Abrir la ventana ReservaGUI para mostrar los detalles de la reserva
                        ReservaGUI nuevareserva = new ReservaGUI();
                        nuevareserva.ImplementarFiltro();
                        nuevareserva.MuestraReserva(asientos);
                        nuevareserva.setVisible(true);
                    } else {
                        // Mostrar un mensaje de error si no se ha seleccionado ningún asiento
                        JOptionPane.showMessageDialog(AsientosSalonGUI.this, "Debe seleccionar al menos un asiento.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }
    }
}
