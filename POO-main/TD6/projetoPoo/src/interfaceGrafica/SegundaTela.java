package interfaceGrafica;
import empresa.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JTree;

public class SegundaTela extends JFrame {
	 public static JFrame frameSegundaTela;
	
	/**
	 * Launch the application.
	 */
	 public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					//SegundaTela window = new SegundaTela();	
					//window.frameSegundaTela.setLocationRelativeTo(null);
					SegundaTela window = new SegundaTela();
                    window.initialize();
				}
			});
		}
	/**
	 * Create the application.
	 */
	public SegundaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void initialize() {	
		frameSegundaTela = new JFrame("frameSegundaTela");			
		frameSegundaTela.getContentPane().setBackground(new Color(32, 178, 170));
		frameSegundaTela.getContentPane().setEnabled(false);
		frameSegundaTela.getContentPane().setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 441, 274);
		frameSegundaTela.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		tabbedPane.addTab("Menu Principal", null, panel, null);
		panel.setLayout(null);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro();
				frameSegundaTela.setVisible(false);			}
		});
		btnInserir.setFont(new Font("Verdana", Font.BOLD, 14));
		btnInserir.setBounds(34, 93, 110, 92);
		panel.add(btnInserir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnBuscar.setBounds(164, 93, 110, 92);
		panel.add(btnBuscar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new OpcoesImpressao();
				frameSegundaTela.setVisible(false);
			}
		});
		btnImprimir.setFont(new Font("Verdana", Font.BOLD, 14));
		btnImprimir.setBounds(295, 93, 110, 92);
		panel.add(btnImprimir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		tabbedPane.addTab("Sobre", null, panel_1, null);
		frameSegundaTela.setBounds(100, 100, 477, 335);
		frameSegundaTela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameSegundaTela.setLocationRelativeTo(null);
		frameSegundaTela.setVisible(true);
	}
}
