import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AsientosSemiGUI extends AsientosGUI {
    private Asientos asientos;
    private Image imagenfondo1,imagen2;
    private JButton botonReserva;
    private JButton[] botonesAsiento = new JButton[40];
    private AsientosSemiGUI selfReference;
    public AsientosSemiGUI() {

        selfReference=this;
        asientos= new Asientos();
        if(asientos.getSeleccionAsientos().size()<40) {
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

            imagen2 = new ImageIcon("src/dibujos/bus4.png").getImage();
            imagen2 = imagen2.getScaledInstance(450, 350, Image.SCALE_SMOOTH);
            JLabel busdoble = new JLabel(new ImageIcon(imagen2));
            busdoble.setBounds(550, 250, 450, 350);
            add(busdoble);


            for (int i = 0; i < 20; i++) {
                botonesAsiento[i] = new JButton();
                botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
                int posX = 240 + (i % 2) * 40; // Calcular la posición en X del botón
                int posY = 270 + (i / 2) * 40; // Calcular la posición en Y del botón
                botonesAsiento[i].setBounds(posX, posY, 30, 30);

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

                ImageIcon imagenAsiento = new ImageIcon("src/dibujos/AsientoDisp1.png");
                Image imagenAsientoEscalada = imagenAsiento.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                ImageIcon asientoListo = new ImageIcon(imagenAsientoEscalada);
                botonesAsiento[i].setIcon(asientoListo);

                add(botonesAsiento[i]);
            }
        }
    }

    @Override
    public void ElegirAsientos() {

        if (asientos.getSeleccionAsientos().size() == 40) {
            JOptionPane.showMessageDialog(this, "No hay asientos disponibles para comprar.\nDebe escoger otro viaje.", "Advertencia", JOptionPane.WARNING_MESSAGE);

            selfReference.dispose();
            // Abrir la ventana PasajesGUI
            PasajesGUI pasajesGUI = new PasajesGUI();
            pasajesGUI.ImplementarFiltro();
            pasajesGUI.mostrarDatos();
            pasajesGUI.setVisible(true);
        } else {
            if (!asientos.getSeleccionAsientos().isEmpty()) {
                for (String asiento : asientos.getSeleccionAsientos()) {
                    for (int i = 0; i < botonesAsiento.length; i++) {
                        if (asiento.equals(asientos.valor_asiento(i))) {
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
                                asientos.addAsiento(finalI1);
                                break;
                            case 1:
                                ImageIcon imagenasiento3 = new ImageIcon("src/dibujos/AsientoDisp2.png");
                                Image imagenasie3 = imagenasiento3.getImage();
                                Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                                botonesAsiento[finalI].setIcon(asientolisto3);
                                asientos.eraseAsiento(finalI1);
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
                    if (!asientos.getSeleAsientos().isEmpty()) {
                        dispose();
                        asientos.AsientosSeleccionados();
                        asientos.DatosParaReserva();

                        ReservaGUI nuevareserva = new ReservaGUI();
                        nuevareserva.ImplementarFiltro();
                        nuevareserva.MuestraReserva(asientos);
                        nuevareserva.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(AsientosSemiGUI.this, "Debe seleccionar al menos un asiento.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }
    }
}