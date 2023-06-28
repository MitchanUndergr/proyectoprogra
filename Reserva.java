package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Reserva extends JFrame {

    Image imagenfondo1;
    private JPanel panel1;
    String desde,hasta,dia;
    private JButton botonExit;

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

        botonExit = new JButton("Reservar");
        botonExit.setFont(botonExit.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonExit.setBounds(1100, 300, 100, 30);
        add(botonExit);
    }

    public void agregaasieentos(AsientosDob asientos){
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
