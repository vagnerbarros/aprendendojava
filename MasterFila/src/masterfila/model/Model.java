package masterfila.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Model {
	public String executa(HttpServletRequest request, HttpServletResponse response);
}