package it.unisa;

import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        CircoloEJBRemote circolo = (CircoloEJBRemote)
                ctx.lookup("java:global/Circoli/CircoloEJB!it.unisa.CircoloEJBRemote");
        
        System.out.println("Tutti i circoli...");
        circolo.ottieniCircoli().forEach(
                (c) -> System.out.println("### " + c)
        );
        
        System.out.println("Inserisci regione:");
        Scanner in = new Scanner(System.in);
        String regione = in.nextLine();
        circolo.ottieniPerRegione(regione).forEach(
                (c) -> System.out.println("### " + c)
        );
        
    }
    
}
