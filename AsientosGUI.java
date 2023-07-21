import javax.swing.*;
import java.awt.*;

public abstract class AsientosGUI extends JFrame {
    // Atributos de la clase
    private Asientos asientos;
    private String Origen, Destino, fechas;

    // Constructor de la clase
    public AsientosGUI() {
        asientos = new Asientos();
    }

    // Método abstracto para elegir asientos (debe ser implementado por las subclases)
    public abstract void ElegirAsientos();

    // Método para implementar el filtro y mostrar los detalles de la compra
    public void ImplementarFiltro() {
        Origen = asientos.getOrigen();
        Destino = asientos.getDestino();
        fechas = asientos.getFechas();

        // Crear etiquetas para mostrar los detalles del viaje
        JLabel origen1 = new JLabel(Origen);
        origen1.setForeground(new Color(35, 35, 35)); // Color de fuente
        Font font = origen1.getFont();
        Font fontNueva = font.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
        origen1.setFont(fontNueva);
        origen1.setBounds(95, 110, 100, 30);
        add(origen1);

        JLabel destino = new JLabel(Destino);
        destino.setForeground(new Color(35, 35, 35)); // Color de fuente
        Font font2 = destino.getFont();
        Font fontNueva2 = font2.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
        destino.setFont(fontNueva2);
        destino.setBounds(285, 110, 100, 30);
        add(destino);

        JLabel fecha = new JLabel(fechas);
        fecha.setForeground(new Color(35, 35, 35)); // Color de fuente
        Font font3 = fecha.getFont();
        Font fontNueva3 = font3.deriveFont(font.getSize() + 2.0f); // Tamaño de la fuente
        fecha.setFont(fontNueva3);
        fecha.setBounds(470, 110, 100, 30);
        add(fecha);
    }
}
