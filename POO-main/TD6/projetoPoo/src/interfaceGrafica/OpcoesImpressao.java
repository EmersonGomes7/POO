package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;

import empresa.BlocosInstrucoes;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpcoesImpressao {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcoesImpressao window = new OpcoesImpressao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OpcoesImpressao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.getContentPane().setLayout(null);
		
		JButton btnTodosDados = new JButton("Todos os Dados");
		btnTodosDados.setBounds(23, 104, 114, 73);
		frame.getContentPane().add(btnTodosDados);
		
		JButton btnAlgunsDados = new JButton("Alguns Dados");
		btnAlgunsDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlocosInstrucoes.imprimeAlgunsDadosFuncionarios();
				frame.setVisible(false);
			}
		});
		btnAlgunsDados.setBounds(161, 104, 108, 73);
		frame.getContentPane().add(btnAlgunsDados);
		
		JButton btnNewButton = new JButton("Maior Salario");
		btnNewButton.setBounds(293, 104, 108, 73);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
