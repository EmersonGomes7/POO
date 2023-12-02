package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import empresa.Funcionario;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImpressaoGeral {

	private static JFrame frame;
	private JTable tabelaDadosGerais;
	private static DefaultTableModel modeloTabela;
	private JButton inicio;

	public ImpressaoGeral() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.setBounds(100, 100, 630, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 579, 311);
		frame.getContentPane().add(scrollPane);
		
		tabelaDadosGerais = new JTable();
		scrollPane.setViewportView(tabelaDadosGerais);
		tabelaDadosGerais.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "IDADE", "SEXO", "CPF", "CARGO", "SALARIO", "DATA NASCIMENTO"
			}
		));
		tabelaDadosGerais.setFont(new Font("Verdana", Font.BOLD, 11));
		
		inicio= new JButton("Início");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SegundaTela();
				frame.setVisible(false);
				modeloTabela =null;
			}
		});
		inicio.setFont(new Font("Verdana", Font.BOLD, 12));
		inicio.setBounds(471, 356, 118, 23);
		frame.getContentPane().add(inicio);
		modeloTabela = (DefaultTableModel) tabelaDadosGerais.getModel();
	}
	public static void adicionarTodosDadosFuncionario(Funcionario funcionario) {
	if(modeloTabela==null)
		new ImpressaoGeral();		
	Object[] dadosGerais = { funcionario.getNome(),funcionario.getIdade(),funcionario.getSexo(),funcionario.getCpf(), funcionario.getCargo(), funcionario.getSalario(),
			funcionario.getDataNascimento()};
	modeloTabela.addRow(dadosGerais);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}
}
