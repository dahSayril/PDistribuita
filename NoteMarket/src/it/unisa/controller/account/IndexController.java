package it.unisa.controller.account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unisa.model.bean.account.Account;

@WebServlet(name = "/IndexController", urlPatterns = {"/index"})
public class IndexController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public IndexController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	Account account = (Account) request.getSession().getAttribute("account");
    	
    	if(account == null) {
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    		return;
    	}
    	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
