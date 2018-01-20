package main.webapp.action.impl.logic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;

import jpa.entities.PojazdEntity;
import jpa.services.PojazdService;
import main.webapp.action.Action;
import main.webapp.exception.ValidationException;
import main.webapp.utils.VehicleFormExtractor;

@Component
public class AddVehicleAction implements Action {
	
	@Autowired
	private PojazdService pojazdService;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			PojazdEntity pojazdEntity = VehicleFormExtractor.extractVehicle(request);
			pojazdService.dodajPojazd(pojazdEntity);
			request.setAttribute("positiveResult", "Pomyœlnie dodano nowy b¹dŸ zmodyfikowano istniej¹cy wpis");
		} catch (ValidationException | NumberFormatException  e) {
				request.setAttribute("validationError", "Wprowadzone dane nie przesz³y pomyœlnie walidacji!");
		} catch (JpaSystemException | InvalidDataAccessApiUsageException e){
			request.setAttribute("jpaError", "Dodanie nowego pojazdu nie powiod³o siê! Proszê pamiêtaæ o wprowadzeniu VINu");
		}
		return "vehicle";
	}

}
