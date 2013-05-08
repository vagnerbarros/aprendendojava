package masterfila.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity (name = "ficha")
public class Ficha implements Entidade{

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "numero", length = 10, nullable = false)
	private String numero;
	
	@Column(name = "tipo", length = 50, nullable = false)
	private String tipo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_atendente")
	private Funcionario atendente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Usuario cliente;
	
	@Column(name = "status", length = 10, nullable = false)
	private String status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Funcionario getAtendente() {
		return atendente;
	}
	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public Object[] getColunas() {
		// TODO Auto-generated method stub
		return null;
	}
}
