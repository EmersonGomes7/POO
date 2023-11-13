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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					TelaCadastro window1 = new TelaCadastro();			
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameTelaCadastro = new JFrame();
		frameTelaCadastro.setBounds(100, 100, 477, 333);
		frameTelaCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setForeground(new Color(0, 0, 0));
		frameTelaCadastro.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNome.setBounds(39, 53, 68, 14);
		panel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(38, 69, 255, 20);
		panel.add(textNome);
		textNome.setColumns(10);

		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Verdana", Font.BOLD, 12));
		lblIdade.setBounds(335, 54, 68, 14);
		panel.add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.setBounds(335, 69, 46, 20);
		panel.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSexo.setBounds(39, 114, 54, 14);
		panel.add(lblSexo);
		
		textSexo = new JTextField();
		textSexo.setBounds(39, 128, 36, 20);
		panel.add(textSexo);
		textSexo.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCargo.setBounds(122, 115, 46, 14);
		panel.add(lblCargo);
		
		textCargo = new JTextField();
		textCargo.setBounds(122, 128, 86, 20);
		panel.add(textCargo);
		textCargo.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf");
		lblCpf.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCpf.setBounds(247, 115, 46, 14);
		panel.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(247, 128, 174, 20);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSalario.setBounds(50, 183, 59, 14);
		panel.add(lblSalario);
		
		textSalario = new JTextField();
		textSalario.setBounds(49, 198, 86, 20);
		panel.add(textSalario);
		textSalario.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		lblDataNascimento.setFont(new Font("Verdana", Font.BOLD, 12));
		lblDataNascimento.setBounds(201, 184, 143, 14);
		panel.add(lblDataNascimento);
		
		textDataNascimento = new JTextField();
		textDataNascimento.setBounds(201, 198, 130, 20);
		panel.add(textDataNascimento);
		textDataNascimento.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome1 = textNome.getText();
				int idade1 = Integer.parseInt(textIdade.getText());
                char sexo1 = textSexo.getText().charAt(0);
                String cpf1=textCpf.getText();
                String cargo1=textCargo.getText();
                double salario1=Double.parseDouble(textSalario.getText());
                LocalDate dataNascimento1 = LocalDate.parse(textDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			Funcionario novo=(Atendente)new Atendente(nome1,idade1,sexo1,cpf1,cargo1,salario1,dataNascimento1);
			BlocosInstrucoes.insereFuncionario(novo);
			
			//BlocosInstrucoes.imprimeAlgunsDadosFuncionarios();
			}
		});
		btnCadastrar.setFont(new Font("Verdana", Font.BOLD, 12));
		btnCadastrar.setBounds(165, 247, 113, 23);
		panel.add(btnCadastrar);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNovo.setBounds(32, 11, 89, 23);
		panel.add(btnNovo);
		
		JButton btnNewButton = new JButton("Voltar Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SegundaTela();
				frameTelaCadastro.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 11));
		btnNewButton.setBounds(335, 247, 116, 23);
		panel.add(btnNewButton);
		frameTelaCadastro.setLocationRelativeTo(null);
		frameTelaCadastro.setVisible(true);
		
	}
	
}
