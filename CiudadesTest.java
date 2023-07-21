import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CiudadesTest {
    private Ciudades ciudades;

    @BeforeEach
    void setUp() {
        // Crear una instancia de Ciudades utilizando un archivo de prueba con datos predefinidos
        String archivoPrueba = "src/Archivos/ciudades_prueba.txt";
        ciudades = new Ciudades(archivoPrueba);
    }

    @Test
    void testGetCiudades() {
        // Verificar que el método getCiudades() devuelve una lista de ciudades no vacía
        ArrayList<String> listaCiudades = ciudades.getCiudades();
        assertNotNull(listaCiudades);
        assertFalse(listaCiudades.isEmpty());
    }

    @Test
    void testEliminarCiudad() {
        // Verificar que el método eliminarCiudad() elimina correctamente una ciudad de la lista
        ArrayList<String> listaCiudades = ciudades.getCiudades();
        int tamañoInicial = listaCiudades.size();

        // Eliminar una ciudad de prueba que esté presente en la lista
        String ciudadAEliminar = "Concepción";
        ciudades.eliminarCiudad(ciudadAEliminar);

        // Verificar que el tamaño de la lista se ha reducido y que la ciudad ya no está presente
        int tamañoFinal = ciudades.getCiudades().size();
        assertEquals(tamañoInicial - 1, tamañoFinal);
        assertFalse(ciudades.getCiudades().contains(ciudadAEliminar));
    }
}
