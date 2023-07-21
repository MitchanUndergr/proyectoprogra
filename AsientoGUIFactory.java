public class AsientoGUIFactory {

    private Asientos asiento=new Asientos();
    private static final String Semi= "Semi cama";
    private boolean semicama=false;
    private boolean saloncama=false;
    private AsientosGUI Semic,Salonc;
    private static final String Salon= "Salon cama";
    public AsientosGUI crearAsientoGUI(String tipo){
        if (tipo.equalsIgnoreCase(Semi)) {
            semicama=true;
            Semic= new AsientosSemiGUI();
            return Semic;
        } else if (tipo.equalsIgnoreCase(Salon)) {
            saloncama=true;
            Salonc= new AsientosSalonGUI();
            return Salonc;
        } else {
            return null; // En caso de que el tipo no sea válido
        }
    }
    public void UsarAsientoGUI(){
        if(semicama){
            Semic.ElegirAsientos();
            Semic.ImplementarFiltro();
            if(asiento.getSeleccionAsientos().size()<40) {
                Semic.setVisible(true);
            }
            else{
                Semic.setVisible(false);
                Semic.dispose();
            }
        } else if (saloncama) {
            Salonc.ElegirAsientos();
            Salonc.ImplementarFiltro();
            if(asiento.getSeleccionAsientosdob().size()<60){
                Salonc.setVisible(true);
            }
            else{
                Salonc.setVisible(false);
                Salonc.dispose();
            }
        }
    }
}