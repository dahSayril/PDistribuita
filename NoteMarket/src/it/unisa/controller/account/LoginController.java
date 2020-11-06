package it.unisa.controller.account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unisa.model.bean.account.Account;
import it.unisa.model.bean.account.Account.Stato;
import it.unisa.model.dao.AccountModel;
import it.unisa.utils.CryptWithMD5;

@WebServlet(name = "/LoginController", urlPatterns = {"/login", "/logout" })
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    static Logger logger = Logger.getLogger("global");
	
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getServletPath().equals("/login")) {
			
			Account account = (Account) request.getSession().getAttribute("account");
			if(account != null) {
				response.sendRedirect(response.encodeRedirectURL("index"));
				return;
			}
				
			String email = request.getParameter("email");
			String password = request.getParameter("password");
		
			if(email == null || password == null) {
				response.sendRedirect(response.encodeRedirectURL("login.jsp"));
				return;
			}
			
			if(email.equals("") || password.equals("")) {
				response.sendRedirect(response.encodeRedirectURL("login.jsp?error=true"));
				return;
			}
			
			AccountModel model = new AccountModel();
			String cryptPassword = CryptWithMD5.cryptWithMD5(password);
			
			try {
				if(model.login(email, cryptPassword)) {
					Account tmp = model.doRetrieveByKey(email);
					if(tmp.getStato() == Stato.daVerificare) {
						response.sendRedirect(response.encodeRedirectURL("login.jsp?notVerify=true"));
						return;
					} else if(tmp.getStato() == Stato.bannato) {
						response.sendRedirect(response.encodeRedirectURL("login.jsp?banned=true"));
						return;
					} else {
						request.getSession().setAttribute("account", tmp);
						response.sendRedirect(response.encodeRedirectURL("index"));
						return;
					}
				} else {
					response.sendRedirect(response.encodeRedirectURL("login.jsp?attempt=1"));
					return;
				}
			} catch (SQLException e) {
				logger.severe("Lanciata eccezione: " + e.getMessage());
				response.sendRedirect(response.encodeRedirectURL("login.jsp?error=true"));
				logger.info("Reindirizzo l'utente alla pagina di login con errore.");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				logger.severe("Lanciata eccezione: " + e.getMessage());
				response.sendRedirect(response.encodeRedirectURL("login.jsp?error=true"));
				logger.info("Reindirizzo l'utente alla pagina di login con errore.");
				e.printStackTrace();
				return;
			}
			
		}
		
		else if(request.getServletPath().equals("/logout")) {
			
			Account account = (Account) request.getSession().getAttribute("account");
			if(account == null) {
				response.sendRedirect(response.encodeRedirectURL("login.jsp"));
				return;
			}
			
			request.getSession().removeAttribute("account");
			request.getSession().removeAttribute("carrello");
			response.sendRedirect(response.encodeURL("index.jsp"));
			return;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
