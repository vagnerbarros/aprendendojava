package masterfila.repositorio;

import java.util.List;

import masterfila.dao.Dao;
import masterfila.dominio.Chamado;
import masterfila.entidade.Ficha;
import masterfila.entidade.TipoFicha;
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
		novo.setChamado(Chamado.NAO);
		dao.salvarObjeto(novo);
	}
	
	public void atualizar(Ficha atual){
		dao.atualizarObjeto(atual);
	}
	
	public List<Ficha> listar(){
		return (List<Ficha>) dao.criarQuery("FROM ficha WHERE status <> '" + Constants.INATIVO + "'");
	}
	
	public List<Ficha> listarTipo(TipoFicha tipo){
		return (List<Ficha>) dao.buscarPorChaveEstrangeira(Ficha.class, tipo, "tipo");
	}
	
	public void remover(Ficha del){
		del.setStatus(Constants.INATIVO);
		dao.atualizarObjeto(del);
	}
}
