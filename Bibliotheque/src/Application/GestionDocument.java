package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionDocument extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDocument window = new GestionDocument();
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
	public GestionDocument() {
		getContentPane().setLayout(null);
		
		JButton LivreNewButton = new JButton("");
		LivreNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GestionLivre gestionlivre = new GestionLivre();

				gestionlivre.setBounds(100, 100, 800, 640);
				gestionlivre.setTitle("TP2 Projet JAVA - Biblithèque : Gestion Livre");
				gestionlivre.setVisible(true); // Ouvrir la fenetre gestionlivre
				
			}
		});
		LivreNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\livre.png"));
		LivreNewButton.setBounds(12, 138, 180, 159);
		getContentPane().add(LivreNewButton);
		
		JButton PeriodiqueNewButton = new JButton("");
		PeriodiqueNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GestionPeriodique gestionPeriodique = new GestionPeriodique();

				gestionPeriodique.setBounds(100, 100, 800, 640);
				gestionPeriodique.setTitle("TP2 Projet JAVA - Biblithèque : Gestion Periodique");
				gestionPeriodique.setVisible(true); // Ouvrir la fenetre gestionPeriodique
				
			}
		});
		PeriodiqueNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\periodique.png"));
		PeriodiqueNewButton.setBounds(206, 138, 180, 159);
		getContentPane().add(PeriodiqueNewButton);
		
		JButton TheseNewButton = new JButton("");
		TheseNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GestionThese gestionThese = new GestionThese();

				gestionThese.setBounds(100, 100, 800, 640);
				gestionThese.setTitle("TP2 Projet JAVA - Biblithèque : Gestion Periodique");
				gestionThese.setVisible(true); // Ouvrir la fenetre gestionThese
				
			}
		});
		TheseNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\these.png"));
		TheseNewButton.setBounds(398, 138, 180, 159);
		getContentPane().add(TheseNewButton);
		
		JButton ProceedingNewButton = new JButton("");
		ProceedingNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GestionProceeding gestionProceeding = new GestionProceeding();

				gestionProceeding.setBounds(100, 100, 800, 640);
				gestionProceeding.setTitle("TP2 Projet JAVA - Biblithèque : Gestion Periodique");
				gestionProceeding.setVisible(true); // Ouvrir la fenetre gestionProceeding
				
			}
		});
		ProceedingNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\proceeding.png"));
		ProceedingNewButton.setBounds(590, 138, 180, 159);
		getContentPane().add(ProceedingNewButton);
		
		JLabel lblProceeding = new JLabel("Proceeding");
		lblProceeding.setForeground(Color.BLACK);
		lblProceeding.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblProceeding.setBounds(642, 310, 90, 29);
		getContentPane().add(lblProceeding);
		
		JLabel lblThse = new JLabel("Th\u00E8se");
		lblThse.setForeground(Color.BLACK);
		lblThse.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblThse.setBounds(470, 310, 50, 29);
		getContentPane().add(lblThse);
		
		JLabel lblPeriodique = new JLabel("Periodique");
		lblPeriodique.setForeground(Color.BLACK);
		lblPeriodique.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblPeriodique.setBounds(253, 310, 85, 29);
		getContentPane().add(lblPeriodique);
		
		JLabel lblLivre = new JLabel("Livre");
		lblLivre.setForeground(Color.BLACK);
		lblLivre.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblLivre.setBounds(79, 310, 43, 29);
		getContentPane().add(lblLivre);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_2.setBounds(12, 310, 180, 29);
		getContentPane().add(label_2);
		
		JLabel label = new JLabel("TP2 - Projet bibloth\u00E8que JAVA \u00A9 Adnane & Jules");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(225, 557, 343, 16);
		getContentPane().add(label);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_5.setBounds(590, 310, 180, 29);
		getContentPane().add(label_5);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_4.setBounds(398, 310, 180, 29);
		getContentPane().add(label_4);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_3.setBounds(206, 310, 180, 29);
		getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		label_1.setBounds(208, 551, 370, 29);
		getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fondDocument.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 641);
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("TP2 Projet JAVA - Biblithèque : Gestion de document");
		frame.setBounds(100, 100, 800, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
