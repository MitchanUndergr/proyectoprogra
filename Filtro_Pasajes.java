import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filtro_Pasajes {
    private String origen, destino, fecha;
    private List<DatosViaje> listaFiltrada = new ArrayList<>();
    private List<DatosViaje> listaDatos;

    public Filtro_Pasajes() {
        try {
            // Leer el archivo "filtro_pasajes.txt" que contiene los últimos datos de filtro seleccionados
            FileReader fileReader = new FileReader("src/Archivos/filtro_pasajes.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            // Variables para almacenar los datos de la última línea
            String ultimoOrigen = null;
            String ultimoDestino = null;
            String ultimaFecha = null;

            // Leer cada línea del archivo y obtener los datos de origen, destino y fecha
            while ((linea = bufferedReader.readLine()) != null) {
                // Separar los datos utilizando el carácter de coma como delimitador
                String[] datos = linea.split(",");

                // Almacenar los datos en variables temporales
                ultimoOrigen = datos[0].trim();
                ultimoDestino = datos[1].trim();
                ultimaFecha = datos[2].trim();
            }

            // Actualizar las variables de la instancia con los datos de la última línea
            this.origen = ultimoOrigen;
            this.destino = ultimoDestino;
            this.fecha = ultimaFecha;

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer el archivo "datos.txt" que contiene los datos de los viajes disponibles
        String archivo = "src/Archivos/datos.txt";
        Datos datos = new Datos(archivo);
        listaDatos = datos.leerDatos();
    }

    // Método para obtener la lista de datos de viajes filtrados según el origen y destino seleccionados
    public List<DatosViaje> getListaFiltrada() {
        for (DatosViaje datosViaje : listaDatos) {
            if (datosViaje.getOrigen().trim().equals(origen.trim()) && datosViaje.getDestino().trim().equals(destino.trim())) {
                listaFiltrada.add(datosViaje);
            }
        }

        return listaFiltrada;
    }

    // Getters para obtener el destino, fecha y origen seleccionados en el filtro
    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public String getOrigen() {
        return origen;
    }
}
