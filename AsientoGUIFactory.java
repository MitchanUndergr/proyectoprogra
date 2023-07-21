public class AsientoGUIFactory {
    // Atributos de la clase
    private Asientos asiento = new Asientos();
    private static final String SEMI = "Semi cama";
    private boolean semicama = false;
    private boolean saloncama = false;
    private AsientosGUI Semic, Salonc;
    private static final String SALON = "Salon cama";

    // Método para crear una instancia de la clase AsientosGUI según el tipo de asiento
    public AsientosGUI crearAsientoGUI(String tipo) {
        if (tipo.equalsIgnoreCase(SEMI)) {
            semicama = true;
            Semic = new AsientosSemiGUI();
            return Semic;
        } else if (tipo.equalsIgnoreCase(SALON)) {
            saloncama = true;
            Salonc = new AsientosSalonGUI();
            return Salonc;
        } else {
            return null; // En caso de que el tipo no sea válido, retorna null
        }
    }

    // Método para utilizar la interfaz de asientos según el tipo de asiento
    public void UsarAsientoGUI() {
        if (semicama) {
            Semic.ElegirAsientos(); // Muestra la interfaz para elegir asientos (semi cama)
            Semic.ImplementarFiltro(); // Implementa el filtro para mostrar los datos
            if (asiento.getSeleccionAsientos().size() < 40) {
                Semic.setVisible(true); // Si elige menos de 40 asientos, muestra la interfaz
            } else {
                Semic.setVisible(false); // Si elige 40 asientos o más, oculta y cierra la interfaz
                Semic.dispose();
            }
        } else if (saloncama) {
            Salonc.ElegirAsientos(); // Muestra la interfaz para elegir asientos (salón cama)
            Salonc.ImplementarFiltro(); // Implementa el filtro para mostrar los datos
            if (asiento.getSeleccionAsientosdob().size() < 60) {
                Salonc.setVisible(true); // Si elige menos de 60 asientos, muestra la interfaz
            } else {
                Salonc.setVisible(false); // Si elige 60 asientos o más, oculta y cierra la interfaz
                Salonc.dispose();
            }
        }
    }
}
