import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PasajesTest {

    private Pasajes pasajes;

    @BeforeEach
    public void setUp() {
        pasajes = new Pasajes();
    }



    @Test
    public void testMostrarDatos() {
        // Configurar el estado de la prueba
        List<DatosViaje> listaDatos = Arrays.asList(
                new DatosViaje("12:00","Concepción","Santiago","Semi cama2","Collao","Terminal Sur",13000,40),
                new DatosViaje("14:00","Concepcion","Santiago","Salon cama","Terminal Collao","Terminal Sur",30000,40)
        );

        pasajes.mostrarDatos(listaDatos);
    }
}
