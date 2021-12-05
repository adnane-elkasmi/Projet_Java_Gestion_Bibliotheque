package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class GestionLivre extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionLivre window = new GestionLivre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionLivre() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("TP2 - Projet bibloth\u00E8que JAVA \u00A9 Adnane & Jules");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(224, 564, 343, 16);
		getContentPane().add(label);
		
		JLabel lblGestionDesLivres = new JLabel("Gestion de livres");
		lblGestionDesLivres.setForeground(Color.BLACK);
		lblGestionDesLivres.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGestionDesLivres.setBounds(317, 13, 128, 16);
		getContentPane().add(lblGestionDesLivres);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_2.setBounds(308, 8, 134, 29);
		getContentPane().add(label_2);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_1.setBounds(211, 559, 370, 29);
		getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Book.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 593);
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
