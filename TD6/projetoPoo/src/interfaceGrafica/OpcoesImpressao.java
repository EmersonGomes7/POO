package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;

import empresa.BlocosInstrucoes;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class OpcoesImpressao {

	private JFrame frame;

	public OpcoesImpressao() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.getContentPane().setLayout(null);
		
		JButton btnTodosDados = new JButton("Todos os Dados");
		btnTodosDados.setFont(new Font("Verdana", Font.BOLD, 12));
		btnTodosDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlocosInstrucoes.imprimeTodosDadosFuncionarios();
				frame.setVisible(false);
			}
		});
		btnTodosDados.setBounds(50, 150, 141, 91);
		frame.getContentPane().add(btnTodosDados);
		
		JButton btnAlgunsDados = new JButton("Alguns Dados");
		btnAlgunsDados.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAlgunsDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlocosInstrucoes.imprimeAlgunsDadosFuncionarios();
				frame.setVisible(false);
			}
		});
		btnAlgunsDados.setBounds(253, 150, 122, 91);
		frame.getContentPane().add(btnAlgunsDados);
		
		JButton btnNewButton = new JButton("Maior Salario");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				BlocosInstrucoes.imprimeFuncionarioMaiorSalario();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(433, 150, 131, 91);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 640, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
