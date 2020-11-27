/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.job;

import java.util.Scanner;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author sigci
 */
public class Main {
    
    static final Logger logger = Logger.getLogger("global");
    
    public static void main(String[] args) {
        
        logger.info("Creazione dell'entity manager factory...");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JobScheduling");
        logger.info("...entity manager factory creato...");
        logger.info("Creazione dell'entity manager...");
        EntityManager em = emf.createEntityManager();
        logger.info("...entity manager creato...");
        logger.info("Creazione dell'enetity transaction...");
        EntityTransaction tx = em.getTransaction();
        logger.info("...entity transaction creato...");
        
        Company company = (Company) em.createQuery("SELECT c FROM Company c WHERE c.name = 'PlasticGroup s.r.l.'").getSingleResult();
        
        System.out.println("Benvenuto nella compagnia: " + company.getName());
        System.out.println(COMMAND_LINE);
        
        Scanner in = new Scanner(System.in);
        String cmd;
        
        while(!(cmd = in.nextLine()).equals("0")) {
            
            if(cmd.equals("1")) {
                
                System.out.println("Nome della compagnia: " + company.getName());
                System.out.println("Indirizzo: " + company.getAddress().getStreet1());
                System.out.println("Indirizzo secondario: " + ((company.getAddress().getStreet2() == null) ? "Nessuno" : company.getAddress().getStreet2()));
                System.out.println("Stato: " + company.getAddress().getStat());
                System.out.println("Città: " + company.getAddress().getCity());
                System.out.println("CAP: " + company.getAddress().getZip());
             
            } else if(cmd.equals("2")) {
                
                for(Job j : company.getJobs()) {
                    System.out.println("Id: " + j.getId());
                    System.out.println("Titolo: " + j.getTitle());
                    System.out.println("Salario: " + j.getSalary());
                    System.out.println("Incaricato a: " + ((j.getPerson() == null) ? "Nessuno" : j.getPerson().getFirstName() + " " + j.getPerson().getLastName()));
                }        
                
            } else if(cmd.equals("3")) {
             
                Job j = new Job();
                j.setCompany(company);
                System.out.println("Inserisci il titolo del job:");
                j.setTile(in.nextLine());
                System.out.println("Inserisci il salario:");
                j.setSalary(Float.parseFloat(in.nextLine()));
                System.out.println("Inserisci il nome del destinatario:");
                j.setEmployeeld(in.nextLine());
                company.getJobs().add(j);
                tx.begin();
                logger.info("Inizio transazione...");
                em.persist(company);
                logger.info("...Job reso persistente...");
                tx.commit();
                logger.info("...Fine transazione.");
            
            } else if(cmd.equals("4")) {
             
                try {
                    System.out.println("Inserisci l'id del job da assegnare...");
                    Job j = (Job) em.createQuery("SELECT j FROM Job j WHERE j.id = " + in.nextLine()).getSingleResult();
                    System.out.println("Inserisci l'id del dipendente a cui vuoi assegnare questo job...");
                    Person p = (Person) em.createQuery("SELECT p FROM Person p WHERE p.id = " + in.nextLine()).getSingleResult();
                    j.setPerson(p);
                    tx.begin();
                    logger.info("Inizio tranazione...");
                    em.persist(j);
                    logger.info("...Job aggiornato...");
                    tx.commit();
                    logger.info("...Fine transazione.");
                } catch (javax.persistence.NoResultException e) {
                    System.out.println("Errore nell'inserimento dell'id...");
                    return;
                }
                
            } else if(cmd.equals("5")) {
             
                try {
                    System.out.println("Inserisci l'id del job da rimuovere...");
                    Job j = (Job) em.createQuery("SELECT j FROM Job j WHERE j.id = " + in.nextLine()).getSingleResult();
                    j.setPerson(null);
                    tx.begin();
                    logger.info("Inizio tranazione...");
                    em.persist(j);
                    logger.info("...Job aggiornato...");
                    tx.commit();
                    logger.info("...Fine transazione.");
                } catch (javax.persistence.NoResultException e) {
                    System.out.println("Errore nell'inserimento dell'id...");
                    return;
                }
                                
            } else System.out.println("Commando non valido. Riprova...");
                
            System.out.println(COMMAND_LINE);           
        }
        
        
               
    }
    
    private static final String COMMAND_LINE = "====== DIGITA UN COMANDO ======\n"
                                             + "  1 => Stampa dati aziendali.  \n"
                                             + "  2 => Stampa i Job.           \n"
                                             + "  3 => Crea un Job.            \n"
                                             + "  4 => Assegnare un Job.       \n"
                                             + "  5 => Rimuovere un Job.       \n"
                                             + "  0 => Termina.                \n"
                                             + "===============================";
    
}