package main.webapp.action.impl.logic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jpa.services.DowodService;
import main.webapp.action.Action;

@Component
public class GetRegistrationCertificateAction implements Action {

	@Autowired
	private DowodService certificateService;
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String registrationNumber = request.getParameter("registrationNumber");
		String examinationDate =  request.getParameter("examinationDate").replaceAll("/", "-");
		if(certificateService.dodajDateBadaniaTechnicznego(registrationNumber, examinationDate)){
			request.setAttribute("addExaminationDateResult", "Pomy�lnie dodano date badania technicznego");
		} else {
			request.setAttribute("addExaminationDateResult", "Nie uda�o si� doda� daty badania technicznego do dowodu o numerze rejestracyjnym: " + registrationNumber);
		}
		return "registrationCertificate";
	}

}
