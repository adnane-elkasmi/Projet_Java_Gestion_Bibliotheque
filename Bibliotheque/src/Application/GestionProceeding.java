package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class GestionProceeding extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionProceeding window = new GestionProceeding();
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
	public GestionProceeding() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("TP2 - Projet bibloth\u00E8que JAVA \u00A9 Adnane & Jules");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(230, 564, 343, 16);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_1.setBounds(217, 559, 370, 29);
		getContentPane().add(label_1);
		
		JLabel lblGestionDeProceedings = new JLabel("Gestion de Proceedings");
		lblGestionDeProceedings.setForeground(Color.BLACK);
		lblGestionDeProceedings.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGestionDeProceedings.setBounds(334, 24, 167, 16);
		getContentPane().add(lblGestionDeProceedings);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_3.setBounds(324, 19, 177, 29);
		getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Book.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 593);
		getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(217, 13, 370, 29);
		getContentPane().add(label_2);
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
