package masterfila.repositorio;

import java.util.List;

import masterfila.dao.Dao;
import masterfila.entidade.Empresa;
import masterfila.util.Constants;

public class RepositorioEmpresa {

	private Dao dao;
	
	public RepositorioEmpresa(){
		if(dao == null){
			dao = Dao.getInstance();
		}
	}
	
	public void inserir(Empresa novo){
		novo.setStatus(Constants.ATIVO);
		dao.salvarObjeto(novo);
	}
	
	public void atualizar(Empresa atual){
		dao.atualizarObjeto(atual);
	}
	
	public List<Empresa> listar(){
		return (List<Empresa>) dao.criarQuery("FROM empresa WHERE status <> '" + Constants.INATIVO + "'");
	}
	
	public void remover(Empresa del){
		del.setStatus(Constants.INATIVO);
		dao.atualizarObjeto(del);
	}
}
