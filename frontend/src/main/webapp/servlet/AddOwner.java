package main.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Owner;

/**
 * Servlet implementation class DodajWlasc
 */
@WebServlet("/AddOwner")
public class AddOwner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOwner() {
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
		
		Owner w = new Owner();
		w.setPesel(request.getParameter("pesel"));
		w.setBirthday(request.getParameter("birthday"));
		w.setName(request.getParameter("name"));
		w.setSurname(request.getParameter("surname"));
		w.setTown(request.getParameter("town"));
		w.setStreet(request.getParameter("street"));
		w.setBuildingNumber(request.getParameter("buildingNumber"));
		w.setHouseNumber(request.getParameter("houseNumber"));
		w.setRegon(request.getParameter("regon"));
		// TODO przekazanie obiektu do bazy
		// TODO poinformowanie o pomyslnym przebiegu dodania
		response.sendRedirect("./jsp/wyborFormularza.jsp");
	}

}
