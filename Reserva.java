import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Reserva extends JFrame {

    Image imagenfondo1;
    private JPanel panel1;
    public ArrayList<String> arrayasientodob,arrayasientos;
    String desde,hasta,dia;
    public ArrayList<Object[]> datosdobreserva,datosreserva;
    public Reserva() {

        setTitle("Reserva");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        setSize(screenWidth, screenHeight);

        imagenfondo1 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/compra.png").getImage();
        imagenfondo1 = imagenfondo1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel principal = new JLabel(new ImageIcon(imagenfondo1));
        setContentPane(principal);

        panel1 = new JPanel();
        panel1.setBounds(850, 398, 200, 30);
        panel1.setOpaque(false);


    }

   public ArrayList<String> agregaasieentosDob(AsientosDob asientos){
        ArrayList asie=asientos.getSelecciondob();

        return asie;
    }

    public ArrayList<String> agregaasieentos(Asientos asientos){
        ArrayList asie=asientos.getSeleccion();
        return  asie;
    }

    public ArrayList<String> getArrayasientodob(){
        return arrayasientodob;
    }

    public ArrayList<String> getArrayasientos(){
        return arrayasientos;
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

        int calFinal= asientos.getSeleAsientos().size()*13000;
        int cantAsientos=asientos.getSeleAsientos().size();

        labels[1]= new JLabel("DETALLES DE LA COMPRA");
        labels[1].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[1].setFont(fontNueva);
        labels[1].setBounds(300, 350, 600, 30);
        add(labels[1]);

        labels[2]= new JLabel("Tipo de Asiento: " + "Semi Cama");
        labels[2].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[2].setFont(fontNueva);
        labels[2].setBounds(300, 400, 600, 30);
        add(labels[2]);

        labels[3]= new JLabel("Asientos : " + asientos.getSeleAsientos());
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

        SwingUtilities.invokeLater(() -> {

            int option = JOptionPane.showOptionDialog(
                    null,
                    "¿Desea realizar una nueva compra?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Sí", "No"},
                    "Sí"
            );

            if (option == JOptionPane.YES_OPTION) {
                // Abrir una nueva interfaz gráfica


                EventQueue.invokeLater(() -> {
                    InterfazGrafica nuevaInterfaz = new InterfazGrafica();
                    ArrayList<String> asien=nuevaInterfaz.arrayAsientos(this);
                    nuevaInterfaz.asiento=asien;
                    nuevaInterfaz.getAsiento();
                    //System.out.println(nuevaInterfaz.asiento.get(0));
                    nuevaInterfaz.traslado();
                    //System.out.println("HOLI");
                    nuevaInterfaz.setVisible(true);
                    dispose();
                });
            } else {
                // Cerrar la aplicación
                System.exit(0);
            }


        });


    }

    public void agregafiltroDob(AsientosDob asientos){
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

        int calFinal= asientos.getSeleasientosdob().size()*21000;
        int cantAsientos=asientos.getSeleasientosdob().size();


        labels[1]= new JLabel("DETALLES DE LA COMPRA");
        labels[1].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[1].setFont(fontNueva);
        labels[1].setBounds(300, 350, 600, 30);
        add(labels[1]);

        labels[2]= new JLabel("Tipo de Asiento: " + "Salon Cama");
        labels[2].setForeground(new Color(35, 35, 35)); // Color de fuente
        labels[2].setFont(fontNueva);
        labels[2].setBounds(300, 400, 600, 30);
        add(labels[2]);

        labels[3]= new JLabel("Asientos : " + asientos.getSeleasientosdob());
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

        SwingUtilities.invokeLater(() -> {

            int option = JOptionPane.showOptionDialog(
                    null,
                    "¿Desea realizar una nueva compra?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Sí", "No"},
                    "Sí"
            );

            if (option == JOptionPane.YES_OPTION) {
                // Abrir una nueva interfaz gráfica

                EventQueue.invokeLater(() -> {
                    InterfazGrafica nuevaInterfaz = new InterfazGrafica();
                    ArrayList<String> asien2= nuevaInterfaz.arrayAsientosDob(this);
                    nuevaInterfaz.datadob=datosdobreserva;
                    nuevaInterfaz.getDatadob();
                    nuevaInterfaz.asientoDob=asien2;
                    nuevaInterfaz.getAsientoDob();
                    nuevaInterfaz.trasladodob();
                    nuevaInterfaz.setVisible(true);
                    dispose();
                });
            } else {
                // Cerrar la aplicación
                System.exit(0);
            }

        });

    }

}
