/*package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import empresa.Funcionario;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JList;

public class ImprimirAlgunsDados {

	private JFrame frame;
	//private JTable table;
	//private static JTable Tabela;
	private static JScrollPane tabela;
	private static DefaultTableModel modeloTabela;
	 private static JFrame frameTelaCadastro;
	    private JTable tabelaFuncionarios;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImprimirAlgunsDados window = new ImprimirAlgunsDados();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ImprimirAlgunsDados() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(21, 11, 403, 239);
		frame.getContentPane().add(scrollPane_6);
		
		table_1 = new JTable();
		scrollPane_6.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "CARGO", "SALARIO", "CPF", "SEXO", "IDADE"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		
		 modeloTabela = new DefaultTableModel();
	        modeloTabela.addColumn("Nome");
	        modeloTabela.addColumn("Idade");
	        modeloTabela.addColumn("Sexo");
	        modeloTabela.addColumn("CPF");
	        modeloTabela.addColumn("Cargo");
	        modeloTabela.addColumn("Salário");
	        modeloTabela.addColumn("Data de Nascimento");

	        tabelaFuncionarios = new JTable(modeloTabela);
	        JScrollPane scrollPane = new JScrollPane(tabelaFuncionarios);
	        scrollPane.setBounds(10, 280, 450, 150);
	        frameTelaCadastro.getContentPane().add(scrollPane);

	        frame.setLocationRelativeTo(null);
			frame.setVisible(true);
	    }

	    public static void adicionarFuncionarioNaTabela(Funcionario funcionario) {
	        Object[] dados = {
	            funcionario.getNome(),
	            funcionario.getIdade(),
	            funcionario.getSexo(),
	            funcionario.getCpf(),
	            funcionario.getCargo(),
	            funcionario.getSalario(),
	            funcionario.getDataNascimento()
	        };
	        modeloTabela.addRow(dados);
	    }

}*/
package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import empresa.Funcionario;

public class ImprimirAlgunsDados {

    private JFrame frame;
    private JTable tabelaFuncionarios;
    private static DefaultTableModel modeloTabela;
    private static ImprimirAlgunsDados instance;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ImprimirAlgunsDados window = new ImprimirAlgunsDados();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ImprimirAlgunsDados() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(21, 11, 403, 239);
        frame.getContentPane().add(scrollPane);

        tabelaFuncionarios = new JTable();
        scrollPane.setViewportView(tabelaFuncionarios);
        tabelaFuncionarios.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "NOME", "CARGO", "SALARIO", "CPF", "SEXO", "IDADE" }
        ) {
            Class[] columnTypes = new Class[] { String.class, String.class, Double.class, String.class, String.class,
                    Integer.class };

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });

        modeloTabela = (DefaultTableModel) tabelaFuncionarios.getModel();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static ImprimirAlgunsDados getInstance() {
        if (instance == null) {
            instance = new ImprimirAlgunsDados();
        }
        return instance;
    }
    public static void adicionarFuncionarioNaTabela(Funcionario funcionario) {
        Object[] dados = { funcionario.getNome(), funcionario.getIdade(), funcionario.getSexo(), funcionario.getCpf(),
                funcionario.getCargo(), funcionario.getSalario(), funcionario.getDataNascimento() };
        modeloTabela.addRow(dados);
    }
}

