package main.webapp.action.impl.logic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jpa.entities.DowodEntity;
import jpa.services.DowodService;
import main.webapp.action.Action;
import main.webapp.exception.ValidationException;
import main.webapp.utils.RegistrationCertificateFormExtractor;

@Component
public class GetRegistrationCertificateAction implements Action {
	@Autowired
	private DowodService certificateService;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			
		
		DowodEntity dowodEntity = RegistrationCertificateFormExtractor.extractRegistrationCertificate(request);
		List<DowodEntity> list = certificateService.pobierzDowody(dowodEntity.getNrRejestracyjny(),
				dowodEntity.getSeria(), dowodEntity.getNumer(), dowodEntity.getOrganWydajacy(),
				dowodEntity.getDataRej(), dowodEntity.getKrajRej(), dowodEntity.getDataPierwszejRej(),
				dowodEntity.getOkresWaznosci(), dowodEntity.getDataBadania(), dowodEntity.getDataNastBadania(),
				dowodEntity.getUtrataDowoduRejestracyjnego(), dowodEntity.getOdnalezienieDowoduRejestracyjnego());

		request.setAttribute("resultList", list);
		request.setAttribute("showRecords", true);
		} catch(ValidationException e){
			request.setAttribute("validationError", "Wprowadzone dane nie przesz�y pomy�lnie walidacji!");
		}

		return "registrationCertificate";
	}

}
