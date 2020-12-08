package it.unisa;

import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        VentilatoreEJBRemote ventilatore =
                (VentilatoreEJBRemote) ctx.lookup(
                        "java:global/Ventilatore/VentilatoreEJB!it.unisa.VentilatoreEJBRemote");
        
        System.out.println("Inserisci una nazione:");
        Scanner in = new Scanner(System.in);
        String country = in.nextLine();
        System.out.println("Tutti i ventilatori presenti...");
        ventilatore.printByCountry(country).forEach(
            (v) -> System.out.println("### " + v)
         );
        
        
    }
    
}
