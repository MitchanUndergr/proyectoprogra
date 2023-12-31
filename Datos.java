import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DatosViaje {
    // Atributos de la clase DatosViaje
    private String salida;
    private String origen;
    private String destino;
    private String tipoAsiento;
    private String Terminal1;
    private String Terminal2;
    private int precio;
    private int cantidad_asientos;

    // Constructor de la clase DatosViaje
    public DatosViaje(String salida, String origen, String destino, String tipoAsiento, String Terminal1, String Terminal2, int precio, int cantidad_asientos) {
        this.salida = salida;
        this.origen = origen;
        this.destino = destino;
        this.tipoAsiento = tipoAsiento;
        this.precio = precio;
        this.Terminal1 = Terminal1;
        this.Terminal2 = Terminal2;
        this.cantidad_asientos = cantidad_asientos;
    }

    // Métodos para obtener los atributos de la clase DatosViaje
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

    public int getPrecio() {
        return precio;
    }

    public String getTerminal1() {
        return Terminal1;
    }

    public String getTerminal2() {
        return Terminal2;
    }

    public int getCantidad_asientos() {
        return cantidad_asientos;
    }
}

public class Datos {
    private String archivo;

    // Constructor de la clase Datos
    public Datos(String archivo) {
        this.archivo = archivo;
    }

    // Método para leer los datos desde el archivo
    public List<DatosViaje> leerDatos() {
        List<DatosViaje> listaDatos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            // Leer cada línea del archivo
            while ((linea = br.readLine()) != null) {
                // Separar los datos utilizando el carácter de coma como delimitador
                String[] datos = linea.split(",");

                // Obtener los valores de cada atributo desde los datos de la línea
                String salida = datos[0];
                String origen = datos[1];
                String destino = datos[2];
                String tipo_bus = datos[3];
                String terminal1 = datos[4];
                String terminal2 = datos[5];
                int precio = Integer.parseInt(datos[6].trim());
                int cantidadasientos = Integer.parseInt(datos[7].trim());

                // Crear un objeto DatosViaje con los valores obtenidos y agregarlo a la lista
                DatosViaje datosviaje = new DatosViaje(salida, origen, destino, tipo_bus, terminal1, terminal2, precio, cantidadasientos);
                listaDatos.add(datosviaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDatos;
    }
}
