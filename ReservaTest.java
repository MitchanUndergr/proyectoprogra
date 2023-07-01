import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ReservaTest {


    @Test
    public void testAgregaFiltro() {
        // Crear una instancia de la clase Asientos
        Asientos asientos = new Asientos();
        Reserva reserva = new Reserva();
        reserva.agregafiltro(asientos);

        ArrayList<String> arrayAsientos = reserva.getArrayasientos();
        Assertions.assertNotNull(arrayAsientos);
        Assertions.assertEquals(asientos.getSeleAsientos(), arrayAsientos);
    }


}
