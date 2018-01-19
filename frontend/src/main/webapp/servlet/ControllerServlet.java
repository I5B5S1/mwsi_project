package main.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import main.webapp.action.Action;
import main.webapp.action.ActionFactory;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/pl/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Autowired
	private ActionFactory actionFactory;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Test.test();
		Action action = actionFactory.getAction(request);
		String view = action.execute(request, response);
		if (request.getPathInfo().substring(1).startsWith(view)) {
			response.setCharacterEncoding("UTF-8");
			request.getRequestDispatcher("/WEB-INF/view/" + view + ".jsp").include(request, response);
		} else {
			if (view.equals("home")) {
				response.sendRedirect("/CEPiK/");
			} else {
				response.sendRedirect(view);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
