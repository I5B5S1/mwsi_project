package main.webapp.action.impl.logic;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jpa.entities.WlascicielEntity;
import jpa.services.WlascicielService;
import main.webapp.action.Action;
import main.webapp.exception.ValidationException;
import main.webapp.utils.Nullifier;
import main.webapp.utils.Validator;

@Component
public class GetOwnerAction implements Action {
	@Autowired
	private WlascicielService ownerService;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Map<String, String> map = Nullifier.nullify(request.getParameterMap());
			String pesel = map.get("pesel");
			String name = map.get("name");
			String surname = map.get("surname");
			String birthday = map.get("birthday");
			if(birthday != null){
				Validator.validateDate(birthday);
			}
			String town = map.get("town");
			String street = map.get("street");
			String buildingNubmer = map.get("buildingNubmer");
			String houseNumber = map.get("houseNumber");
			String regon = map.get("regon");

			List<WlascicielEntity> list = ownerService.pobierzWlascicieli(pesel, name, surname, birthday, town, street, buildingNubmer, houseNumber, regon);
					request.setAttribute("resultList", list);
			request.setAttribute("showRecords", true);
		} catch (ValidationException e) {
			request.setAttribute("validationError", "Wprowadzone dane nie przesz³y pomyœlnie walidacji!");
		}
		return "owner";
	}

}
