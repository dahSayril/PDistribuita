package it.unisa;

import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

    public static void main(String[] args) throws NamingException {
        
       Context ctx = new InitialContext(); 
       NegozioEJBRemote ejb = (NegozioEJBRemote)
               ctx.lookup("java:global/NegozioEJB/NegozioEJB!it.unisa.NegozioEJBRemote");
       
       Scanner in = new Scanner(System.in);
       System.out.println("Inserisci la regione...");
       String regione = in.nextLine();
       System.out.println("I negozi nella regione " + regione + " sono:");
       ejb.printByRegion(regione).forEach(
               (n) -> System.out.println("### " + n)
       );
       
    }
    
}
