package it.unisa;

public class Client {

    public static void main(String[] args) {
        
        System.out.println("Tutti i circoli nella provincia di Salerno...");
        ottieniPerProvincia("Salerno").forEach(
                (c) -> System.out.println("### " + c));
        
    }

    private static java.util.List <it.unisa.CircoloEntity> ottieniPerProvincia(java.lang.String arg0) {
        it.unisa.CircoloEJBService service = new it.unisa.CircoloEJBService();
        it.unisa.CircoloEJB port = service.getCircoloEJBPort();
        return port.ottieniPerProvincia(arg0);
    }
    
}
