package masterfila.repositorio;

import java.util.List;

import masterfila.dao.Dao;
import masterfila.entidade.Ficha;
import masterfila.entidade.Funcionario;
import masterfila.util.Constants;

public class RepositorioFuncionario {

	private Dao dao;
	
	public RepositorioFuncionario(){
		if(dao == null){
			dao = Dao.getInstance();
		}
	}
	
	public void inserir(Funcionario novo){
		novo.setStatus(Constants.ATIVO);
		dao.salvarObjeto(novo);
	}
	
	public void atualizar(Funcionario atual){
		dao.atualizarObjeto(atual);
	}
	
	public List<Funcionario> listar(){
		return (List<Funcionario>) dao.criarQuery("FROM funcionario WHERE status <> '" + Constants.INATIVO + "'");
	}
	
	public void remover(Funcionario del){
		del.setStatus(Constants.INATIVO);
		dao.atualizarObjeto(del);
	}
}
