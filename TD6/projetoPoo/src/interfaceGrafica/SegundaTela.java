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

	public SegundaTela() {
		initialize();
	}

	public static void initialize() {	
		frameSegundaTela = new JFrame("frameSegundaTela");			
		frameSegundaTela.getContentPane().setBackground(new Color(32, 178, 170));
		frameSegundaTela.getContentPane().setEnabled(false);
		frameSegundaTela.getContentPane().setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 583, 367);
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
		btnInserir.setBounds(49, 139, 110, 92);
		panel.add(btnInserir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new OpcoesBusca();
				frameSegundaTela.setVisible(false);
			}
		});
		btnBuscar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnBuscar.setBounds(225, 139, 110, 92);
		panel.add(btnBuscar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new OpcoesImpressao();
				frameSegundaTela.setVisible(false);
			}
		});
		btnImprimir.setFont(new Font("Verdana", Font.BOLD, 14));
		btnImprimir.setBounds(398, 139, 110, 92);
		panel.add(btnImprimir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		tabbedPane.addTab("Sobre", null, panel_1, null);
		frameSegundaTela.setBounds(100, 100, 630, 441);
		frameSegundaTela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameSegundaTela.setLocationRelativeTo(null);
		frameSegundaTela.setVisible(true);
	}
}
