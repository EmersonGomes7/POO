package interfaceGrafica;
import empresa.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame{

	private static JFrame frameTelaCadastro;
	private JTextField textNome;
	private JTextField textIdade;
	private JTextField textSexo;
	private JTextField textCargo;
	private JTextField textCpf;
	private JTextField textSalario;
	private JTextField textDataNascimento;

	public TelaCadastro() {
		initialize();
	}

	private void initialize() {
		frameTelaCadastro = new JFrame();
		frameTelaCadastro.setBounds(100, 100, 631, 441);
		frameTelaCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setForeground(new Color(0, 0, 0));
		frameTelaCadastro.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNome.setBounds(82, 92, 68, 14);
		panel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(82, 117, 321, 20);
		panel.add(textNome);
		textNome.setColumns(10);

		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Verdana", Font.BOLD, 12));
		lblIdade.setBounds(448, 92, 68, 14);
		panel.add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.setBounds(448, 117, 46, 20);
		panel.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSexo.setBounds(82, 176, 54, 14);
		panel.add(lblSexo);
		
		textSexo = new JTextField();
		textSexo.setBounds(82, 205, 36, 20);
		panel.add(textSexo);
		textSexo.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCargo.setBounds(169, 176, 46, 14);
		panel.add(lblCargo);
		
		textCargo = new JTextField();
		textCargo.setBounds(169, 205, 86, 20);
		panel.add(textCargo);
		textCargo.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf");
		lblCpf.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCpf.setBounds(323, 176, 46, 14);
		panel.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(320, 205, 174, 20);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSalario.setBounds(82, 249, 59, 14);
		panel.add(lblSalario);
		
		textSalario = new JTextField();
		textSalario.setBounds(82, 274, 86, 20);
		panel.add(textSalario);
		textSalario.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		lblDataNascimento.setFont(new Font("Verdana", Font.BOLD, 12));
		lblDataNascimento.setBounds(291, 249, 143, 14);
		panel.add(lblDataNascimento);
		
		textDataNascimento = new JTextField();
		textDataNascimento.setBounds(291, 274, 130, 20);
		panel.add(textDataNascimento);
		textDataNascimento.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Funcionario Cadastrado!");
				String nome1 = textNome.getText();
				int idade1 = Integer.parseInt(textIdade.getText());
                char sexo1 = textSexo.getText().charAt(0);
                String cpf1=textCpf.getText();
                String cargo1=textCargo.getText();
                double salario1=Double.parseDouble(textSalario.getText());
                LocalDate dataNascimento1 = LocalDate.parse(textDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			Funcionario novo=new Funcionario(nome1,idade1,sexo1,cpf1,cargo1,salario1,dataNascimento1);
			BlocosInstrucoes.insereFuncionario(novo);
			}
		});
		btnCadastrar.setFont(new Font("Verdana", Font.BOLD, 12));
		btnCadastrar.setBounds(256, 345, 113, 23);
		panel.add(btnCadastrar);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textIdade.setText("");
				textCargo.setText("");
				textSexo.setText("");
				textCpf.setText("");
				textDataNascimento.setText("");
				textSalario.setText("");
			}
		});
		btnNovo.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNovo.setBounds(241, 37, 89, 23);
		panel.add(btnNovo);
		
		JButton btnNewButton = new JButton("Voltar Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SegundaTela();
				frameTelaCadastro.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 11));
		btnNewButton.setBounds(455, 345, 116, 23);
		panel.add(btnNewButton);
		frameTelaCadastro.setLocationRelativeTo(null);
		frameTelaCadastro.setVisible(true);
		
	}
	
}
