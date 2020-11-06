package it.unisa.controller.account;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unisa.model.bean.account.Account;
import it.unisa.model.dao.AccountModel;

@WebServlet(name = "/RegistrazioneController", urlPatterns = {"/registrazione", "/attivazione" })
public class RegistrazioneController extends HttpServlet {

	private static final long serialVersionUID = 1L;
    static Logger logger = Logger.getLogger("global");   
    
    public RegistrazioneController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		Account account = (Account) request.getSession().getAttribute("account");
		if(account != null) {
			response.sendRedirect(response.encodeRedirectURL("index"));
			return;
		}
		
		if(request.getServletPath().equals("/registrazione")) {
			
			String nome = request.getParameter("name");
			String cognome = request.getParameter("surname");
			String email = request.getParameter("email");
			String dataDiNascita = request.getParameter("dob");
			String password = request.getParameter("password");
			String repeatPassword = request.getParameter("password-repeat");
			String tipoAccount = request.getParameter("tipe");
			String policy = request.getParameter("policy");
			
			System.out.println(nome + " " + cognome + " " + email + " " + dataDiNascita + " " + password + " " + repeatPassword + " " + tipoAccount + " " + policy);
			
			if(nome == null || cognome == null || email == null || dataDiNascita == null || password == null || repeatPassword == null ||
					tipoAccount == null) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp"));
				return;
			}
			
			if(nome.equals("") || cognome.equals("") || email.equals("") || dataDiNascita.equals("") || password.equals("") || 
					repeatPassword.equals("") || tipoAccount.equals("")) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=true"));
				return;
			}
			
			if(!tipoAccount.equals("acquirente") && !tipoAccount.equals("venditore")) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=true"));
				return;
			}
			
			if(!controlRegEx(nome, cognome, email, password, repeatPassword)) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=notRespectRegEx"));
				return;				
			}
			
			if(!password.equals(repeatPassword)) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=passwordNotEquals"));
				return;
			}
			
			if(policy == null) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=useConditionNotAccepted"));
				return;
			}
			
			Date dob = new Date();
			try {
				dob = new SimpleDateFormat("yyyy-MM-dd").parse(dataDiNascita);
			} catch (ParseException e) {
				logger.severe("Lanciata eccezione: " + e.getMessage());
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=true"));
				logger.info("Reindirizzo l'utente alla pagina di registrazione con errore.");
				e.printStackTrace();
				return;
			}
											
			Date today = new Date();
			Date max = addYears(today, -18);
			Date min = addYears(today, -101);
			
			if(dob.after(max)) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=dobNotAcceptableMin18Years"));
				return;
			} else if(dob.before(min)) {
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=dobNotAcceptable"));
				return;
			}
			
			AccountModel model = new AccountModel();
			try {
				if(model.emailAlredyExists(email)) {
					response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=emailAlreadyExists"));
					return;
				}
			} catch (SQLException e) {
				logger.severe("Lanciata eccezione: " + e.getMessage());
				response.sendRedirect(response.encodeRedirectURL("registrazione.jsp?error=true"));
				logger.info("Reindirizzo l'utente alla pagina di registrazione con errore.");
				e.printStackTrace();
				return;
			}
			
			String action = request.getParameter("action");
			if(action == null || action.equals("")) {
								
			} else {
							
			}
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private boolean controlRegEx(String n, String c, String e, String p, String r) {
		String nR = "^[A-Za-z][a-zA-Z\\s]{1,13}[A-Za-z]$";
		String eR = "^[a-zA-Z0-9]{1}[.!#$%&'*+/=?^_`{|}~a-zA-Z0-9-]{0,99}@[a-zA-Z0-9]{1,46}\\.[a-zA-Z]{2,4}$";
		String pR = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,16}$";
		if(!nR.matches(n) || !nR.matches(c) || !eR.matches(e) || !pR.matches(p) || !pR.matches(r))
			return true;
		else return false;
	}

	private Date addYears(Date date, int years) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, years); 
        return cal.getTime();
    }
	
}
