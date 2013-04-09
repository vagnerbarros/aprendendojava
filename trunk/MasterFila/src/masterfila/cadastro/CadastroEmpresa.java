package masterfila.cadastro;

import java.util.List;

import masterfila.entidade.Empresa;
import masterfila.entidade.Funcionario;
import masterfila.repositorio.RepositorioEmpresa;

public class CadastroEmpresa {

	private RepositorioEmpresa rep;
	
	public CadastroEmpresa(RepositorioEmpresa rep){
		this.rep = rep;
	}
	
	public void cadastrar(Empresa novo){
		rep.inserir(novo);
	}
	
	public void atualizar(Empresa atual){
		rep.atualizar(atual);
	}
	
	public void remover(Empresa deletado){
		rep.remover(deletado);
	}
	
	public List<Empresa> listar(){
		return rep.listar();
	}
}
