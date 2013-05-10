package masterfila.desktop;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import masterfila.desktop.view.DialogLogin;
import masterfila.entidade.Fila;
import masterfila.entidade.TipoFicha;
import masterfila.exception.FilaExistenteException;
import masterfila.fachada.Fachada;

public class Launch {
	
	public static void main(String[] args) throws IOException {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		
		DialogLogin d = new DialogLogin();
		
		//carregando as filas na memória
		Fachada fachada = Fachada.getInstance();
		List<TipoFicha> tipos = fachada.cadastroTipoFicha().listar();
		for(TipoFicha tipo : tipos){
			Fila nova = new Fila(tipo);
			try {
				fachada.cadastroFila().cadastrar(nova);
			} catch (FilaExistenteException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		
		d.setVisible(true);
	}
	
}
