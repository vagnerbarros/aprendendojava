package masterfila.desktop.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import masterfila.entidade.Fila;
import masterfila.entidade.Guiche;
import masterfila.entidade.TipoFicha;
import masterfila.exception.FilaVaziaException;
import masterfila.fachada.Fachada;

public class DialogConfirmaçãoAtendimento extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JLabel lblTipoFicha;
	private JLabel lblSenha;
	private JLabel lblGuiche;
	private JButton btRepetir;
	private JButton btFinalizar;
	private Guiche guiche;
	private TipoFicha tipoFicha;
	private Fila fila;
	
	public DialogConfirmaçãoAtendimento(Guiche guiche, TipoFicha tipoFicha){
		setTitle("Atendimento");
		this.guiche = guiche;
		this.tipoFicha = tipoFicha;
		Fachada fachada = Fachada.getInstance();
		fila = fachada.cadastroFila().buscarFila(tipoFicha);
		setResizable(false);
		initComponents();
	}
	
	private void initComponents(){

		setModal(true);
		
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width-400)/2, (screenSize.height-400)/2, 400, 346);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(Color.WHITE);
		
		JLabel lblNomeDoBox = new JLabel("N\u00FAmero do Box:");
		lblNomeDoBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		lblGuiche = new JLabel(guiche.getNumero());
		lblGuiche.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblTipoDeAtendimento = new JLabel("Tipo de Atendimento:");
		lblTipoDeAtendimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblTipoFicha = new JLabel("");
		lblTipoFicha.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_senha = new JLabel("Senha:");
		lbl_senha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblSenha = new JLabel("");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_senha, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoFicha, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomeDoBox)
						.addComponent(lblGuiche, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoDeAtendimento, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNomeDoBox)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblGuiche)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblTipoDeAtendimento, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTipoFicha, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbl_senha, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		btFinalizar = new JButton("  Finalizar");
		btFinalizar.addActionListener(this);
		btFinalizar.setIcon(new ImageIcon(DialogConfirmaçãoAtendimento.class.getResource("/masterfila/desktop/view/img/ok.png")));
		
		btRepetir = new JButton("  Chamar Novamente");
		btRepetir.setIcon(new ImageIcon(DialogConfirmaçãoAtendimento.class.getResource("/masterfila/desktop/view/img/refresh.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(58)
					.addComponent(btRepetir)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btFinalizar)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btRepetir, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btFinalizar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setIcon(new ImageIcon(DialogConfirmaçãoAtendimento.class.getResource("/masterfila/desktop/view/img/icon_atendimentoBig.png")));
		
		JLabel lblBoxDeAtendimento = new JLabel("Realizando Atendimento");
		lblBoxDeAtendimento.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblPreenchaOsDados = new JLabel("Realiza\u00E7\u00E3o de Atendimento");
		lblPreenchaOsDados.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addComponent(lblPreenchaOsDados, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblBoxDeAtendimento, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblBoxDeAtendimento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPreenchaOsDados))
						.addComponent(lblNewLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
		
		
	}
	
	private void chamarProximo(){
		
		try {
			String senha = fila.atenderProximo().getNumero();
			String tipo = tipoFicha.getNome();
		} catch (FilaVaziaException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComponent elemento = (JComponent) e.getSource();
		if(elemento.equals(btFinalizar)){
			this.dispose();
			DialogRealizarAtendimento d = new DialogRealizarAtendimento();
			d.setVisible(true);
		}
		
	}
}
