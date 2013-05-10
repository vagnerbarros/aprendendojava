package masterfila.cadastro;

import java.util.List;

import masterfila.entidade.Ficha;
import masterfila.entidade.TipoFicha;
import masterfila.repositorio.RepositorioFicha;

public class CadastroFicha {

	private RepositorioFicha rep;
	
	public CadastroFicha(RepositorioFicha rep){
		this.rep = rep;
	}
	
	public void cadastrar(Ficha novo){
		rep.inserir(novo);
	}
	
	public void atualizar(Ficha atual){
		rep.atualizar(atual);
	}
	
	public void remover(Ficha deletado){
		rep.remover(deletado);
	}
	
	public List<Ficha> listar(){
		return rep.listar();
	}
	
	public List<Ficha> listarTipo(TipoFicha tipo){
		return rep.listarTipo(tipo);
	}
}
