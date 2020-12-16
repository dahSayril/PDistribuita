package it.unisa;

import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        CorsoEJBRemote ejb = (CorsoEJBRemote)
                ctx.lookup("java:global/Corsi/CorsoEJB!it.unisa.CorsoEJBRemote");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci la categoria...");
        Categoria cat = Categoria.valueOf(in.nextLine().toUpperCase());        
        System.out.println("Elenco dei corsi...");
        ejb.ottieniCorsiPerCategoria(cat).forEach(
                (c) ->  System.out.println("###" + c)
        );
        
        System.out.println("Inserisci il numero minimo di studenti...");
        int numStudenti = Integer.parseInt(in.nextLine());
        System.out.println("Elenco dei corsi...");
        ejb.ottieniCorsiConMinimoStudenti(numStudenti).forEach(
                (c) ->  System.out.println("###" + c)
        );
    }
    
}
