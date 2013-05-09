package masterfila.repositorio;

import java.util.List;

import masterfila.dao.Dao;
import masterfila.entidade.Estabelecimento;
import masterfila.util.Constants;

public class RepositorioEstabelecimento {

	private Dao dao;
	
	public RepositorioEstabelecimento(){
		if(dao == null){
			dao = Dao.getInstance();
		}
	}
	
	public void inserir(Estabelecimento novo){
		novo.setStatus(Constants.ATIVO);
		dao.salvarObjeto(novo);
	}
	
	public void atualizar(Estabelecimento atual){
		dao.atualizarObjeto(atual);
	}
	
	public List<Estabelecimento> listar(){
		return (List<Estabelecimento>) dao.criarQuery("FROM empresa WHERE status <> '" + Constants.INATIVO + "'");
	}
	
	public void remover(Estabelecimento del){
		del.setStatus(Constants.INATIVO);
		dao.atualizarObjeto(del);
	}
}
