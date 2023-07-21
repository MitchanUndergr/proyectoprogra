import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AsientosTest {
    private static final String ARCHIVO_FILTRO_ASIENTOS = "src/Archivos/filtro_asientos.txt";
    private static final String ARCHIVO_DATOS_PASAJE = "src/Archivos/DatosPasaje.txt";

    private Asientos asientos;

    @BeforeEach
    void setUp() {
        // Crea un archivo temporal para el filtro_asientos con datos de prueba
        try {
            List<String> lines = new ArrayList<>();
            lines.add("Curico,Concepcion,2023-07-25,08:00,Semi cama,10000,A1 A2 A3");
            lines.add("Curico,Concepcion,2023-07-24,08:00,Semi cama,10000,B1 B2 B3");
            Files.write(Paths.get(ARCHIVO_FILTRO_ASIENTOS), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> linea2 = new ArrayList<>();
            linea2.add("Curico,Concepcion,2023-07-25,08:00,Semi cama,10000");
            linea2.add("Curico,Concepcion,2023-07-24,08:00,Semi cama,10000");
            Files.write(Paths.get(ARCHIVO_DATOS_PASAJE), linea2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        asientos = new Asientos();
    }

    @Test
    void testAsientosSeleccionados() {
        // Verifica que los asientos seleccionados coincidan con los datos del archivo de prueba
        ArrayList<String> seleccionAsientos = asientos.AsientosSeleccionados();
        assertEquals(3, seleccionAsientos.size());
    }

    @Test
    void testAsientosSeleccionadosDob() {
        // Verifica que los asientos seleccionados para "Salon cama" coincidan con los datos del archivo de prueba
        ArrayList<String> seleccionAsientosDob = asientos.AsientosSeleccionadosDob();
        assertEquals(0, seleccionAsientosDob.size());
    }

    @Test
    void testAddAndEraseAsiento() {
        // Agrega y elimina un asiento y verifica que los asientos seleccionados se actualicen correctamente
        asientos.addAsiento(0); // A1
        asientos.addAsiento(2); // A3
        ArrayList<String> seleccionAsientos = asientos.getSeleAsientos();
        assertEquals(2, seleccionAsientos.size());
        assertEquals("A1", seleccionAsientos.get(0));
        assertEquals("A3", seleccionAsientos.get(1));

        asientos.eraseAsiento(0); // Elimina A1
        seleccionAsientos = asientos.getSeleAsientos();
        assertEquals(1, seleccionAsientos.size());
        assertEquals("A3", seleccionAsientos.get(0));
    }

    @Test
    void testAddAndEraseAsientoDob() {
        // Agrega y elimina un asiento para "Salon cama" y verifica que los asientos seleccionados se actualicen correctamente
        asientos.addAsientodob(0); // A1
        ArrayList<String> seleccionAsientosDob = asientos.getSeleasientosdob();
        assertEquals(1, seleccionAsientosDob.size());
        assertEquals("A1", seleccionAsientosDob.get(0));

        asientos.eraseAsientodob(0); // Elimina B1
        seleccionAsientosDob = asientos.getSeleasientosdob();
        assertEquals(0, seleccionAsientosDob.size());
    }
}
