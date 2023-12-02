package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class SegundaTela1 extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaTela1 frame = new SegundaTela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SegundaTela1() {
		setBounds(100, 100, 450, 300);

	}

}
