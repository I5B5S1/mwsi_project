package main.webapp.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.webapp.action.impl.form.GoHomeAction;
import main.webapp.action.impl.form.GoLoginAction;
import main.webapp.action.impl.form.GoOwnerAction;
import main.webapp.action.impl.form.GoRegistrationCertificateAction;
import main.webapp.action.impl.form.GoVehicleFormAction;
import main.webapp.action.impl.logic.AddRegistrationCertificateAction;
import main.webapp.action.impl.logic.AddVehicleAction;
import main.webapp.action.impl.logic.GetOwnerAction;
import main.webapp.action.impl.logic.GetRegistrationCertificateAction;
import main.webapp.action.impl.logic.GetVehicleAction;
import main.webapp.action.impl.logic.LogOutAction;
import main.webapp.action.impl.logic.LoginAction;

@Component
public class ActionFactory {
	private  Map<String, Action> actions = new HashMap<>();
	
	public ActionFactory(){}
	@Autowired
	public ActionFactory(GoLoginAction goLoginAction,
			LoginAction loginAction, GoHomeAction goHomeAction, GoRegistrationCertificateAction goRegistrationCertificateAction
			,AddRegistrationCertificateAction addRegistrationCertificateAction, GetRegistrationCertificateAction getRegistrationCertificateAction
			, GoVehicleFormAction goVehicleFormAction,GetVehicleAction getVehicleAction, AddVehicleAction addVehicleAction
			,LogOutAction logOutAction, GoOwnerAction goOwnerAction, GetOwnerAction getOwnerAction){
		actions.put("/login", goLoginAction);
		actions.put("/loginCredentials", loginAction);
		actions.put("/home", goHomeAction);
		actions.put("/registrationCertificate", goRegistrationCertificateAction);
		actions.put("/registrationCertificateAction", getRegistrationCertificateAction);
		actions.put("/registrationCertificateActionAdd", addRegistrationCertificateAction);
		actions.put("/vehicle", goVehicleFormAction);
		actions.put("/vehicleAction", getVehicleAction);
		actions.put("/vehicleActionAdd", addVehicleAction);
		actions.put("/logOut", logOutAction);
		actions.put("/owner", goOwnerAction);
		actions.put("/ownerAction", getOwnerAction);
		
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
			key += "Add";
		}
		if(actions.containsKey(key)){
			return actions.get(key);
		} else {
			return actions.get("/home");
		}
	}
}
