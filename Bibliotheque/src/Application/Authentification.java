package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Authentification extends JFrame {

	private JFrame frame;
	private JTextField usernameField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;
	private JLabel lblEnZaouchedahmaniDjaouida;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
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
	public Authentification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 640);
		frame.setTitle("TP2 Projet JAVA - Biblithèque : Connexion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\cytech.jpg"));
		lblNewLabel_4.setBounds(551, 470, 125, 81);
		frame.getContentPane().add(lblNewLabel_4);
		
		usernameField = new JTextField();
		usernameField.setBounds(170, 203, 191, 33);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = usernameField.getText().toString();
				String password = passwordField.getText().toString();
				
				//username=admin & password=123456
				

				if (!username.equals("") && !password.equals("")) {
					
				
				if (username.equals("admin") && password.equals("123456")) {
					
					MenuAdministrateur menu = new MenuAdministrateur();
					
					frame.setVisible(false); // Fermer la fenetre d'anthenfification
					menu.setBounds(100, 100, 800, 640);
					menu.setTitle("TP2 Projet JAVA - Biblithèque : Menu");
					menu.setVisible(true); // Ouvrir la fenetre Menu
				} else {
					JOptionPane.showMessageDialog(null, "Connexion échouée");
				}} else {
					
					JOptionPane.showMessageDialog(null, "Veiller remplir les champs");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(206, 294, 106, 25);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 249, 191, 33);
		frame.getContentPane().add(passwordField);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Header.jpg"));
		lblNewLabel_3.setBounds(34, 0, 736, 145);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblNewLabel_1.setBounds(58, 201, 117, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblPassword.setBackground(Color.WHITE);
		lblPassword.setBounds(58, 247, 117, 33);
		frame.getContentPane().add(lblPassword);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\flat.jpg"));
		lblNewLabel_7.setBounds(44, 194, 345, 138);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\iotsecurity.jpg"));
		lblNewLabel_6.setBounds(44, 181, 345, 165);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblEnZaouchedahmaniDjaouida = new JLabel("Encadr\u00E9 par Mme Zaouche-Dahmani Djaouida");
		lblEnZaouchedahmaniDjaouida.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblEnZaouchedahmaniDjaouida.setBounds(473, 564, 297, 16);
		frame.getContentPane().add(lblEnZaouchedahmaniDjaouida);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\Userpass.jpg"));
		lblNewLabel_5.setBounds(459, 564, 311, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\TP2 - Bibliotheque\\bin\\img\\fondAut.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 593);
		frame.getContentPane().add(lblNewLabel);
	}
}
