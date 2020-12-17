package it.unisa;

import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
    
    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        NegozioEJBRemote ejb = (NegozioEJBRemote)
                ctx.lookup("java:global/NegoziElettronica/NegozioEJB!it.unisa.NegozioEJBRemote");
        
        System.out.println("I negozi che hanno vendite correnti maggiori delle venditi dell'anno "
                + "precedente sono:");
        ejb.printActiveShops().forEach(
                (n) -> System.out.println("### " + n)
        );
        
    }
    
}