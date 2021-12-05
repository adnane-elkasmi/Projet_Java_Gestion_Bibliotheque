package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdministrateur extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdministrateur window = new MenuAdministrateur();
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
	public MenuAdministrateur() {
		getContentPane().setLayout(null);
		
		JLabel lblGestionDeWw = new JLabel("Gestion du lecteur");
		lblGestionDeWw.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGestionDeWw.setBounds(484, 398, 136, 29);
		getContentPane().add(lblGestionDeWw);
		
		JLabel lblNewLabel_6 = new JLabel("Gestion de documents");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(123, 399, 167, 29);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		lblNewLabel_7.setBounds(474, 399, 167, 28);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		lblNewLabel_8.setBounds(123, 399, 167, 28);
		getContentPane().add(lblNewLabel_8);
		
		JButton DocumentNewButton = new JButton("");
		DocumentNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GestionDocument gestionDoc = new GestionDocument();
				
				gestionDoc.setBounds(100, 100, 800, 640);
				gestionDoc.setTitle("TP2 Projet JAVA - Biblithèque : Gestion de document");
				gestionDoc.setVisible(true); // Ouvrir la fenetre gestionDoc
			}
		});
		DocumentNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\document.png"));
		DocumentNewButton.setBounds(123, 227, 167, 159);
		getContentPane().add(DocumentNewButton);
		
		JButton LecteurNewButton = new JButton("");
		LecteurNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GestionLecteur gestionLec = new GestionLecteur();
				
				gestionLec.setBounds(100, 100, 800, 640);
				gestionLec.setTitle("TP2 Projet JAVA - Biblithèque : Gestion du Lecteur");
				gestionLec.setVisible(true); // Ouvrir la fenetre gestionLec
				
			}
		});
		LecteurNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\lecteur.png"));
		LecteurNewButton.setBounds(474, 227, 167, 159);
		getContentPane().add(LecteurNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("TP2 - Projet bibloth\u00E8que JAVA \u00A9 Adnane & Jules");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(234, 563, 343, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		lblNewLabel_4.setBounds(217, 557, 370, 29);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Header.jpg"));
		lblNewLabel_1.setBounds(39, 0, 743, 146);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\bibliotheque2.jpg"));
		lblNewLabel_5.setBounds(0, 0, 782, 95);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(234, 563, 56, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fondmenu.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 592);
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("TP2 Projet JAVA - Biblithèque : Menu");
		frame.setBounds(100, 100, 800, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
