package masterfila.cadastro;

import java.util.List;

import masterfila.entidade.Funcionario;
import masterfila.repositorio.RepositorioFuncionario;

public class CadastroFuncionario {

	private RepositorioFuncionario rep;
	
	public CadastroFuncionario(RepositorioFuncionario rep){
		this.rep = rep;
	}
	
	public void cadastrar(Funcionario novo){
		rep.inserir(novo);
	}
	
	public void atualizar(Funcionario atual){
		rep.atualizar(atual);
	}
	
	public void remover(Funcionario deletado){
		rep.remover(deletado);
	}
	
	public List<Funcionario> listar(){
		return rep.listar();
	}
}
