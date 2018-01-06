package main.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pojazd;

/**
 * Servlet implementation class DodajPojazd
 */
@WebServlet("/DodajPojazd")
public class DodajPojazd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DodajPojazd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Pojazd p = new Pojazd();
		p.setVin(request.getParameter("vin"));
		p.setMarka(request.getParameter("marka"));
		p.setModel(request.getParameter("model"));
		p.setGeneracja(request.getParameter("generacja"));
		p.setTypnadwozia(request.getParameter("typnadwozia"));
		p.setIloscmiejsc(Integer.parseInt(request.getParameter("iloscmiejsc")));
		p.setPojemnoscsilnika(Integer.parseInt(request.getParameter("pojemnoscsilnika")));
		p.setSeriakartypojazdu(request.getParameter("seriakartypojazdu"));
		p.setNrkartypojazdu(request.getParameter("nrkartypojazdu"));
		p.setMaxmasacalkowita(Integer.parseInt(request.getParameter("maxmasacalkowita")));
		p.setMasawlasna(Integer.parseInt(request.getParameter("masawlasna")));
		p.setLiczbaosi(Integer.parseInt(request.getParameter("liczbaosi")));
		// TODO przekazanie obiektu do bazy
		// TODO poinformowanie o pomyslnym przebiegu dodania
		response.sendRedirect("./jsp/wyborFormularza.jsp");

	}

}
