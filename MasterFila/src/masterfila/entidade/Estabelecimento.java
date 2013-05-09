package masterfila.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "estabelecimento")
public class Estabelecimento implements Entidade{

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "categoria", length = 100, nullable = false)
	private String categoria;
	
	@Column(name = "email", length = 100, nullable = false)
	private String email;
	
	@Column(name = "status", length = 10, nullable = false)
	private String status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Object[] getColunas() {
		return null;
	}
}
