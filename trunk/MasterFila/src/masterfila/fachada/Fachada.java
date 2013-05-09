package masterfila.fachada;

import masterfila.cadastro.CadastroEstabelecimento;
import masterfila.cadastro.CadastroFicha;
import masterfila.cadastro.CadastroFuncionario;
import masterfila.cadastro.CadastroUsuario;
import masterfila.repositorio.RepositorioEstabelecimento;
import masterfila.repositorio.RepositorioFicha;
import masterfila.repositorio.RepositorioFuncionario;
import masterfila.repositorio.RepositorioUsuario;

public class Fachada {

	private static Fachada instancia;
	private CadastroFuncionario cadFuncionario;
	private CadastroUsuario cadUsuario;
	private CadastroFicha cadFicha;
	private CadastroEstabelecimento cadEstabelecimento;
	
	private Fachada(){
		inicializar();
	}
	
	private void inicializar(){
		
		RepositorioFuncionario repFuncionario = new RepositorioFuncionario();
		cadFuncionario = new CadastroFuncionario(repFuncionario);
		
		RepositorioUsuario repUsuario = new RepositorioUsuario();
		cadUsuario = new CadastroUsuario(repUsuario);
		
		RepositorioFicha repFicha = new RepositorioFicha();
		cadFicha = new CadastroFicha(repFicha);
		
		RepositorioEstabelecimento repEmpresa = new RepositorioEstabelecimento();
		cadEstabelecimento = new CadastroEstabelecimento(repEmpresa);
	}
	
	public static Fachada getInstance(){
		
		if(instancia == null){
			instancia = new Fachada();
		}
		return instancia;
	}
	
	public CadastroFuncionario cadastroFuncionario(){
		return cadFuncionario;
	}
	
	public CadastroUsuario cadastroUsuario(){
		return cadUsuario;
	}
	
	public CadastroFicha cadastroFicha(){
		return cadFicha;
	}
	
	public CadastroEstabelecimento cadastroEmpresa(){
		return cadEstabelecimento;
	}
}