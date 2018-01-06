package main.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		// TODO 
		//potem sie bedzie sprawdzac czy istnieje taki uzytkownik w BD
		boolean zalogowanoPomyslnie = true;
		if(zalogowanoPomyslnie){
			response.sendRedirect("./jsp/wyborFormularza.jsp");
		} else {
			response.addHeader("B³¹d logowania", "B³¹d");
			request.getRequestDispatcher("./jsp/login.jsp").include(request, response);
		}
			
		
		
	}
	
	

}
