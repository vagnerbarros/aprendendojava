package masterfila.repositorio;

import java.util.List;

import masterfila.dao.Dao;
import masterfila.entidade.Ficha;
import masterfila.util.Constants;

public class RepositorioFicha {

	private Dao dao;
	
	public RepositorioFicha(){
		if(dao == null){
			dao = Dao.getInstance();
		}
	}
	
	public void inserir(Ficha novo){
		novo.setStatus(Constants.ATIVO);
		dao.salvarObjeto(novo);
	}
	
	public void atualizar(Ficha atual){
		dao.atualizarObjeto(atual);
	}
	
	public List<Ficha> listar(){
		return (List<Ficha>) dao.criarQuery("FROM ficha WHERE status <> '" + Constants.INATIVO + "'");
	}
	
	public void remover(Ficha del){
		del.setStatus(Constants.INATIVO);
		dao.atualizarObjeto(del);
	}
}
