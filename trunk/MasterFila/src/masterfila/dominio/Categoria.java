package masterfila.dominio;

public class Categoria {

	public static String CONSULTORIO = "Consult�rio M�dico";
	public static String REPARTICAO = "Reparti��o P�blica";
	public static String AGENCIA = "Ag�ncia Banc�ria";
	public static String CARTORIO = "Cart�rio";
	public static String OUTRO = "Outro";
	
	public static String[] getCategorias(){
		String [] retorno = {CONSULTORIO, REPARTICAO, AGENCIA, CARTORIO, OUTRO};
		return retorno;
	}
}
