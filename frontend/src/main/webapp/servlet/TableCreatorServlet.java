package main.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableCreatorServlet
 */
@WebServlet("/TableCreatorServlet")
public class TableCreatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TableCreatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<?> list = (List<?>) request.getAttribute("resultList");
		if (list.size() > 0) {
			Class<?> clazz = list.get(0).getClass();
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();

			writer.append("<table>");
			writer.append("<tr>");

			writer.append("<td>lp.</td>");
			for (Method method : clazz.getMethods()) {
				if (method.getName().matches("^(get|is).*") && !"getClass".equals(method.getName())) {
					writer.append("<td>");
					writer.append(method.getName().replaceFirst("(get|is)", ""));
					writer.append("</td>");
				}
			}
			writer.append("</tr>");
			Object result;
			for (int i = 0; i < list.size(); i++) {
				result = list.get(i);
				writer.append("<tr><td>");
				writer.print((i + 1));
				writer.append("</td>");
				for (Method method : clazz.getMethods()) {
					if (method.getName().matches("^(get|is).*") && !"getClass".equals(method.getName())) {
						try {
							writer.append("<td>");
							if(method.invoke(clazz.cast(result)) != null){
								writer.print(method.invoke(clazz.cast(result)));
							}
							
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
						writer.append("</td>");
					}
				}
				writer.append("</tr>");
			}

			writer.append("</table>");
		} else {
			response.getWriter().append("Brak danych!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
