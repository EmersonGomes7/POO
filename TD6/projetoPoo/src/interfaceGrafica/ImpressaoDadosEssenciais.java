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

public class ImpressaoDadosEssenciais {

	private static JFrame frame;
	private JTable tabelaDadosEssenciais;
	private static DefaultTableModel modeloTabela;

	public ImpressaoDadosEssenciais() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.setBounds(100, 100, 630, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 594, 323);
		frame.getContentPane().add(scrollPane);
		
		tabelaDadosEssenciais = new JTable();
		scrollPane.setViewportView(tabelaDadosEssenciais);
		tabelaDadosEssenciais.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "SALARIO", "CARGO"
			}
		));
		tabelaDadosEssenciais.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JButton inicio = new JButton("Início");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SegundaTela();
				frame.setVisible(false);
				modeloTabela=null;
			}
		});
		inicio.setFont(new Font("Verdana", Font.BOLD, 12));
		inicio.setBounds(478, 345, 109, 23);
		frame.getContentPane().add(inicio);
		modeloTabela = (DefaultTableModel) tabelaDadosEssenciais.getModel();
	}

	public static void adicionarAlgunsDadosFuncionario(Funcionario funcionario) {
	if(modeloTabela==null)
		new ImpressaoDadosEssenciais();		
	Object[] Algunsdados = { funcionario.getNome(), funcionario.getCargo(), funcionario.getSalario()};
	modeloTabela.addRow(Algunsdados);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}
}

