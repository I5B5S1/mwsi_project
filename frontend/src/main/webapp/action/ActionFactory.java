package main.webapp.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import main.webapp.action.impl.form.GoAddRegDateAction;
import main.webapp.action.impl.form.GoHomeAction;
import main.webapp.action.impl.form.GoLoginAction;
import main.webapp.action.impl.logic.AddRegDateAction;
import main.webapp.action.impl.logic.LoginAction;
import main.webapp.action.impl.logic.TestAction;


public class ActionFactory {
	private static Map<String, Action> actions = new HashMap<>();
	static{
		actions.put("/login", new GoLoginAction());
		actions.put("/loginCredentials", new LoginAction());
		
		actions.put("/test", new TestAction());
		
		actions.put("/home", new GoHomeAction());
		
		actions.put("/addRegDate", new GoAddRegDateAction());
		actions.put("/addRegDateSend", new AddRegDateAction());
	}
	public static Action getAction(HttpServletRequest request) {
//		actions.containsKey(key)
		System.out.println("FACTORY = " + request.getPathInfo());
		if(actions.containsKey(request.getPathInfo())){
			return actions.get(request.getPathInfo());
		} else {
			return actions.get("/home");
		}
	}
}
