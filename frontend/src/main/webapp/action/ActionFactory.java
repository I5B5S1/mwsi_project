package main.webapp.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.webapp.action.impl.form.GoHomeAction;
import main.webapp.action.impl.form.GoLoginAction;
import main.webapp.action.impl.form.GoRegistrationCertificateAction;
import main.webapp.action.impl.form.GoVehicleFormAction;
import main.webapp.action.impl.logic.AddVehicleAction;
import main.webapp.action.impl.logic.GetRegistrationCertificateAction;
import main.webapp.action.impl.logic.GetVehicleAction;
import main.webapp.action.impl.logic.LoginAction;

@Component
public class ActionFactory {
	private  Map<String, Action> actions = new HashMap<>();
	
	public ActionFactory(){}
	@Autowired
	public ActionFactory(GoLoginAction goLoginAction,
			LoginAction loginAction, GoHomeAction goHomeAction, GoRegistrationCertificateAction goRegistrationCertificateAction
			,GetRegistrationCertificateAction addExaminationDateAction, GoVehicleFormAction goVehicleFormAction,GetVehicleAction getVehicleAction, AddVehicleAction addVehicleAction){
		actions.put("/login", goLoginAction);
		actions.put("/loginCredentials", loginAction);
		actions.put("/home", goHomeAction);
		actions.put("/registrationCertificate", goRegistrationCertificateAction);
		actions.put("/registrationCertificateAddExaminationDate", addExaminationDateAction);
		actions.put("/vehicle", goVehicleFormAction);
		actions.put("/vehicleAction", getVehicleAction);
		actions.put("/vehicleActionAdd", addVehicleAction);
		
	}
	/*static{
		
		actions.put("/login", goLoginAction);
		actions.put("/loginCredentials", new LoginAction());
		
		
		actions.put("/home", new GoHomeAction());
		
		actions.put("/registrationCertificate", new GoRegistrationCertificateAction());
		actions.put("/registrationCertificateAddExaminationDate", new AddExaminationDateAction());
	}*/
	public Action getAction(HttpServletRequest request) {
		String key = request.getPathInfo();
		if(request.getParameter("add") != null){
			System.out.println("WYKRYTO ADD");
			key += "Add";
			System.out.println(actions.get(key));
		}
		if(actions.containsKey(key)){
			return actions.get(key);
		} else {
			return actions.get("/home");
		}
	}
}
