package interfaceGrafica;

import empresa.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class LoginTela extends JFrame {

	private static JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.gd
	 */

	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			LoginTela window3 = new LoginTela();
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
		}
	});
	}
	
	public LoginTela() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 477, 333);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbLogin = new JLabel("Login");
		lbLogin.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lbLogin.setBounds(127, 123, 63, 18);
		frame.getContentPane().add(lbLogin);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		txtLogin.setBounds(127, 152, 206, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblSenha.setBounds(131, 183, 63, 18);
		frame.getContentPane().add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificarLogin(txtLogin.getText(),new  String(txtSenha.getPassword()))) {
					setLocationRelativeTo(null);
					abrirSegundaTela();
				}
				else {
					JOptionPane.showMessageDialog(null,"erro ao realizar login","meu titulo",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnEntrar.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		btnEntrar.setBounds(186, 250, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JLabel lblTitulo = new JLabel("Sistema Registrador de Funcionários");
		lblTitulo.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 19));
		lblTitulo.setBounds(38, 38, 418, 74);
		frame.getContentPane().add(lblTitulo);
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtSenha.setBounds(127, 212, 206, 20);
		frame.getContentPane().add(txtSenha);
	}
	public boolean verificarLogin(String login,String senha) {
		return (login.equals("u") && senha.equals("1"));
	}
	public void abrirSegundaTela() {
	SwingUtilities.invokeLater(() ->{
		SegundaTela segundaTela=new SegundaTela();
		frame.setVisible(false);
		
	});
		
	
	}
}
