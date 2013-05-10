package masterfila.entidade;

import java.util.ArrayList;
import java.util.List;

import masterfila.exception.FichaInvalidaException;
import masterfila.exception.FilaVaziaException;

public class Fila {

	private List<Ficha> fichas;
	private int proximo;
	private TipoFicha tipo;
	
	public Fila(TipoFicha tipo){
		this.tipo = tipo;
		proximo = 0;
		fichas = new ArrayList<Ficha>();
	}
	
	public void setFichas(List<Ficha> fichas){
		this.fichas = fichas;
	}
	
	public void adicionarFicha(Ficha ficha) throws FichaInvalidaException{
		if(tipo.equals(ficha.getTipo())){
			fichas.add(ficha);
		}
		else{
			throw new FichaInvalidaException();
		}
	}
	
	public Ficha atenderProximo() throws FilaVaziaException{
		Ficha retorno = null;
		if(fichas != null && !fichas.isEmpty()){
			retorno = fichas.get(proximo);
		}
		if(retorno != null){
			proximo++;
			return retorno;
		}
		else{
			throw new FilaVaziaException();
		}
	}
	
	public TipoFicha getTipo(){
		return tipo;
	}
	
	public boolean equals(Object o){
		if(this.tipo.equals(((Fila)o).getTipo())){
			return true;
		}
		else{
			return false;
		}
	}
}
