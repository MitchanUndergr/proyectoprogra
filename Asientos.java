package org.example;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Asientos extends JFrame {

    Image imagenfondo1;
    String desde,hasta,dia;
    private JButton botonReserva, botonAsiento1, botonAsiento2,botonAsiento3,botonAsiento4,botonAsiento5,botonAsiento6,botonAsiento7,botonAsiento8;
    private JButton botonAsiento9, botonAsiento10,botonAsiento11,botonAsiento12,botonAsiento13,botonAsiento14,botonAsiento15,botonAsiento16;
    private JButton botonAsiento17, botonAsiento18,botonAsiento19,botonAsiento20,botonAsiento21,botonAsiento22,botonAsiento23,botonAsiento24;
    private JButton botonAsiento25, botonAsiento26,botonAsiento27,botonAsiento28,botonAsiento29,botonAsiento30,botonAsiento31,botonAsiento32;
    private JButton botonAsiento40, botonAsiento33,botonAsiento34,botonAsiento35,botonAsiento36,botonAsiento37,botonAsiento38,botonAsiento39;
    private JButton botonAsiento41, botonAsiento42,botonAsiento43,botonAsiento44;
    ArrayList<String> seleccionAsientos = new ArrayList<>();
    public Asientos() {
        setTitle("Asientos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Configurar el tamaño de la ventana para ocupar toda la pantalla
        setSize(screenWidth, screenHeight);

        imagenfondo1 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\autobus3.png").getImage();
        imagenfondo1 = imagenfondo1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel principal = new JLabel(new ImageIcon(imagenfondo1));
        setContentPane(principal);

        //Asientos

        botonAsiento1 = new JButton();
        botonAsiento1.setFont(botonAsiento1.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento1.setBounds(240, 300, 30, 30);
        ImageIcon imagenasiento1 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp1.png");
        Image imagenasie1 = imagenasiento1.getImage();
        Image nuevoasiento1 = imagenasie1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon asientolisto1= new ImageIcon(nuevoasiento1);
        botonAsiento1.setIcon(asientolisto1);
        add(botonAsiento1);

        botonAsiento2 = new JButton();
        botonAsiento2.setFont(botonAsiento2.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento2.setBounds(280, 300, 30, 30);
        botonAsiento2.setIcon(asientolisto1);
        add(botonAsiento2);

        botonAsiento3 = new JButton();
        botonAsiento3.setFont(botonAsiento3.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento3.setBounds(370, 300, 30, 30);
        botonAsiento3.setIcon(asientolisto1);
        add(botonAsiento3);

        botonAsiento4 = new JButton();
        botonAsiento4.setFont(botonAsiento4.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento4.setBounds(410, 300, 30, 30);
        botonAsiento4.setIcon(asientolisto1);
        add(botonAsiento4);



        botonAsiento5 = new JButton();
        botonAsiento5.setFont(botonAsiento5.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento5.setBounds(240, 340, 30, 30);
        botonAsiento5.setIcon(asientolisto1);
        add(botonAsiento5);

        botonAsiento6 = new JButton();
        botonAsiento6.setFont(botonAsiento6.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento6.setBounds(280, 340, 30, 30);
        botonAsiento6.setIcon(asientolisto1);
        add(botonAsiento6);

        botonAsiento7 = new JButton();
        botonAsiento7.setFont(botonAsiento7.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento7.setBounds(370, 340, 30, 30);
        botonAsiento7.setIcon(asientolisto1);
        add(botonAsiento7);

        botonAsiento8 = new JButton();
        botonAsiento8.setFont(botonAsiento8.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento8.setBounds(410, 340, 30, 30);
        botonAsiento8.setIcon(asientolisto1);
        add(botonAsiento8);



        botonAsiento9 = new JButton();
        botonAsiento9.setFont(botonAsiento9.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento9.setBounds(240, 380, 30, 30);
        botonAsiento9.setIcon(asientolisto1);
        add(botonAsiento9);

        botonAsiento10 = new JButton();
        botonAsiento10.setFont(botonAsiento10.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento10.setBounds(280, 380, 30, 30);
        botonAsiento10.setIcon(asientolisto1);
        add(botonAsiento10);

        botonAsiento11 = new JButton();
        botonAsiento11.setFont(botonAsiento11.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento11.setBounds(370, 380, 30, 30);
        botonAsiento11.setIcon(asientolisto1);
        add(botonAsiento11);

        botonAsiento12 = new JButton();
        botonAsiento12.setFont(botonAsiento12.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento12.setBounds(410, 380, 30, 30);
        botonAsiento12.setIcon(asientolisto1);
        add(botonAsiento12);



        botonAsiento13 = new JButton();
        botonAsiento13.setFont(botonAsiento13.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento13.setBounds(240, 420, 30, 30);
        botonAsiento13.setIcon(asientolisto1);
        add(botonAsiento13);

        botonAsiento14 = new JButton();
        botonAsiento14.setFont(botonAsiento14.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento14.setBounds(280, 420, 30, 30);
        botonAsiento14.setIcon(asientolisto1);
        add(botonAsiento14);

        botonAsiento15 = new JButton();
        botonAsiento15.setFont(botonAsiento15.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento15.setBounds(370, 420, 30, 30);
        botonAsiento15.setIcon(asientolisto1);
        add(botonAsiento15);

        botonAsiento16 = new JButton();
        botonAsiento16.setFont(botonAsiento16.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento16.setBounds(410, 420, 30, 30);
        botonAsiento16.setIcon(asientolisto1);
        add(botonAsiento16);



        botonAsiento17 = new JButton();
        botonAsiento17.setFont(botonAsiento17.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento17.setBounds(240, 460, 30, 30);
        botonAsiento17.setIcon(asientolisto1);
        add(botonAsiento17);

        botonAsiento18 = new JButton();
        botonAsiento18.setFont(botonAsiento18.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento18.setBounds(280, 460, 30, 30);
        botonAsiento18.setIcon(asientolisto1);
        add(botonAsiento18);

        botonAsiento19 = new JButton();
        botonAsiento19.setFont(botonAsiento19.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento19.setBounds(370, 460, 30, 30);
        botonAsiento19.setIcon(asientolisto1);
        add(botonAsiento19);

        botonAsiento20 = new JButton();
        botonAsiento20.setFont(botonAsiento20.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento20.setBounds(410, 460, 30, 30);
        botonAsiento20.setIcon(asientolisto1);
        add(botonAsiento20);




        botonAsiento21 = new JButton();
        botonAsiento21.setFont(botonAsiento21.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento21.setBounds(240, 500, 30, 30);
        botonAsiento21.setIcon(asientolisto1);
        add(botonAsiento21);

        botonAsiento22 = new JButton();
        botonAsiento22.setFont(botonAsiento22.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento22.setBounds(280, 500, 30, 30);
        botonAsiento22.setIcon(asientolisto1);
        add(botonAsiento22);

        botonAsiento23 = new JButton();
        botonAsiento23.setFont(botonAsiento23.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento23.setBounds(370, 500, 30, 30);
        botonAsiento23.setIcon(asientolisto1);
        add(botonAsiento23);

        botonAsiento24 = new JButton();
        botonAsiento24.setFont(botonAsiento24.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento24.setBounds(410, 500, 30, 30);
        botonAsiento24.setIcon(asientolisto1);
        add(botonAsiento24);




        botonAsiento25 = new JButton();
        botonAsiento25.setFont(botonAsiento25.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento25.setBounds(240, 540, 30, 30);
        botonAsiento25.setIcon(asientolisto1);
        add(botonAsiento25);

        botonAsiento26 = new JButton();
        botonAsiento26.setFont(botonAsiento26.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento26.setBounds(280, 540, 30, 30);
        botonAsiento26.setIcon(asientolisto1);
        add(botonAsiento26);

        botonAsiento27 = new JButton();
        botonAsiento27.setFont(botonAsiento27.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento27.setBounds(370, 540, 30, 30);
        botonAsiento27.setIcon(asientolisto1);
        add(botonAsiento27);

        botonAsiento28 = new JButton();
        botonAsiento28.setFont(botonAsiento28.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento28.setBounds(410, 540, 30, 30);
        botonAsiento28.setIcon(asientolisto1);
        add(botonAsiento28);





        botonAsiento29 = new JButton();
        botonAsiento29.setFont(botonAsiento29.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento29.setBounds(240, 580, 30, 30);
        botonAsiento29.setIcon(asientolisto1);
        add(botonAsiento29);

        botonAsiento30 = new JButton();
        botonAsiento30.setFont(botonAsiento30.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento30.setBounds(280, 580, 30, 30);
        botonAsiento30.setIcon(asientolisto1);
        add(botonAsiento30);

        botonAsiento31 = new JButton();
        botonAsiento31.setFont(botonAsiento31.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento31.setBounds(370, 580, 30, 30);
        botonAsiento31.setIcon(asientolisto1);
        add(botonAsiento31);

        botonAsiento32 = new JButton();
        botonAsiento32.setFont(botonAsiento32.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento32.setBounds(410, 580, 30, 30);
        botonAsiento32.setIcon(asientolisto1);
        add(botonAsiento32);




        botonAsiento33 = new JButton();
        botonAsiento33.setFont(botonAsiento33.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento33.setBounds(240, 620, 30, 30);
        botonAsiento33.setIcon(asientolisto1);
        add(botonAsiento33);

        botonAsiento34 = new JButton();
        botonAsiento34.setFont(botonAsiento34.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento34.setBounds(280, 620, 30, 30);
        botonAsiento34.setIcon(asientolisto1);
        add(botonAsiento34);

        botonAsiento35 = new JButton();
        botonAsiento35.setFont(botonAsiento35.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento35.setBounds(370, 620, 30, 30);
        botonAsiento35.setIcon(asientolisto1);
        add(botonAsiento35);

        botonAsiento36 = new JButton();
        botonAsiento36.setFont(botonAsiento36.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento36.setBounds(410, 620, 30, 30);
        botonAsiento36.setIcon(asientolisto1);
        add(botonAsiento36);




        botonAsiento37 = new JButton();
        botonAsiento37.setFont(botonAsiento37.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento37.setBounds(240, 660, 30, 30);
        botonAsiento37.setIcon(asientolisto1);
        add(botonAsiento37);

        botonAsiento38 = new JButton();
        botonAsiento38.setFont(botonAsiento38.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento38.setBounds(280, 660, 30, 30);
        botonAsiento38.setIcon(asientolisto1);
        add(botonAsiento38);

        botonAsiento39 =new JButton();
        botonAsiento39.setFont(botonAsiento39.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento39.setBounds(370, 660, 30, 30);
        botonAsiento39.setIcon(asientolisto1);
        add(botonAsiento39);

        botonAsiento40 = new JButton();
        botonAsiento40.setFont(botonAsiento40.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento40.setBounds(410, 660, 30, 30);
        botonAsiento40.setIcon(asientolisto1);
        add(botonAsiento40);



        botonAsiento41 = new JButton();
        botonAsiento41.setFont(botonAsiento41.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento41.setBounds(240, 700, 30, 30);
        botonAsiento41.setIcon(asientolisto1);
        add(botonAsiento41);

        botonAsiento42 = new JButton();
        botonAsiento42.setFont(botonAsiento42.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento42.setBounds(280, 700, 30, 30);
        botonAsiento42.setIcon(asientolisto1);
        add(botonAsiento42);

        botonAsiento43 = new JButton();
        botonAsiento43.setFont(botonAsiento43.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento43.setBounds(370, 700, 30, 30);
        botonAsiento43.setIcon(asientolisto1);
        add(botonAsiento43);

        botonAsiento44 = new JButton();
        botonAsiento44.setFont(botonAsiento44.getFont().deriveFont(Font.PLAIN)); // Cambiar el estilo de fuente del botón
        botonAsiento44.setBounds(410, 700, 30, 30);
        botonAsiento44.setIcon(asientolisto1);
        add(botonAsiento44);


        botonAsiento1.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento1.setIcon(asientolisto2);
                        seleccionAsientos.add("A1");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento1.setIcon(asientolisto3);
                        seleccionAsientos.remove("A1");
                        break;
                }
                click++;
            }
        });

        botonAsiento2.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento2.setIcon(asientolisto2);
                        seleccionAsientos.add("B2");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento2.setIcon(asientolisto3);
                        seleccionAsientos.remove("B2");
                        break;
                }
                click++;
            }
        });
        botonAsiento3.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento3.setIcon(asientolisto2);
                        seleccionAsientos.add("C3");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento3.setIcon(asientolisto3);
                        seleccionAsientos.remove("C3");
                        break;
                }
                click++;
            }
        });

        botonAsiento4.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento4.setIcon(asientolisto2);
                        seleccionAsientos.add("D4");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento4.setIcon(asientolisto3);
                        seleccionAsientos.remove("D4");
                        break;
                }
                click++;
            }
        });

        botonAsiento5.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento5.setIcon(asientolisto2);
                        seleccionAsientos.add("A5");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento5.setIcon(asientolisto3);
                        seleccionAsientos.remove("A5");
                        break;
                }
                click++;
            }
        });

        botonAsiento6.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento6.setIcon(asientolisto2);
                        seleccionAsientos.add("B6");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento6.setIcon(asientolisto3);
                        seleccionAsientos.remove("B6");
                        break;
                }
                click++;
            }
        });

        botonAsiento7.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento7.setIcon(asientolisto2);
                        seleccionAsientos.add("C7");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento7.setIcon(asientolisto3);
                        seleccionAsientos.remove("C7");
                        break;
                }
                click++;
            }
        });

        botonAsiento8.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento8.setIcon(asientolisto2);
                        seleccionAsientos.add("D8");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento8.setIcon(asientolisto3);
                        seleccionAsientos.remove("D8");
                        break;
                }
                click++;
            }
        });

        botonAsiento9.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento9.setIcon(asientolisto2);
                        seleccionAsientos.add("A9");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento9.setIcon(asientolisto3);
                        seleccionAsientos.remove("A9");
                        break;
                }
                click++;
            }
        });

        botonAsiento10.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento10.setIcon(asientolisto2);
                        seleccionAsientos.add("B10");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento10.setIcon(asientolisto3);
                        seleccionAsientos.remove("B10");
                        break;
                }
                click++;
            }
        });

        botonAsiento11.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento11.setIcon(asientolisto2);
                        seleccionAsientos.add("C11");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento11.setIcon(asientolisto3);
                        seleccionAsientos.remove("C11");
                        break;
                }
                click++;
            }
        });

        botonAsiento12.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento12.setIcon(asientolisto2);
                        seleccionAsientos.add("D12");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento12.setIcon(asientolisto3);
                        seleccionAsientos.remove("D12");
                        break;
                }
                click++;
            }
        });

        botonAsiento13.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento13.setIcon(asientolisto2);
                        seleccionAsientos.add("A13");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento13.setIcon(asientolisto3);
                        seleccionAsientos.remove("A13");
                        break;
                }
                click++;
            }
        });

        botonAsiento14.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento14.setIcon(asientolisto2);
                        seleccionAsientos.add("B14");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento14.setIcon(asientolisto3);
                        seleccionAsientos.remove("B14");
                        break;
                }
                click++;
            }
        });

        botonAsiento15.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento15.setIcon(asientolisto2);
                        seleccionAsientos.add("C15");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        seleccionAsientos.remove("C15");
                        botonAsiento15.setIcon(asientolisto3);
                        break;
                }
                click++;
            }
        });

        botonAsiento16.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento16.setIcon(asientolisto2);
                        seleccionAsientos.add("D16");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento16.setIcon(asientolisto3);
                        seleccionAsientos.remove("D16");
                        break;
                }
                click++;
            }
        });

        botonAsiento17.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento17.setIcon(asientolisto2);
                        seleccionAsientos.add("A17");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento17.setIcon(asientolisto3);
                        seleccionAsientos.remove("A17");
                        break;
                }
                click++;
            }
        });

        botonAsiento18.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento18.setIcon(asientolisto2);
                        seleccionAsientos.add("B18");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento18.setIcon(asientolisto3);
                        seleccionAsientos.remove("B18");
                        break;
                }
                click++;
            }
        });

        botonAsiento19.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento19.setIcon(asientolisto2);
                        seleccionAsientos.add("C19");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento19.setIcon(asientolisto3);
                        seleccionAsientos.remove("C19");
                        break;
                }
                click++;
            }
        });

        botonAsiento20.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento20.setIcon(asientolisto2);
                        seleccionAsientos.add("D20");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento20.setIcon(asientolisto3);
                        seleccionAsientos.remove("D20");
                        break;
                }
                click++;
            }
        });

        botonAsiento21.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento21.setIcon(asientolisto2);
                        seleccionAsientos.add("A21");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento21.setIcon(asientolisto3);
                        seleccionAsientos.remove("A21");
                        break;
                }
                click++;
            }
        });

        botonAsiento22.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento22.setIcon(asientolisto2);
                        seleccionAsientos.add("B22");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento22.setIcon(asientolisto3);
                        seleccionAsientos.remove("B22");
                        break;
                }
                click++;
            }
        });

        botonAsiento23.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento23.setIcon(asientolisto2);
                        seleccionAsientos.add("C23");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento23.setIcon(asientolisto3);
                        seleccionAsientos.remove("C23");
                        break;
                }
                click++;
            }
        });

        botonAsiento24.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento24.setIcon(asientolisto2);
                        seleccionAsientos.add("D24");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento24.setIcon(asientolisto3);
                        seleccionAsientos.remove("D24");
                        break;
                }
                click++;
            }
        });

        botonAsiento25.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento25.setIcon(asientolisto2);
                        seleccionAsientos.add("A25");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento25.setIcon(asientolisto3);
                        seleccionAsientos.remove("A25");
                        break;
                }
                click++;
            }
        });

        botonAsiento26.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento26.setIcon(asientolisto2);
                        seleccionAsientos.add("B26");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento26.setIcon(asientolisto3);
                        seleccionAsientos.remove("B26");
                        break;
                }
                click++;
            }
        });

        botonAsiento27.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento27.setIcon(asientolisto2);
                        seleccionAsientos.add("C27");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento27.setIcon(asientolisto3);
                        seleccionAsientos.remove("C27");
                        break;
                }
                click++;
            }
        });

        botonAsiento28.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento28.setIcon(asientolisto2);
                        seleccionAsientos.add("D28");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento28.setIcon(asientolisto3);
                        seleccionAsientos.remove("D28");
                        break;
                }
                click++;
            }
        });

        botonAsiento29.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento29.setIcon(asientolisto2);
                        seleccionAsientos.add("A29");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento29.setIcon(asientolisto3);
                        seleccionAsientos.remove("A29");
                        break;
                }
                click++;
            }
        });

        botonAsiento30.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento30.setIcon(asientolisto2);
                        seleccionAsientos.add("B30");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento30.setIcon(asientolisto3);
                        seleccionAsientos.remove("B30");
                        break;
                }
                click++;
            }
        });

        botonAsiento31.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento31.setIcon(asientolisto2);
                        seleccionAsientos.add("C31");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento31.setIcon(asientolisto3);
                        seleccionAsientos.remove("C31");
                        break;
                }
                click++;
            }
        });

        botonAsiento32.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento32.setIcon(asientolisto2);
                        seleccionAsientos.add("D32");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento32.setIcon(asientolisto3);
                        seleccionAsientos.remove("D32");
                        break;
                }
                click++;
            }
        });

        botonAsiento33.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento33.setIcon(asientolisto2);
                        seleccionAsientos.add("A33");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento33.setIcon(asientolisto3);
                        seleccionAsientos.remove("A33");
                        break;
                }
                click++;
            }
        });

        botonAsiento34.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento34.setIcon(asientolisto2);
                        seleccionAsientos.add("B34");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento34.setIcon(asientolisto3);
                        seleccionAsientos.remove("B34");
                        break;
                }
                click++;
            }
        });

        botonAsiento35.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento35.setIcon(asientolisto2);
                        seleccionAsientos.add("C35");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento35.setIcon(asientolisto3);
                        seleccionAsientos.remove("C35");
                        break;
                }
                click++;
            }
        });

        botonAsiento36.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento36.setIcon(asientolisto2);
                        seleccionAsientos.add("D36");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento36.setIcon(asientolisto3);
                        seleccionAsientos.remove("D36");
                        break;
                }
                click++;
            }
        });

        botonAsiento37.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento37.setIcon(asientolisto2);
                        seleccionAsientos.add("A37");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento37.setIcon(asientolisto3);
                        seleccionAsientos.remove("A37");
                        break;
                }
                click++;
            }
        });

        botonAsiento38.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento38.setIcon(asientolisto2);
                        seleccionAsientos.add("B38");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento38.setIcon(asientolisto3);
                        seleccionAsientos.remove("B38");
                        break;
                }
                click++;
            }
        });

        botonAsiento39.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento39.setIcon(asientolisto2);
                        seleccionAsientos.add("C39");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento39.setIcon(asientolisto3);
                        seleccionAsientos.remove("C39");
                        break;
                }
                click++;

            }
        });
        botonAsiento40.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento40.setIcon(asientolisto2);
                        seleccionAsientos.add("D40");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento40.setIcon(asientolisto3);
                        seleccionAsientos.remove("D40");
                        break;
                }
                click++;
            }
        });

        botonAsiento41.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento41.setIcon(asientolisto2);
                        seleccionAsientos.add("A41");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento41.setIcon(asientolisto3);
                        seleccionAsientos.remove("A41");
                        break;
                }
                click++;
            }
        });

        botonAsiento42.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento42.setIcon(asientolisto2);
                        seleccionAsientos.add("B42");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento42.setIcon(asientolisto3);
                        seleccionAsientos.remove("B42");
                        break;
                }
                click++;
            }
        });

        botonAsiento43.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento43.setIcon(asientolisto2);
                        seleccionAsientos.add("C43");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento43.setIcon(asientolisto3);
                        seleccionAsientos.remove("C43");
                        break;
                }
                click++;
            }
        });

        botonAsiento44.addActionListener(new ActionListener() {
            int click = 0;
            @Override
            public void actionPerformed(ActionEvent event) {
                switch (click % 2) {
                    case 0:
                        ImageIcon imagenasiento2 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoResv.png");
                        Image imagenasie2 = imagenasiento2.getImage();
                        Image nuevoasiento2 = imagenasie2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto2 = new ImageIcon(nuevoasiento2);
                        botonAsiento44.setIcon(asientolisto2);
                        seleccionAsientos.add("D44");
                        break;
                    case 1:
                        ImageIcon imagenasiento3 = new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\untitled32\\src\\main\\java\\org\\example\\AsientoDisp2.png");
                        Image imagenasie3 = imagenasiento3.getImage();
                        Image nuevoasiento3 = imagenasie3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon asientolisto3 = new ImageIcon(nuevoasiento3);
                        botonAsiento44.setIcon(asientolisto3);
                        seleccionAsientos.remove("D44");
                        break;
                }
                click++;
            }
        });
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
        botonReserva.setBounds(1100, 300, 100, 30);
        add(botonReserva);

        botonReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Reserva nuevareserva = new Reserva();

                nuevareserva.setVisible(true);
            }
        });

    }
    public ArrayList getSeleccion() {
        return seleccionAsientos;
    }


        }