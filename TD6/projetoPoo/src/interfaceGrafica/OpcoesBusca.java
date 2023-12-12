package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import empresa.BlocosInstrucoes;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpcoesBusca {

	private JFrame frame;
	private JTextField textNomeOuCpf;
	private JTextField textSalarioMinimo;
	private JTextField textSalarioMaximo;

	public OpcoesBusca() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busca Avançada");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(197, 44, 197, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textNomeOuCpf = new JTextField();
		textNomeOuCpf.setBounds(53, 150, 367, 20);
		frame.getContentPane().add(textNomeOuCpf);
		textNomeOuCpf.setColumns(10);
		
		textSalarioMinimo = new JTextField();
		textSalarioMinimo.setColumns(10);
		textSalarioMinimo.setBounds(95, 271, 127, 20);
		frame.getContentPane().add(textSalarioMinimo);
		
		JLabel lblNomeOuCpf = new JLabel("Digite Nome ou CPF");
		lblNomeOuCpf.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNomeOuCpf.setBounds(53, 109, 149, 14);
		frame.getContentPane().add(lblNomeOuCpf);
		
		JLabel lblSalario = new JLabel("Digite Salario R$");
		lblSalario.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSalario.setBounds(53, 223, 127, 14);
		frame.getContentPane().add(lblSalario);
		
		JButton btnBuscaNomeOuCpf = new JButton("Buscar");
		btnBuscaNomeOuCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dado=textNomeOuCpf.getText();
				BlocosInstrucoes.buscaPorNomeOuCpf(dado);
				frame.setVisible(false);
			}
			
		});
		btnBuscaNomeOuCpf.setFont(new Font("Verdana", Font.BOLD, 12));
		btnBuscaNomeOuCpf.setBounds(445, 148, 89, 23);
		frame.getContentPane().add(btnBuscaNomeOuCpf);
		
		JButton btnBuscaSalario = new JButton("Buscar");
		btnBuscaSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int SalarioMinimo = Integer.parseInt(textSalarioMinimo.getText());
				int SalarioMaximo = Integer.parseInt(textSalarioMaximo.getText());
				BlocosInstrucoes.buscaPorSalario(SalarioMinimo,SalarioMaximo);
				frame.setVisible(false);
			}
		});
		btnBuscaSalario.setFont(new Font("Verdana", Font.BOLD, 12));
		btnBuscaSalario.setBounds(217, 328, 89, 23);
		frame.getContentPane().add(btnBuscaSalario);
		
		JLabel lblMin = new JLabel("MÍN");
		lblMin.setFont(new Font("Verdana", Font.BOLD, 12));
		lblMin.setBounds(51, 273, 34, 14);
		frame.getContentPane().add(lblMin);
		
		JLabel lblMx = new JLabel("MÁX");
		lblMx.setFont(new Font("Verdana", Font.BOLD, 12));
		lblMx.setBounds(249, 273, 34, 14);
		frame.getContentPane().add(lblMx);
		
		textSalarioMaximo = new JTextField();
		textSalarioMaximo.setColumns(10);
		textSalarioMaximo.setBounds(293, 271, 127, 20);
		frame.getContentPane().add(textSalarioMaximo);
		frame.setBounds(100, 100, 630, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
