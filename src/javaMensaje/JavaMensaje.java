package javaMensaje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class JavaMensaje {

	private JFrame frmEmpleoremoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaMensaje window = new JavaMensaje();
					window.frmEmpleoremoto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaMensaje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmpleoremoto = new JFrame();
		frmEmpleoremoto.setTitle("EmpleoRemoto");
		frmEmpleoremoto.setBounds(100, 100, 450, 300);
		frmEmpleoremoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmpleoremoto.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Principal = new JPanel();
		frmEmpleoremoto.getContentPane().add(panel_Principal, BorderLayout.CENTER);
	}

}
