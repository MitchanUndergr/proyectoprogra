import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsientosSalonGUI extends AsientosGUI {
    private Asientos asientos;
    private Image imagenfondo1,imagen2;
    private JButton botonReserva;
    private JButton[] botonesAsiento = new JButton[60];
    private AsientosSalonGUI selfReference;
    public AsientosSalonGUI() {

        asientos= new Asientos();
        selfReference=this;

        if(asientos.getSeleccionAsientosdob().size()<60) {
            setTitle("Asientos");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int screenWidth = 1350;
            int screenHeight = 800;
            setSize(screenWidth, screenHeight);
            setResizable(false);
            setLocationRelativeTo(null);

            imagenfondo1 = new ImageIcon("src/dibujos/autobus3.png").getImage();
            imagenfondo1 = imagenfondo1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
            JLabel principal = new JLabel(new ImageIcon(imagenfondo1));
            setContentPane(principal);

            imagen2 = new ImageIcon("src/dibujos/bus5.png").getImage();
            imagen2 = imagen2.getScaledInstance(300, 250, Image.SCALE_SMOOTH);
            JLabel busdoble = new JLabel(new ImageIcon(imagen2));
            busdoble.setBounds(800, 300, 300, 250);
            add(busdoble);

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


            for (int i = 0; i < botonesAsiento.length; i++) {
                botonesAsiento[i] = new JButton();
                botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón

                ImageIcon imagenAsiento = new ImageIcon("src/dibujos/AsientoDisp1.png");
                Image imagenAsientoEscalada = imagenAsiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                ImageIcon asientoListo = new ImageIcon(imagenAsientoEscalada);
                botonesAsiento[i].setIcon(asientoListo);

                add(botonesAsiento[i]);
            }


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

    @Override
    public void ElegirAsientos(){

        if(asientos.getSeleccionAsientosdob().size()==60){
            JOptionPane.showMessageDialog(this, "No hay asientos disponibles para comprar.\nDebe escoger otro viaje.", "Advertencia", JOptionPane.WARNING_MESSAGE);

            // Cerrar la ventana AsientosGUI
            selfReference.dispose();

            // Abrir la ventana PasajesGUI
            PasajesGUI pasajesGUI = new PasajesGUI();
            pasajesGUI.ImplementarFiltro();
            pasajesGUI.mostrarDatos();
            pasajesGUI.setVisible(true);
        }
        else {

            if(!asientos.getSeleccionAsientosdob().isEmpty()) {
                for (String asiento : asientos.getSeleccionAsientosdob()) {
                    for (int i = 0; i < botonesAsiento.length; i++) {
                        if (asiento.equals(asientos.valor_asientodob(i))) {
                            ImageIcon imagenAsientoSeleccionado = new ImageIcon("src/dibujos/AsientoResv.png");
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
                                ImageIcon imagenasiento2 = new ImageIcon("src/dibujos/AsientoResv.png");
                                Image imagenasie2 = imagenasiento2.getImage();
                                Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                                botonesAsiento[finalI].setIcon(asientolisto2);
                                asientos.addAsientodob(finalI1);
                                break;
                            case 1:
                                ImageIcon imagenasiento3 = new ImageIcon("src/dibujos/AsientoDisp2.png");
                                Image imagenasie3 = imagenasiento3.getImage();
                                Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                                botonesAsiento[finalI].setIcon(asientolisto3);
                                asientos.eraseAsientodob(finalI1);
                                break;
                        }
                        click++;
                    }
                });
            }

            botonReserva = new JButton("Reservar");
            botonReserva.setFont(botonReserva.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
            botonReserva.setBounds(700, 600, 100, 30);
            add(botonReserva);

            botonReserva.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!asientos.getSeleasientosdob().isEmpty()) {
                        dispose();
                        asientos.AsientosSeleccionadosDob();
                        asientos.DatosParaReservaDob();

                        ReservaGUI nuevareserva = new ReservaGUI();
                        nuevareserva.ImplementarFiltro();
                        nuevareserva.MuestraReserva(asientos);
                        nuevareserva.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(AsientosSalonGUI.this, "Debe seleccionar al menos un asiento.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }
    }
}