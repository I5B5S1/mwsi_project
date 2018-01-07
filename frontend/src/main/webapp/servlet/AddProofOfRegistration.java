package main.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProofOfRegistration;

/**
 * Servlet implementation class DodajDowod
 */
@WebServlet("/AddProofOfRegistration")
public class AddProofOfRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProofOfRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ProofOfRegistration d = new ProofOfRegistration();
			d.setRegistrationNumber(request.getParameter("registrationNumber"));
			d.setSeries(request.getParameter("series"));
			d.setNumber(request.getParameter("number"));
			d.setIssuingAuthority(request.getParameter("issuingAuthority"));
			d.setRegistrationDate(request.getParameter("registrationDate"));
			d.setRegistrationCountry(request.getParameter("registrationCountry"));
			d.setFirstRegistrationDate(request.getParameter("firstRegistrationDate"));
			d.setExpireDate(request.getParameter("expireDate"));
			d.setExaminationDate(request.getParameter("examinationDate"));
			d.setNextExaminationDate(request.getParameter("nextExaminationDate"));
			// TODO przekazanie obiektu do bazy
			// TODO poinformowanie o pomyslnym przebiegu dodania
			response.sendRedirect("./jsp/wyborFormularza.jsp");

	}

}
