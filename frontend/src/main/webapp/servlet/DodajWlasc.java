package main.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Wlasciciel;

/**
 * Servlet implementation class DodajWlasc
 */
@WebServlet("/DodajWlasc")
public class DodajWlasc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DodajWlasc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Wlasciciel w = new Wlasciciel();
		w.setPesel(request.getParameter("pesel"));
		w.setData(request.getParameter("data"));
		w.setImie(request.getParameter("imie"));
		w.setNazwisko(request.getParameter("nazwisko"));
		w.setMiejscowosc(request.getParameter("miejscowosc"));
		w.setUlica(request.getParameter("ulica"));
		w.setNrbudynku(request.getParameter("nrbudynku"));
		w.setNrlokalu(request.getParameter("nrlokalu"));
		w.setRegon(request.getParameter("regon"));
		// TODO przekazanie obiektu do bazy
		// TODO poinformowanie o pomyslnym przebiegu dodania
		response.sendRedirect("./jsp/wyborFormularza.jsp");
	}

}
