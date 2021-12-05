package Application;

import java.awt.EventQueue;

import Bibliotheque.Lecteur;
import Bibliotheque.Sanction;
import Bibliotheque.Emprunt;
import Bibliotheque.Document;
import Bibliotheque.Exemplaire;
import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GestionEmprunt extends JFrame{
	private JFrame frame;
	private JTextField LecEmpField;
	private JTextField DateEmpField;
	private JTextField DateRetEmpField;
	private JTextField ExemEmpField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionEmprunt window = new GestionEmprunt();
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
	public GestionEmprunt() {
		getContentPane().setLayout(null);
		
		JLabel lblIdLecteur = new JLabel("Lecteur :");
		lblIdLecteur.setForeground(Color.BLACK);
		lblIdLecteur.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblIdLecteur.setBounds(47, 182, 133, 29);
		getContentPane().add(lblIdLecteur);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_4.setBounds(37, 185, 143, 29);
		getContentPane().add(label_4);
		
		JLabel lblExemplaire = new JLabel("Exemplaire :");
		lblExemplaire.setForeground(Color.BLACK);
		lblExemplaire.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblExemplaire.setBounds(47, 308, 133, 29);
		getContentPane().add(lblExemplaire);
		
		JLabel lblAjouterUnEmprunt = new JLabel("Ajouter un emprunt :");
		lblAjouterUnEmprunt.setForeground(Color.BLACK);
		lblAjouterUnEmprunt.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblAjouterUnEmprunt.setBounds(112, 122, 159, 29);
		getContentPane().add(lblAjouterUnEmprunt);
		
		LecEmpField = new JTextField();
		LecEmpField.setBounds(192, 186, 170, 29);
		getContentPane().add(LecEmpField);
		LecEmpField.setColumns(10);
		
		DateEmpField = new JTextField();
		DateEmpField.setColumns(10);
		DateEmpField.setBounds(192, 228, 170, 29);
		getContentPane().add(DateEmpField);
		
		DateRetEmpField = new JTextField();
		DateRetEmpField.setColumns(10);
		DateRetEmpField.setBounds(192, 266, 170, 29);
		getContentPane().add(DateRetEmpField);
		
		ExemEmpField = new JTextField();
		ExemEmpField.setColumns(10);
		ExemEmpField.setBounds(192, 308, 170, 29);
		getContentPane().add(ExemEmpField);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(405, 126, 343, 301);
		getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Afficher");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sanction sanction = Sanction.vert; ;
				Lecteur lecteurAjouter = new Lecteur("Adnane EL KASMI", 17, "elkasmiadn@eisti.eu", sanction);

				textArea.setText(lecteurAjouter.afficherEmprunts());
				
				
			}
		});
		btnNewButton.setBounds(535, 440, 97, 25);
		getContentPane().add(btnNewButton);
		
		JLabel lblDateDeRetour = new JLabel("Date de retour :");
		lblDateDeRetour.setForeground(Color.BLACK);
		lblDateDeRetour.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDateDeRetour.setBounds(47, 266, 133, 29);
		getContentPane().add(lblDateDeRetour);
		
		JButton AjoutEmpButton = new JButton("Ajouter");
		AjoutEmpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				//Lecteur lecteur = Lecteur.valueOf(LecEmpField.getText().toString());
				Date dateEmprunt = Date.valueOf(DateEmpField.getText().toString());
				Date dateRetour = Date.valueOf(DateRetEmpField.getText().toString());
				//Exemplaire exemplaire = Exemplaire.valueOf(ExemEmpField.getText().toString());
				
				

				Sanction sanction = Sanction.vert; ;
				Lecteur lecteurAjouter = new Lecteur("Adnane EL KASMI", 17, "elkasmiadn@eisti.eu", sanction);
				Exemplaire exemplaire = new Exemplaire(1594186, "RF48JIY48");
				
				Emprunt empruntAjouter = new Emprunt(dateEmprunt, dateRetour, lecteurAjouter, exemplaire);
				

			}
		});
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		label_8.setBounds(405, 397, 343, 84);
		getContentPane().add(label_8);
		
		JLabel lblListesDesEmprunts = new JLabel("Listes des emprunts :");
		lblListesDesEmprunts.setForeground(Color.BLACK);
		lblListesDesEmprunts.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblListesDesEmprunts.setBounds(496, 77, 159, 29);
		getContentPane().add(lblListesDesEmprunts);
		AjoutEmpButton.setBounds(142, 364, 97, 25);
		getContentPane().add(AjoutEmpButton);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fonblanc.jpg"));
		label_10.setBounds(485, 78, 170, 29);
		getContentPane().add(label_10);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		label_9.setBounds(405, 67, 343, 84);
		getContentPane().add(label_9);
		
		JLabel lblDateDemprunt = new JLabel("Date d'emprunt :");
		lblDateDemprunt.setForeground(Color.BLACK);
		lblDateDemprunt.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDateDemprunt.setBounds(47, 224, 133, 29);
		getContentPane().add(lblDateDemprunt);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_7.setBounds(37, 308, 143, 29);
		getContentPane().add(label_7);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_6.setBounds(37, 266, 143, 29);
		getContentPane().add(label_6);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_5.setBounds(37, 224, 143, 29);
		getContentPane().add(label_5);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		lblNewLabel_2.setBounds(105, 123, 170, 29);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fonblanc.jpg"));
		lblNewLabel_1.setBounds(27, 114, 343, 294);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		label_2.setBounds(27, 88, 343, 84);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		label_3.setBounds(27, 348, 343, 84);
		getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("TP2 - Projet bibloth\u00E8que JAVA \u00A9 Adnane & Jules");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(229, 556, 343, 16);
		getContentPane().add(label_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label.setBounds(215, 551, 370, 29);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fondEmprunt.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 632);
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
