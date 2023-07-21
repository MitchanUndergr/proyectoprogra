import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservaTest {
    private static final String ARCHIVO_DATOS_PASAJE = "src/Archivos/DatosPasaje.txt";

    private Reserva reserva;

    @BeforeEach
    void setUp() {
        // Crea un archivo temporal para DatosPasaje con datos de prueba
        try {
            List<String> lines = new ArrayList<>();
            lines.add("Curico,Concepcion,2023-07-25,08:00,Semi cama,10000");
            lines.add("Santiago,Concepcion,2023-07-25,08:00,Salon cama,15000");
            Files.write(Paths.get(ARCHIVO_DATOS_PASAJE), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        reserva = new Reserva();
    }

    @Test
    void testGetOrigen() {
        assertEquals("Santiago", reserva.getOrigen());
    }

    @Test
    void testGetDestino() {
        assertEquals("Concepcion", reserva.getDestino());
    }

    @Test
    void testGetFechas() {
        assertEquals("2023-07-25", reserva.getFechas());
    }

    @Test
    void testGetHora() {
        assertEquals("08:00", reserva.getHora());
    }

    @Test
    void testGetTipoasiento() {
        assertEquals("Salon cama", reserva.getTipoasiento());
    }

    @Test
    void testGetPrecio() {
        assertEquals(15000, reserva.getPrecio());
    }

}
