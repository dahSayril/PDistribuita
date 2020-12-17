package it.unisa;

public class Client {
    
    public static void main(String[] args) {
        
        System.out.println("Lista di tutti i negozi...");
        print().forEach(
                (n) -> System.out.println("### " + n)
        );
        
    }

    private static java.util.List<it.unisa.NegozioEntity> print() {
        it.unisa.NegozioEJBService service = new it.unisa.NegozioEJBService();
        it.unisa.NegozioEJB port = service.getNegozioEJBPort();
        return port.print();
    }
    
}
