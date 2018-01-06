package main.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.webapp.action.Action;
import main.webapp.action.ActionFactory;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/pl/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Controller pathInfo" + request.getPathInfo());
		Action action = ActionFactory.getAction(request);
		String view = action.execute(request, response);

		if (request.getPathInfo().substring(1).startsWith(view)) {
			response.setCharacterEncoding("UTF-8");
			request.getRequestDispatcher("/WEB-INF/view/" + view + ".jsp").include(request, response);
		} else {
			if (view.equals("home")) {
				response.sendRedirect("/CEPiK/");
			} else {
				response.sendRedirect(view); // We'd like to fire redirect in
												// case of a view change as
												// result of the action (PRG
												// pattern).
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
