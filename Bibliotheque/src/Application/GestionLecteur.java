package Application;

import Bibliotheque.Lecteur;

import Bibliotheque.Sanction;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextPane;

import Bibliotheque.Sanction;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GestionLecteur extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionLecteur window = new GestionLecteur();
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
	public GestionLecteur() {
		getContentPane().setLayout(null);
		
		JTextPane NomEtudetextPane = new JTextPane();
		NomEtudetextPane.setBounds(158, 143, 176, 29);
		getContentPane().add(NomEtudetextPane);
		
		JTextPane IdEtudetextPane = new JTextPane();
		IdEtudetextPane.setBounds(158, 185, 176, 29);
		getContentPane().add(IdEtudetextPane);
		
		JTextPane EmailEtudetextPane = new JTextPane();
		EmailEtudetextPane.setBounds(158, 227, 176, 29);
		getContentPane().add(EmailEtudetextPane);
		
		JTextPane SanctionEtudetextPane = new JTextPane();
		SanctionEtudetextPane.setForeground(Color.BLACK);
		SanctionEtudetextPane.setText("       Vert (Par defaut)");
		SanctionEtudetextPane.setBounds(158, 269, 176, 29);
		getContentPane().add(SanctionEtudetextPane);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String nom = NomEtudetextPane.getText().toString();
				Integer id = Integer.valueOf(IdEtudetextPane.getText().toString());
				String email = EmailEtudetextPane.getText().toString();
				Sanction sanction = Sanction.vert; ;
				
				Lecteur lecteurAjouter = new Lecteur(nom, id, email, sanction);
				
			}
		});
		btnAjouter.setBounds(126, 321, 97, 25);
		getContentPane().add(btnAjouter);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.BOLD, 13));
		textArea.setBounds(414, 105, 326, 329);
		getContentPane().add(textArea);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNom.setBounds(56, 143, 56, 29);
		getContentPane().add(lblNom);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblId.setBounds(76, 185, 56, 29);
		getContentPane().add(lblId);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblEmail.setBounds(56, 227, 76, 29);
		getContentPane().add(lblEmail);
		
		JLabel lblSanction = new JLabel("Sanction :");
		lblSanction.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblSanction.setBounds(41, 269, 87, 29);
		getContentPane().add(lblSanction);
		
		JLabel lblListesDesLecteurs = new JLabel("Listes des lecteurs :");
		lblListesDesLecteurs.setForeground(Color.BLACK);
		lblListesDesLecteurs.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblListesDesLecteurs.setBounds(502, 66, 149, 29);
		getContentPane().add(lblListesDesLecteurs);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_11.setBounds(494, 67, 160, 29);
		getContentPane().add(label_11);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		label_9.setBounds(414, 88, 326, 84);
		getContentPane().add(label_9);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fonblanc.jpg"));
		label_6.setBounds(30, 269, 102, 29);
		getContentPane().add(label_6);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fonblanc.jpg"));
		label_5.setBounds(30, 227, 102, 29);
		getContentPane().add(label_5);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fonblanc.jpg"));
		label_4.setBounds(30, 185, 102, 29);
		getContentPane().add(label_4);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fonblanc.jpg"));
		label_3.setBounds(30, 143, 102, 29);
		getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GestionEmprunt gestionEmpr = new GestionEmprunt();

				gestionEmpr.setBounds(100, 100, 800, 640);
				gestionEmpr.setTitle("TP2 Projet JAVA - Biblithèque : Gestion emprunt");
				gestionEmpr.setVisible(true); // Ouvrir la fenetre gestionEmpr
				
			}
		});
		
		JButton btnAfficher = new JButton("Afficher");
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText(Lecteur.afficherLecteurs());
				
			}
		});
		btnAfficher.setBounds(532, 447, 97, 25);
		getContentPane().add(btnAfficher);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\emprunt.png"));
		btnNewButton.setBounds(30, 388, 126, 123);
		getContentPane().add(btnNewButton);
		
		JLabel lblAjouterUnLecteur = new JLabel("Ajouter un lecteur :");
		lblAjouterUnLecteur.setForeground(Color.BLACK);
		lblAjouterUnLecteur.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblAjouterUnLecteur.setBounds(96, 101, 149, 29);
		getContentPane().add(lblAjouterUnLecteur);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fonblanc.jpg"));
		label_2.setBounds(85, 102, 160, 29);
		getContentPane().add(label_2);
		
		JLabel label = new JLabel("TP2 - Projet bibloth\u00E8que JAVA \u00A9 Adnane & Jules");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(227, 557, 343, 16);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_1.setBounds(210, 551, 370, 29);
		getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		lblNewLabel_1.setBounds(12, 89, 343, 268);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		label_7.setBounds(12, 72, 343, 84);
		getContentPane().add(label_7);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		lblNewLabel_2.setBounds(12, 291, 343, 84);
		getContentPane().add(lblNewLabel_2);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		label_10.setBounds(414, 388, 326, 99);
		getContentPane().add(label_10);
		
		JLabel lblEmprunt = new JLabel("Emprunt");
		lblEmprunt.setForeground(Color.BLACK);
		lblEmprunt.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEmprunt.setBounds(56, 516, 76, 29);
		getContentPane().add(lblEmprunt);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_12.setBounds(30, 517, 126, 29);
		getContentPane().add(label_12);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fondLecteur.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 640);
		getContentPane().add(lblNewLabel);
		
		JLabel label_8 = new JLabel("Ajouter un lecteur :");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		label_8.setBounds(513, 89, 149, 29);
		getContentPane().add(label_8);
		initialize();
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("TP2 Projet JAVA - Biblithèque : Gestion du lecteur");
		frame.setBounds(100, 100, 800, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
