package masterfila.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import masterfila.model.Model;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("act") != null){
			String parametro = request.getParameter("act");
			String nomeDaClasse = "br.com.negocio." + parametro;

			try {
				Class classe = Class.forName(nomeDaClasse);

				Model logica = (Model) classe.newInstance();
				logica.executa(request, response);

			} catch (Exception e) {
				throw new ServletException("A lógica de negócios causou uma exceção", e);
			}
		} else {
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("act") != null){
			String parametro = request.getParameter("act");
			String nomeDaClasse = "br.com.negocio." + parametro;
			try {
				Class classe = Class.forName(nomeDaClasse);

				Model logica = (Model) classe.newInstance();
				logica.executa(request, response);

			} catch (Exception e) {
				throw new ServletException("A lógica de negócios causou uma exceção", e);
			}
		} else {
			response.sendRedirect("index.jsp");
		}
	}
}
