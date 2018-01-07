package main.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Vehicle;

/**
 * Servlet implementation class DodajPojazd
 */
@WebServlet("/AddVehicle")
public class AddVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVehicle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Vehicle p = new Vehicle();
		p.setVin(request.getParameter("vin"));
		p.setBrand(request.getParameter("brand"));
		p.setModel(request.getParameter("model"));
		p.setGeneration(request.getParameter("generation"));
		p.setBodyType(request.getParameter("bodyType"));
		p.setAnountOfSeats(Integer.parseInt(request.getParameter("amountOfSeats")));
		p.setEngineCapacity(Integer.parseInt(request.getParameter("power")));
		p.setVehicleCardNumber(request.getParameter("vehicleCardSeries"));
		p.setVehicleCardNumber(request.getParameter("vehicleCardNumber"));
		p.setMaxTotalWeight(Integer.parseInt(request.getParameter("maxTotalWeight")));
		p.setOwnWeight(Integer.parseInt(request.getParameter("ownWeight")));
		p.setAxesAmount(Integer.parseInt(request.getParameter("ownWeight")));
		// TODO przekazanie obiektu do bazy
		// TODO poinformowanie o pomyslnym przebiegu dodania
		response.sendRedirect("./jsp/wyborFormularza.jsp");

	}

}
