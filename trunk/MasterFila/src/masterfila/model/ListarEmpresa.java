package masterfila.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import masterfila.entidade.Empresa;
import masterfila.fachada.Fachada;

public class ListarEmpresa implements Model{

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		Fachada fachada = Fachada.getInstance();
		List<Empresa> lista = fachada.cadastroEmpresa().listar();
		request.setAttribute("empresas", lista);
		String pagina = "listarEmpresa.jsp";
		return pagina;
	}
}
