import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Asientos {
    // Método para agregar el contenido de un ArrayList a otro
    private void agregarContenido(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
        for (String elemento : arrayList1) {
            arrayList2.add(elemento);
        }
    }

    // Variables miembro de la clase
    private ArrayList<String> seleccionAsientos = new ArrayList<>();
    private ArrayList<String> seleAsientos = new ArrayList<>();
    private ArrayList<String> seleccionAsientosdob = new ArrayList<>();
    private ArrayList<String> seleAsientosdob = new ArrayList<>();
    private String[] vectorComposiciones = new String[40];
    private String[] vectorComposicionesdob = new String[60];
    private String Origen, Destino, fechas, Hora, Tipoasiento;
    private int precio;

    // Constructor de la clase Asientos
    public Asientos() {
        // Inicialización del vectorComposiciones con las combinaciones de letras y números
        int indice = 0;
        for (char letra = 'A'; letra <= 'D'; letra++) {
            for (int numero = 1; numero <= 10; numero++) {
                String composicion = letra + Integer.toString(numero);
                vectorComposiciones[indice] = composicion;
                indice++;
            }
        }

        int indice2 = 0;
        for (char letra = 'A'; letra <= 'F'; letra++) {
            for (int numero = 1; numero <= 10; numero++) {
                String composicion = letra + Integer.toString(numero);
                vectorComposicionesdob[indice2] = composicion;
                indice2++;
            }
        }

        // Leer datos desde un archivo de texto para almacenar la última línea en las variables miembro
        try {
            FileReader fileReader = new FileReader("src/Archivos/DatosPasaje.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            String ultimoOrigen = null;
            String ultimoDestino = null;
            String ultimaFecha = null;
            String ultimaHora = null;
            String ultimoTasiento = null;
            int ultimoprecio = 0;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                ultimoOrigen = datos[0].trim();
                ultimoDestino = datos[1].trim();
                ultimaFecha = datos[2].trim();
                ultimaHora = datos[3].trim();
                ultimoTasiento = datos[4].trim();
                ultimoprecio = Integer.parseInt(datos[5].trim());
            }

            this.Origen = ultimoOrigen;
            this.Destino = ultimoDestino;
            this.fechas = ultimaFecha;
            this.Hora = ultimaHora;
            this.Tipoasiento = ultimoTasiento;
            this.precio = ultimoprecio;

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer datos desde otro archivo de texto para obtener los asientos disponibles
        try {
            FileReader fileReader = new FileReader("src/Archivos/filtro_asientos.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] datosPasaje = linea.split(",");
                String origenPasaje = datosPasaje[0].trim();
                String destinoPasaje = datosPasaje[1].trim();
                String fechaPasaje = datosPasaje[2].trim();
                String horaPasaje = datosPasaje[3].trim();
                String tipoAsientoPasaje = datosPasaje[4].trim();
                int precioPasaje = Integer.parseInt(datosPasaje[5].trim());
                ArrayList<String> arrayAsientos = new ArrayList<>();
                for (int i = 6; i < datosPasaje.length; i++) {
                    String[] asientos = datosPasaje[i].trim().split("\\s+");
                    for (String asiento : asientos) {
                        if (!arrayAsientos.contains(asiento)) {
                            arrayAsientos.add(asiento);
                        }
                    }
                }

                // Verificar si los datos coinciden con los de la última línea leída
                if (origenPasaje.equals(Origen) && destinoPasaje.equals(Destino) && fechaPasaje.equals(fechas) && horaPasaje.equals(Hora) && tipoAsientoPasaje.equals(Tipoasiento)) {
                    // Si coinciden y el tipo de asiento es "Semi cama", actualizar los asientos disponibles
                    if (Tipoasiento.equals("Semi cama")) {
                        HashSet<String> setAsientos = new HashSet<>(seleccionAsientos);
                        setAsientos.addAll(arrayAsientos);
                        seleccionAsientos = new ArrayList<>(setAsientos);
                    }
                    // Si coinciden y el tipo de asiento es "Salon cama", actualizar los asientos disponibles
                    else if (Tipoasiento.equals("Salon cama")) {
                        HashSet<String> setAsientosdob = new HashSet<>(seleccionAsientosdob);
                        setAsientosdob.addAll(arrayAsientos);
                        seleccionAsientosdob = new ArrayList<>(setAsientosdob);
                    }
                }
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Métodos para agregar y eliminar asientos seleccionados
    public void addAsiento(int indice) {
        String asiento = vectorComposiciones[indice];
        if (!seleccionAsientos.contains(asiento)) {
            seleAsientos.add(asiento);
        }
    }

    public void eraseAsiento(int indice) {
        seleAsientos.remove(vectorComposiciones[indice]);
    }

    public void addAsientodob(int indice) {
        String asiento = vectorComposicionesdob[indice];
        if (!seleccionAsientosdob.contains(asiento)) {
            seleAsientosdob.add(asiento);
        }
    }

    public void eraseAsientodob(int indice) {
        seleAsientosdob.remove(vectorComposicionesdob[indice]);
    }

    // Métodos para obtener los asientos seleccionados
    public ArrayList<String> AsientosSeleccionados() {
        agregarContenido(seleAsientos, seleccionAsientos);
        return seleccionAsientos;
    }

    public ArrayList<String> AsientosSeleccionadosDob() {
        agregarContenido(seleAsientosdob, seleccionAsientosdob);
        return seleccionAsientosdob;
    }

    // Métodos para obtener los valores de los asientos según su índice en los vectores de composiciones
    public String valor_asiento(int indice) {
        String valor = vectorComposiciones[indice];
        return valor;
    }

    public String valor_asientodob(int indice) {
        String valor = vectorComposicionesdob[indice];
        return valor;
    }

    // Método para guardar los datos de los asientos seleccionados para la reserva
    public void DatosParaReserva() {
        GuardaDatos.guardarDatosD(Origen, Destino, fechas, Hora, Tipoasiento, precio, seleccionAsientos);
    }

    public void DatosParaReservaDob() {
        GuardaDatos.guardarDatosD(Origen, Destino, fechas, Hora, Tipoasiento, precio, seleccionAsientosdob);
    }

    // Métodos para obtener los datos de la reserva
    public String getOrigen() {
        return Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public String getFechas() {
        return fechas;
    }

    public ArrayList<String> getSeleccionAsientos() {
        return seleccionAsientos;
    }

    public ArrayList<String> getSeleccionAsientosdob() {
        return seleccionAsientosdob;
    }

    public ArrayList<String> getSeleAsientos() {
        return seleAsientos;
    }
    public ArrayList getSeleasientosdob(){
        return seleAsientosdob;
    }
}
