package it.unisa;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci l'id del ventilatore da modificare..");
        long id = in.nextLong();
        System.out.println("Inserisci i giri al minuto...");
        int giriMinuto = in.nextInt();
        
        setGiriAlMinuto(id, giriMinuto);
        
    }
    
    private static void setGiriAlMinuto(long arg0, int arg1) {
        it.unisa.VentilatoreEJBService service = new it.unisa.VentilatoreEJBService();
        it.unisa.VentilatoreEJB port = service.getVentilatoreEJBPort();
        port.setGiriAlMinuto(arg0, arg1);
    }
    
}
