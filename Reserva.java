package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Reserva extends JFrame {

    Image imagenfondo1;
    private JPanel panel1;
    String desde,hasta,dia;
    private JButton botonReserva;

    private void mostrarDatos(List<DatosViaje> listaDatos) {

        int[] x = {300,550,300,550};
        int[] y = {300, 300, 330,330};
        int buttonX = 900;
        int buttonY = 315;

        JLabel[] labels = new JLabel[4];

        for (DatosViaje datosViaje : listaDatos) {
            String asientosSeleccionados=datosViaje.getDestino();

            labels[0]= new JLabel("Asientos reservados: " + asientosSeleccionados);

            for (int j = 0; j < 4; j++) {
                labels[j].setForeground(new Color(35, 35, 35)); // Color de fuente
                Font font = labels[j].getFont();
                Font fontNueva = font.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
                labels[j].setFont(fontNueva);
                labels[j].setBounds(x[j], y[j], 600, 30);
                add(labels[j]);
            }

            for(int i=0;i<4;i++){
                y[i]+=90;
            }

            buttonY += 90;
        }
    }

    public Reserva() {

        setTitle("Reserva");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        setSize(screenWidth, screenHeight);

        imagenfondo1 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\autobus3.png").getImage();
        imagenfondo1 = imagenfondo1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel principal = new JLabel(new ImageIcon(imagenfondo1));
        setContentPane(principal);

        panel1 = new JPanel();
        panel1.setBounds(850, 398, 200, 30);
        panel1.setOpaque(false);
    }

    public void agregaasieentos(Asientos asientos){
        ArrayList seleccionAsientos = asientos.getSeleccion();

        JLabel asientosSelecc = new JLabel(seleccionAsientos.toString());
        asientosSelecc.setForeground(new Color(35, 35, 35)); // Color de fuente
        Font font = asientosSelecc.getFont();
        Font fontNueva = font.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
        asientosSelecc.setFont(fontNueva);
        asientosSelecc.setBounds(95, 110, 100, 30);
        add(asientosSelecc);

    }
}
