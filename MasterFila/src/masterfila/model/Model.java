package masterfila.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Model {
	void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception;
}