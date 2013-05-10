package masterfila.desktop;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import masterfila.desktop.view.DialogLogin;
import masterfila.entidade.Ficha;
import masterfila.entidade.Fila;
import masterfila.entidade.TipoFicha;
import masterfila.exception.FilaExistenteException;
import masterfila.fachada.Fachada;
import masterfila.util.CarregarDados;

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

		CarregarDados.go();
		DialogLogin d = new DialogLogin();

		d.setVisible(true);
	}
}
