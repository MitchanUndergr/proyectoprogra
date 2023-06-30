import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AsientosDob extends JFrame {

    Image imagenfondo1,imagen2;
    String desde,hasta,dia;
    private JButton botonReserva;

    public ArrayList<String> seleAsientos=new ArrayList<>();
    private String[] vectorComposiciones;
    JButton[] botonesAsiento = new JButton[60];
    ArrayList<String> seleccionAsientos = new ArrayList<>();
    public AsientosDob() {

        vectorComposiciones = new String[60];
        int indice = 0;

        for (char letra = 'A'; letra <= 'F'; letra++) {
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

        imagen2 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/bus5.png").getImage();
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

        //Asientos


        for (int i = 0; i < botonesAsiento.length; i++) {
            botonesAsiento[i] = new JButton();
            botonesAsiento[i].setFont(botonesAsiento[i].getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón

            ImageIcon imagenAsiento = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/AsientoDisp1.png");
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

        x=360;
        y=300;
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

        x=540;
        y=300;
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

        x=660;
        y=300;
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



    public void elegirdob(){
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
                            seleccionAsientos.add(vectorComposiciones[finalI1]);
                            seleAsientos.add(vectorComposiciones[finalI1]);
                            break;
                        case 1:
                            ImageIcon imagenasiento3 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/AsientoDisp2.png");
                            Image imagenasie3 = imagenasiento3.getImage();
                            Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                            ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                            botonesAsiento[finalI].setIcon(asientolisto3);
                            seleccionAsientos.remove(vectorComposiciones[finalI1]);
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
        botonReserva.setBounds(900, 600, 100, 30);
        add(botonReserva);

        botonReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!seleccionAsientos.isEmpty()) {
                    dispose();
                    Reserva nuevareserva = new Reserva();
                    ArrayList<String> asiento=nuevareserva.agregaasieentosDob(AsientosDob.this);
                    nuevareserva.arrayasientodob=asiento;
                    nuevareserva.agregafiltroDob(AsientosDob.this);
                    nuevareserva.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(AsientosDob.this, "Debe seleccionar al menos un asiento.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
    public ArrayList getSeleccion() {
        return seleccionAsientos;
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



