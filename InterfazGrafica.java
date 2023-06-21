import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class InterfazGrafica extends JFrame {
    private Image imagenfondo;
    private JPanel panel1;
    public InterfazGrafica() {
        // Configuración de la ventana
        setTitle("Autobuses C&N");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Establecer null layout

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Configurar el tamaño de la ventana para ocupar toda la pantalla
        setSize(screenWidth, screenHeight);

        imagenfondo = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/autobus2.png").getImage();
        imagenfondo = imagenfondo.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel principal = new JLabel(new ImageIcon(imagenfondo));
        setContentPane(principal);


        panel1 = new JPanel();
        panel1.setBounds(620, 398, 200, 30);
        panel1.setOpaque(false);

        String[] textos = {"¿De donde partes?", "¿A donde quieres ir?", "Día"};

        // Crear las barras desplegables y establecer sus coordenadas
        for (int i = 0; i < 3; i++) {
            JComboBox<String> comboBox = new JComboBox<>();
            comboBox.setMaximumSize(new Dimension(200, comboBox.getPreferredSize().height));

            int x = 50 + i * 210; // Coordenada x
            int y = 403; // Coordenada y

            comboBox.setBounds(x, y, 200, comboBox.getPreferredSize().height); // Establecer posición y tamaño

            JLabel label = new JLabel(textos[i]);
            label.setBounds(x, y - 22, 200, 20); // Establecer la posición y el tamaño del JLabel
            //label.setForeground(Color.DARK_GRAY); // Color de fuente más oscuro
            label.setForeground(new Color(0, 0, 0));
            Font font = label.getFont();
            Font fontNueva = font.deriveFont(font.getSize() + 4.0f); // Aumentar en 2 puntos el tamaño de la fuente
            label.setFont(fontNueva);
            add(label);
            add(comboBox); // Agregar al contenedor principal
        }


        // Creación del botón y establecer sus coordenadas
        JButton boton = new JButton("Buscar");
        int buttonX = 620;
        int buttonY = 398;

        boton.setBounds(buttonX, buttonY, 200, 30); // Establecer posición y tamaño
        panel1.add(boton);
        add(panel1); // Agregar al contenedor principal

        setVisible(true);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar ventana
                dispose();

                // Abrir nueva ventana
                Pasajes nuevopasaje = new Pasajes();
                nuevopasaje.setVisible(true);
            }
        });

    }

}

class Pasajes extends JFrame {
    private Image imagenfondo1;
    private JPanel panel1;
    public Pasajes() {
        // Configuración de la ventana
        setTitle("Mi compra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Configurar el tamaño de la ventana para ocupar toda la pantalla
        setSize(screenWidth, screenHeight);

        // Creación de componentes

        imagenfondo1 = new ImageIcon("C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/dibujos/autobus.png").getImage();
        imagenfondo1 = imagenfondo1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel principal = new JLabel(new ImageIcon(imagenfondo1));
        setContentPane(principal);

        panel1 = new JPanel();
        panel1.setBounds(850, 398, 200, 30);
        panel1.setOpaque(false);

        JLabel label = new JLabel("Pasajes");
        label.setBounds(110, 165, 200, 20); // Establecer la posición y el tamaño del JLabel
        label.setForeground(new Color(35, 35, 35)); // Color de fuente más oscuro
        Font font = label.getFont();
        Font fontNueva = font.deriveFont(font.getSize() + 4.0f); // Aumentar en 2 puntos el tamaño de la fuente
        label.setFont(fontNueva);
        add(label);

        JButton boton = new JButton("Buscar");
        int buttonX = 850;
        int buttonY = 398;

        boton.setBounds(buttonX, buttonY, 200, 30); // Establecer posición y tamaño
        panel1.add(boton);
        add(panel1); // Agregar al contenedor principal

        setVisible(true);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar ventana
                dispose();

                // Abrir nueva ventana
                Asientos nuevoasiento = new Asientos();
                nuevoasiento.setVisible(true);
            }
        });
    }
}

class Asientos extends  JFrame{

    Image imagenfondo1;
    public Asientos() {
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

        JLabel label = new JLabel("Asientos");
        label.setBounds(400, 165, 200, 20); // Establecer la posición y el tamaño del JLabel
        label.setForeground(new Color(35, 35, 35)); // Color de fuente más oscuro
        Font font = label.getFont();
        Font fontNueva = font.deriveFont(font.getSize() + 4.0f); // Aumentar en 2 puntos el tamaño de la fuente
        label.setFont(fontNueva);
        add(label);

    }
}
