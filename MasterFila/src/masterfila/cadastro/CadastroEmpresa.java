package masterfila.cadastro;

import java.util.List;

import masterfila.entidade.Estabelecimento;
import masterfila.entidade.Funcionario;
import masterfila.repositorio.RepositorioEmpresa;

public class CadastroEmpresa {

	private RepositorioEmpresa rep;
	
	public CadastroEmpresa(RepositorioEmpresa rep){
		this.rep = rep;
	}
	
	public void cadastrar(Estabelecimento novo){
		rep.inserir(novo);
	}
	
	public void atualizar(Estabelecimento atual){
		rep.atualizar(atual);
	}
	
	public void remover(Estabelecimento deletado){
		rep.remover(deletado);
	}
	
	public List<Estabelecimento> listar(){
		return rep.listar();
	}
}
