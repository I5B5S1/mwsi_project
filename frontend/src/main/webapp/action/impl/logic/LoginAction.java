package main.webapp.action.impl.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.webapp.action.Action;
import model.User;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		//if credentials are in  DB
		if(true){
			 String username = request.getParameter("username");
		     String password = request.getParameter("password");
		     User testUser = new User("test", "test", true, true, true, true, 1290L);
			// invoke login method and set the returned object as "user" -
			// session.setAttribute ("user" ..)
			/*
			request.getSession(false).setAttribute("user",
			returnedUser());
			*/
		     request.getSession(true).setAttribute("user", testUser);
			return "/CEPiK/";
			
		}else{
			request.setAttribute("loginFailure", "Unrecognized credentials!");
			return "login";
		}
	}

}
