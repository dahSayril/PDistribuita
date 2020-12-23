/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

/**
 *
 * @author CORSO_PD
 */
public class Client {

    public static void main(String[] args) {
        
        System.out.println("Tutti i task iniziati...");
        for(TaskEntity t : getStarted())
            System.out.println(t);
        
    }
    
    private static java.util.List<it.unisa.TaskEntity> getStarted() {
        it.unisa.TaskEJBService service = new it.unisa.TaskEJBService();
        it.unisa.TaskEJB port = service.getTaskEJBPort();
        return port.getStarted();
    }
    
}
