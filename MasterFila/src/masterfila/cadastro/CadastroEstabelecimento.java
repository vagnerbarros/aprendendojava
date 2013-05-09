package masterfila.cadastro;

import java.util.List;

import masterfila.entidade.Estabelecimento;
import masterfila.entidade.Funcionario;
import masterfila.repositorio.RepositorioEstabelecimento;

public class CadastroEstabelecimento {

	private RepositorioEstabelecimento rep;
	
	public CadastroEstabelecimento(RepositorioEstabelecimento rep){
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
