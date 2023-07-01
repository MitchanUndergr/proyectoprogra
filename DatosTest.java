import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DatosTest {

    @Test
    public void testLeerDatos() {
        // Definir el archivo de datos de prueba
        String archivo = "C:/Users/user/Downloads/PROGRA2/progra2proyecto/src/Archivos/datos.txt";

        // Crear una instancia de la clase Datos
        Datos datos = new Datos(archivo);

        // Leer los datos del archivo
        List<DatosViaje> listaDatos = datos.leerDatos();

        // Verificar que la lista no esta vacia
        Assertions.assertFalse(listaDatos.isEmpty());

        // Verificar que se hayan leído los datos correctamente
        DatosViaje primerViaje = listaDatos.get(0);
        Assertions.assertEquals("2023-07-01", primerViaje.getSalida());
        Assertions.assertEquals("Origen", primerViaje.getOrigen());
        Assertions.assertEquals("Destino", primerViaje.getDestino());
        Assertions.assertEquals("Tipo de Asiento", primerViaje.getTipoAsiento());
        Assertions.assertEquals("Terminal 1", primerViaje.getTerminal1());
        Assertions.assertEquals("Terminal 2", primerViaje.getTerminal2());
        Assertions.assertEquals(100, primerViaje.getPrecio());
        Assertions.assertEquals(50, primerViaje.getCantidad_asientos());


    }
}
