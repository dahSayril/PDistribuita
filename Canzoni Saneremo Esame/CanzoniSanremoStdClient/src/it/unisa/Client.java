package it.unisa;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
    
    private static CanzoneEJBRemote ejb;
    
    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        ejb = (CanzoneEJBRemote)
                ctx.lookup("java:global/CanzoniSanremo/"
                        + "CanzoneEJB!it.unisa.CanzoneEJBRemote");
        
        printAll();
        printByCategory("Pop");
        printByVotes(800);      
        
    }
    
    public static void printAll() {
        
        System.out.println("Tutte le canzoni:");
        
        ejb.ottieniTutti().forEach(
            (c) -> System.out.println(c)
        );
        
    }
    
    public static void printByCategory(String category) {
        
        System.out.println("Tutte le canzoni con categoria " + category + ":");
        
        ejb.ottieniDaCategoria(category).forEach(
            (c) -> System.out.println(c)
        );
        
    }

    public static void printByVotes(int votes) {
        
        System.out.println("Tutte le canzoni con voto minimo " + votes + ":");
        
        ejb.ottieniDaVotoMinimo(votes).forEach(
            (c) -> System.out.println(c)
        );
        
    }    
        
}
