package it.unisa;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        
        CdEJBRemote ejb = (CdEJBRemote)
                ctx.lookup("java:global/Cd/CdEJB!it.unisa.CdEJBRemote");
        
        ejb.ottieniCds().forEach(
                (cd) -> System.out.println("### " + cd)
        );
        
        
    }
    
}
