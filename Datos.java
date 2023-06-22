import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DatosViaje {
    private String salida;
    private String origen;
    private String destino;
    private String tipoAsiento;

    public DatosViaje(String salida, String origen, String destino, String tipoAsiento) {
        this.salida = salida;
        this.origen = origen;
        this.destino = destino;
        this.tipoAsiento = tipoAsiento;
    }
    public String getSalida() {
        return salida;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

}
public class Datos {
    private String archivo;

    public Datos(String archivo) {
        this.archivo = archivo;
    }

    public List<DatosViaje> leerDatos() {
        List<DatosViaje> listaDatos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String salida = datos[0];
                String origen = datos[1];
                String destino = datos[2];
                String tipo_bus = datos[3];

                DatosViaje datosviaje = new DatosViaje(salida, origen, destino, tipo_bus);
                listaDatos.add(datosviaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDatos;
    }
}