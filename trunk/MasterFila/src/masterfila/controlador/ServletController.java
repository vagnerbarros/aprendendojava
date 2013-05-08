package masterfila.controlador;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import masterfila.model.ListarEmpresa;
import masterfila.model.Model;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/controlador")
public class ServletController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Map<String, Model> mapa;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletController() {
		super();
		mapa = new HashMap<String, Model>();
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		mapa.put("listarEmpresas", new ListarEmpresa());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
	}
}
