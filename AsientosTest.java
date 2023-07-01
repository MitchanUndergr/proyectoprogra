import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AsientosTest {
    private Asientos asientos;

    @BeforeEach
    public void setUp() {
        asientos = new Asientos();
    }

    @Test
    public void testAgregarContenido() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A1");
        arrayList1.add("B2");
        arrayList1.add("C3");

        ArrayList<String> arrayList2 = new ArrayList<>();
        asientos.agregarContenido(arrayList1, arrayList2);

        assertEquals(arrayList1, arrayList2, "El contenido de los ArrayLists no coincide");
    }

}
