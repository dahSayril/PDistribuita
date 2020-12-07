package it.unisa;

import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

    public static void main(String[] args) throws NamingException {
     
        Context ctx = new InitialContext();
        DpcmEJBRemote dpcm = (DpcmEJBRemote)
                ctx.lookup("java:global/DpcmEJB/DpcmEJB!it.unisa.DpcmEJBRemote");
        
        System.out.println("Tutti i dpcm...");        
        dpcm.ottieniDpcm().forEach(
           (d) -> System.out.println("### " + d));
        
        System.out.println("Inserisci una tipologia:");
        Scanner in = new Scanner(System.in);
        String tipo = in.nextLine();
        dpcm.ottieniDpcmDataTipologia(tipo).forEach(
            (d) -> System.out.println("### " + d));
        
        System.out.println("Inserisci il numero minimo di presentazioni:");
        int n = in.nextInt();
        dpcm.ottieniDpcmDatoMinimoNumPres(n).forEach(
            (d) -> System.out.println("### " + d));
        
    }
    
}
