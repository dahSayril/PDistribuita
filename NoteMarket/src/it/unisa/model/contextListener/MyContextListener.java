package it.unisa.model.contextListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import it.unisa.model.DriverManagerConnectionPool;
import it.unisa.model.bean.account.Account;
import it.unisa.model.dao.AccountModel;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MyContextListener implements ServletContextListener {
	
	private ScheduledExecutorService scheduler;
	static Logger logger = Logger.getLogger("global");
	
    public void contextInitialized(ServletContextEvent sce) {
    	
    	scheduler = Executors.newSingleThreadScheduledExecutor();
    	
    	try {
        	logger.info("Mi connetto al database...");
            Connection con = DriverManagerConnectionPool.getConnection();
            DriverManagerConnectionPool.releaseConnection(con);
            logger.info("...Connessione al database stabilita!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    	
        scheduler.scheduleAtFixedRate(new Runnable() {
        	public void run() {
        		logger.info("Controllo giornaliero su chi non ha convalidato l'account...");
        		AccountModel model = new AccountModel();
        		try {
        			Collection <Account> toDelete = model.doRetriveAllVerifyTimeout();
        			for(Account e : toDelete) {
        				logger.info("L'utente: " + e.getEmail() + " è stato cancellato dal db!");
        				model.doDelete(e);
        			}
        		} catch (SQLException e) {
        			logger.severe("Lanciata eccezione: " + e.getMessage());
        			e.printStackTrace();
        		}
        	}
        }, 0, 1, TimeUnit.DAYS);
    
    }

    public void contextDestroyed(ServletContextEvent sce) {
    	scheduler.shutdownNow();
    }
    
}
