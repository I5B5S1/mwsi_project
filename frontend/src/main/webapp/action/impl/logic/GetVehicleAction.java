package main.webapp.action.impl.logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jpa.entities.PojazdEntity;
import jpa.services.PojazdService;
import main.webapp.action.Action;
import main.webapp.exception.ValidationException;
import main.webapp.utils.Nullifier;
import main.webapp.utils.Validator;
import main.webapp.utils.VehicleFormExtractor;

@Component
public class GetVehicleAction implements Action {

	@Autowired
	private PojazdService pojazdService;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			PojazdEntity pojazdEntity = VehicleFormExtractor.extractVehicle(request);
			List<PojazdEntity> list = pojazdService.pobierzPojazdy(pojazdEntity.getVin(), pojazdEntity.getMarka(),
					pojazdEntity.getModel(), pojazdEntity.getGeneracja(), pojazdEntity.getTypNadwozia(),
					pojazdEntity.getIloscMiejsc(), pojazdEntity.getPojemnoscSilnika(), pojazdEntity.getMoc(),
					pojazdEntity.getSeriaKartyPojazdu(), pojazdEntity.getNrkartypojazdu(),
					pojazdEntity.getMaxMasaCalkowita(), pojazdEntity.getMasaWlasna(), pojazdEntity.getLiczbaOsi(),
					pojazdEntity.getPojazdSpecjalny(), pojazdEntity.getKradziezPojazdu(),
					pojazdEntity.getOdnalezieniePojazdu(), pojazdEntity.getUtrataTablicRejestracyjnych(),
					pojazdEntity.getOdnalezienieTablicRejestracyjnych(), pojazdEntity.getUtrataKartyPojazdu(),
					pojazdEntity.getOdnalezienieaKartyPojazdu());

			request.setAttribute("resultList", list);
			request.setAttribute("showRecords", true);
		} catch (ValidationException | NumberFormatException e) {
			request.setAttribute("validationError", "Wprowadzone dane nie przesz³y pomyœlnie walidacji!");
		}

		return "vehicle";
	}
}
