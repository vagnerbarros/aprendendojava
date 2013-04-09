package masterfila.fachada;

import masterfila.cadastro.CadastroEmpresa;
import masterfila.cadastro.CadastroFicha;
import masterfila.cadastro.CadastroFuncionario;
import masterfila.cadastro.CadastroUsuario;
import masterfila.repositorio.RepositorioEmpresa;
import masterfila.repositorio.RepositorioFicha;
import masterfila.repositorio.RepositorioFuncionario;
import masterfila.repositorio.RepositorioUsuario;

public class Fachada {

	private static Fachada instancia;
	private CadastroFuncionario cadFuncionario;
	private CadastroUsuario cadUsuario;
	private CadastroFicha cadFicha;
	private CadastroEmpresa cadEmpresa;
	
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
		
		RepositorioEmpresa repEmpresa = new RepositorioEmpresa();
		cadEmpresa = new CadastroEmpresa(repEmpresa);
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
	
	public CadastroEmpresa cadastroEmpresa(){
		return cadEmpresa;
	}
}