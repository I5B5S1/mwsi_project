package main.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dowod;

/**
 * Servlet implementation class DodajDowod
 */
@WebServlet("/DodajDowod")
public class DodajDowod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DodajDowod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Dowod d = new Dowod();
			d.setNrrejestracyjny(request.getParameter("nrrejestracyjny"));
			d.setSeria(request.getParameter("seria"));
			d.setNumer(request.getParameter("numer"));
			d.setOrganwydajacy(request.getParameter("organwydajacy"));
			d.setDatarej(request.getParameter("datarej"));
			d.setKrajrej(request.getParameter("krajrej"));
			d.setDatapierrej(request.getParameter("datapierrej"));
			d.setOkreswaznosci(request.getParameter("okreswaznosci"));
			d.setDatabadania(request.getParameter("databadania"));
			d.setDatanastbadania(request.getParameter("datanastbadania"));
			// TODO przekazanie obiektu do bazy
			// TODO poinformowanie o pomyslnym przebiegu dodania
			response.sendRedirect("./jsp/wyborFormularza.jsp");

	}

}
