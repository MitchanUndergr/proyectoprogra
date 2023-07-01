import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(InterfazGraficaTest.class);

        if (result.wasSuccessful()) {
            System.out.println("Todas las pruebas pasaron exitosamente.");
        } else {
            System.out.println("Algunas pruebas fallaron:");

            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }

        PasajesTest test5 = new PasajesTest();
        test5.testMostrarDatos();
        
        AsientosTest test4= new AsientosTest();
        test4.testAgregarContenido();

        DatosTest test3= new DatosTest();
        test3.testLeerDatos();

        ReservaTest test2= new ReservaTest();
        test2.testAgregaFiltro();

    }
}
