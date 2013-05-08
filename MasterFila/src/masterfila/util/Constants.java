package masterfila.util;

public class Constants {

	
	//indica se a tupla está ou não ativa.
	public static String ATIVO = "ATIVO";
	public static String INATIVO = "INATIVO";
	
	//siglas dos estados brasileiros
	public static String [] listaEstados = { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI",
		"PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
	
	public static int getPosicaoEstado(String estado){
		int retorno = -1;
		for(int i = 0; i < listaEstados.length; i++){
			if(listaEstados[i].equals(estado)){
				retorno = i;
				break;
			}
		}
		return retorno;
	}
}
