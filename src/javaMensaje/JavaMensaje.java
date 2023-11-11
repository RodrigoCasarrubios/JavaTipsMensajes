package javaMensaje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		panel_Principal.setLayout(new BorderLayout(0, 0));
		
		JButton btnDerecha = new JButton("Right Button");
		btnDerecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Hiciste click en el Right button");
				
				JOptionPane.showMessageDialog(null, "Declara siempre las variables ;)" +  "\n" + "Cuidado con lo que haces");
			}
		});
		panel_Principal.add(btnDerecha, BorderLayout.EAST);
		
		JButton btnIzquierda = new JButton("Left Button");
		btnIzquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Hiciste click en el Left button");
				
				JOptionPane.showMessageDialog(null, "Al crear un objeto crea constructores ;)" +  "\n" + "Crea uno vacio primero");
			}
		});
		panel_Principal.add(btnIzquierda, BorderLayout.WEST);
		
		JButton btnMedio = new JButton("Mid button");
		btnMedio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Hiciste click en el Mid button");
				
				JOptionPane.showMessageDialog(null, "Para ser mas ordeando haz metodos" +  "\n" + "Hazlos pero con cabeza");
			}
		});
		panel_Principal.add(btnMedio, BorderLayout.CENTER);
	}

}
