package masterfila.util;

import javax.swing.JOptionPane;

import masterfila.dominio.Categoria;
import masterfila.dominio.Perfil;
import masterfila.entidade.Estabelecimento;
import masterfila.entidade.Funcionario;
import masterfila.entidade.Usuario;
import masterfila.fachada.Fachada;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraBanco {
	
    public static void main (String [] args){
    	try {
    		Configuration cfg = new Configuration();
            cfg.configure();
            SchemaExport se = new SchemaExport(cfg);
            se.create(true, true);
            
            Fachada fachada = Fachada.getInstance();
            
            Estabelecimento e = new Estabelecimento();
            e.setCategoria(Categoria.AGENCIA);
            e.setEmail("empresa@gmail.com");
            e.setNome("Banco do Brasil");
            fachada.cadastroEmpresa().cadastrar(e);
            
            Funcionario f = new Funcionario();
            f.setCpf("050.529.594-60");
            f.setDataNascimento("10/10/10");
            f.setEmpresa(e);
            f.setLogin("1");
            f.setNome("Vagner Barros Pereira");
            f.setPerfil(Perfil.GERENTE);
            f.setSenha("1");
            fachada.cadastroFuncionario().cadastrar(f);

            Usuario u = new Usuario();
            u.setNome("Solicitação Local");
            u.setBairro("Bairro");
            u.setCep("CEP");
            u.setCidade("Cidade");
            u.setCpf("CPF");
            u.setEstado("PE");
            u.setLogin("Login");
            u.setSenha("Senha");
            u.setNumero("Numero");
            u.setRua("Rua");
            u.setTelefone("Telefone");
            u.setEmpresa(e);
            fachada.cadastroUsuario().cadastrar(u);
            
            JOptionPane.showMessageDialog(null, "O Banco de Dados foi gerado com sucesso!",
            		"Fafica .:. Alerta",JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro ao Gerar a Base de Dados!",
            	"Fafica .:. Alerta",JOptionPane.ERROR_MESSAGE);
		}
    }
}