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
    public void agregaasieentosDob(AsientosDob asientos){
        ArrayList asie=asientos.getSeleccion();
        System.out.println(asie.get(0));
        System.out.println(asie.get(1));

    }

    public void agregaasieentos(Asientos asientos){
        asientos.getSeleccion();
        ArrayList asie=asientos.getSeleccion();
        System.out.println(asie.get(0));
        System.out.println(asie.get(1));asientos.getSeleccion().size();
        System.out.println(asientos.getSeleccion().size());


    }
    public void agregafiltro(Asientos asientos){
        dia=asientos.getDia();
        desde=asientos.getDesde();
        hasta=asientos.getHasta();

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

        JLabel[] labels = new JLabel[6];

        int calFinal= asientos.getSeleccion().size()*13000;
        int cantAsientos=asientos.getSeleccion().size();


        labels[0] = new JLabel("Origen: " + desde);
        labels[0].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[0].setFont(fontNueva);
        labels[0].setBounds(300, 300, 600, 30);
        add(labels[0]);

        labels[1]= new JLabel("Destino: " + hasta);
        labels[1].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[1].setFont(fontNueva);
        labels[1].setBounds(300, 350, 600, 30);
        add(labels[1]);

        labels[2]= new JLabel("Tipo de Asiento: " + "Semi Cama");
        labels[2].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[2].setFont(fontNueva);
        labels[2].setBounds(300, 400, 600, 30);
        add(labels[2]);

        labels[3]= new JLabel("Asientos : " + asientos.getSeleccion());
        labels[3].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[3].setFont(fontNueva);
        labels[3].setBounds(300, 450, 600, 30);
        add(labels[3]);

        labels[4]= new JLabel("Cantidad de asientos: " + cantAsientos + " x " + "13000");
        labels[4].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[4].setFont(fontNueva);
        labels[4].setBounds(300, 500, 600, 30);
        add(labels[4]);

        labels[5]= new JLabel("Precio final: " + calFinal);
        labels[5].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[5].setFont(fontNueva);
        labels[5].setBounds(300, 550, 600, 30);
        add(labels[5]);

    }

    public void agregafiltro(AsientosDob asientos){
        dia=asientos.getDia();
        desde=asientos.getDesde();
        hasta=asientos.getHasta();

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

        JLabel[] labels = new JLabel[6];

        int calFinal= asientos.getSeleccion().size()*21000;
        int cantAsientos=asientos.getSeleccion().size();


        labels[0] = new JLabel("Origen: " + desde);
        labels[0].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[0].setFont(fontNueva);
        labels[0].setBounds(300, 300, 600, 30);
        add(labels[0]);

        labels[1]= new JLabel("Destino: " + hasta);
        labels[1].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[1].setFont(fontNueva);
        labels[1].setBounds(300, 350, 600, 30);
        add(labels[1]);

        labels[2]= new JLabel("Tipo de Asiento: " + "Salon Cama");
        labels[2].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[2].setFont(fontNueva);
        labels[2].setBounds(300, 400, 600, 30);
        add(labels[2]);

        labels[3]= new JLabel("Asientos : " + asientos.getSeleccion());
        labels[3].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[3].setFont(fontNueva);
        labels[3].setBounds(300, 450, 600, 30);
        add(labels[3]);

        labels[4]= new JLabel("Cantidad de asientos: " + cantAsientos + " x " + "21000");
        labels[4].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[4].setFont(fontNueva);
        labels[4].setBounds(300, 500, 600, 30);
        add(labels[4]);

        labels[5]= new JLabel("Precio final: " + calFinal);
        labels[5].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[5].setFont(fontNueva);
        labels[5].setBounds(300, 550, 600, 30);
        add(labels[5]);

    }

}
