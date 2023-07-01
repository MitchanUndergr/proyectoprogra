import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterfazGraficaTest {

    @Test
    void testGetOrigen() {
        InterfazGrafica interfaz = new InterfazGrafica();
        interfaz.comboBoxes[0].setSelectedItem("Origen");
        assertEquals("Origen", interfaz.getOrigen());
    }

    @Test
    void testGetDestino() {
        InterfazGrafica interfaz = new InterfazGrafica();
        interfaz.comboBoxes[1].setSelectedItem("Destino");
        assertEquals("Destino", interfaz.getDestino());
    }

    @Test
    void testGetFecha() {
        InterfazGrafica interfaz = new InterfazGrafica();
        interfaz.comboBoxes[2].setSelectedItem("fecha");
        assertEquals("fecha", interfaz.getFecha());
    }

    @Test
    void testArrayAsientos() {
        InterfazGrafica interfaz = new InterfazGrafica();
        Reserva reserva = new Reserva();
        reserva.getArrayasientos().add("A1");
        interfaz.arrayAsientos(reserva);
        assertEquals(1, interfaz.getAsiento().size());
        assertEquals("A1", interfaz.getAsiento().get(0));
    }

    @Test
    void testArrayAsientosDob() {
        InterfazGrafica interfaz = new InterfazGrafica();
        Reserva reserva = new Reserva();
        reserva.getArrayasientodob().add("B1");
        interfaz.arrayAsientosDob(reserva);
        assertEquals(1, interfaz.getAsientoDob().size());
        assertEquals("B1", interfaz.getAsientoDob().get(0));
    }
}
