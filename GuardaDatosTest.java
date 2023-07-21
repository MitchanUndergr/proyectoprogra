import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GuardaDatosTest {
    private static final String PRIMER_ARCHIVO = "src/Archivos/filtro_pasajes.txt";
    private static final String SEGUNDO_ARCHIVO = "src/Archivos/filtro_asientos.txt";
    private static final String TERCER_ARCHIVO = "src/Archivos/DatosPasaje.txt";

    @BeforeEach
    void setUp() {
        // Limpia los archivos antes de cada prueba
        GuardaDatos.crearArchivo();
        GuardaDatos.crearArchivo2();
        GuardaDatos.crearArchivo3();
    }

    @AfterEach
    void tearDown() {
        // Limpia los archivos después de cada prueba
        GuardaDatos.crearArchivo();
        GuardaDatos.crearArchivo2();
        GuardaDatos.crearArchivo3();
    }

    @Test
    void testGuardarDatosU() throws IOException {
        // Guarda datos de prueba en el primer archivo
        GuardaDatos.guardarDatosU("Curico", "Santiago", "2023-07-25");

        // Lee el contenido del archivo y verifica si los datos están escritos correctamente
        FileReader fileReader = new FileReader(PRIMER_ARCHIVO);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = bufferedReader.readLine();
        bufferedReader.close();

        assertEquals("Curico,Santiago,2023-07-25", linea);
    }

    @Test
    void testGuardarDatosD() throws IOException {
        // Guarda datos de prueba en el segundo archivo
        ArrayList<String> datos = new ArrayList<>();
        datos.add("A1");
        datos.add("A2");
        GuardaDatos.guardarDatosD("Curico", "Santiago", "2023-07-25", "08:00", "Semi cama", 10000, datos);

        // Lee el contenido del archivo y verifica si los datos están escritos correctamente
        FileReader fileReader = new FileReader(SEGUNDO_ARCHIVO);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = bufferedReader.readLine();
        bufferedReader.close();

        assertEquals("Curico,Santiago,2023-07-25,08:00,Semi cama,10000,A1 A2", linea);
    }

    @Test
    void testGuardarDatosT() throws IOException {
        // Guarda datos de prueba en el tercer archivo
        GuardaDatos.guardarDatosT("Curico", "Santiago", "2023-07-25", "08:00", "Semi cama", 10000);

        // Lee el contenido del archivo y verifica si los datos están escritos correctamente
        FileReader fileReader = new FileReader(TERCER_ARCHIVO);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = bufferedReader.readLine();
        bufferedReader.close();

        assertEquals("Curico,Santiago,2023-07-25,08:00,Semi cama,10000", linea);
    }

}
