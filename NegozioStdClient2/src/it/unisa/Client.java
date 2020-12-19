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
       
       System.out.println("I negozi nella regione  che hanno vendite di birre alcoliche "
               + "maggiori di quelle analcoliche sono:");
       ejb.printDrunkPeopleShops().forEach(
               (n) -> System.out.println("### " + n)
       );
       
    }
    
}
