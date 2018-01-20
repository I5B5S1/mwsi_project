package main.webapp.action.impl.logic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;

import jpa.entities.DowodEntity;
import jpa.services.DowodService;
import main.webapp.action.Action;
import main.webapp.exception.ValidationException;
import main.webapp.utils.RegistrationCertificateFormExtractor;

@Component
public class AddRegistrationCertificateAction implements Action {

	@Autowired
	private DowodService certificateService;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			DowodEntity dowodEntity = RegistrationCertificateFormExtractor.extractRegistrationCertificate(request);
			certificateService.dodajDowodRejestracyjny(dowodEntity);
			request.setAttribute("positiveResult", "Pomyœlnie dodano nowy b¹dŸ zmodyfikowano istniej¹cy wpis");
		} catch (JpaSystemException e) {
			request.setAttribute("jpaError",
					"Dodanie nowego dowodu rejestracyjnego nie powiod³o siê! Proszê pamiêtaæ o wprowadzeniu numeru rejestracyjnego");
		} catch (ValidationException e) {
			request.setAttribute("validationError", "Wprowadzone dane nie przesz³y pomyœlnie walidacji!");
		}

		return "registrationCertificate";
	}

}
