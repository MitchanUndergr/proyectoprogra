import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Filtro_PasajesTest {
    private Filtro_Pasajes filtro;

    @BeforeEach
    void setUp() {
        // Configurar el archivo de filtro con datos de prueba
        try {
            FileWriter fileWriter = new FileWriter("src/Archivos/filtro_pasajes.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Concepción,Santiago,2023-07-25");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        filtro = new Filtro_Pasajes();
    }

    @Test
    void testFiltroInitialization() {
        // Verificar que los datos de filtro se hayan inicializado correctamente
        assertEquals("Concepción", filtro.getOrigen());
        assertEquals("Santiago", filtro.getDestino());
        assertEquals("2023-07-25", filtro.getFecha());
    }

    @Test
    void testListaFiltrada() {
        // Obtener la lista de datos de viajes filtrados
        List<DatosViaje> listaFiltrada = filtro.getListaFiltrada();

        // Verificar que la lista no esté vacía
        assertTrue(listaFiltrada.size() > 0);

        // Verificar que todos los elementos de la lista tengan el origen y destino correctos
        for (DatosViaje datosViaje : listaFiltrada) {
            assertEquals("Concepción", datosViaje.getOrigen());
            assertEquals("Santiago", datosViaje.getDestino());
        }
    }
}
