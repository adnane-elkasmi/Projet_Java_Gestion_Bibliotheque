package Bibliotheque;

import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;

/**
 * <b>Lecteur est la classe dont les instances représentent les lecteurs (clients) de la bibliotheque.</b>
 * <p>
 * Un Lecteur est caractérisé par les informations suivantes :
 * <ul>
 * <li>Son nom et prénom.</li>
 * <li>Son identifiant </li>
 * <li>Son email</li>
 * <li>Sa sanction</li>
 * </ul>
 * </p>
 * <p>
 * De plus, Lecteur a une liste d'emprunts en cours où on peut ajouter et supprimer des objets Emprunt. <br>
 * Un lecteur peut emprunter 4 documents en même temps au maximum.
 * </p>
 * @see Emprunt
 * @author Adnane Jules
 */
public class Lecteur {
	
	/**
	 * Nom et prénom du lecteur
	 * @see Lecteur#getNomLecteur()
	 * @see Lecteur#setNomLecteur(String)
	 */
	private String nomLecteur;
	
	/**
	 * L'indentifiant unique du lecteur.
	 * @see Lecteur#getIdLecteur()
	 * @see Lecteur#setIdLecteur(Integer)
	 */
	private Integer idLecteur;
	
	/**
	 * L'email du lecteur.
	 * @see Lecteur#getEmailLecteur()
	 * @see Lecteur#setEmailLecteur(String)
	 */
	private String emailLecteur;
	
	/**
	 * L'état de sanction du lecteur
	 * @see Lecteur#getSanction()
	 * @see Lecteur#setSanction(Sanction)
	 */
	private Sanction sanction;
	
	/**
	 * Liste des emprunts en cours du lecteur, le lecteur peut emprunter au maximum 4 exemplaires
	 * @see Emprunt
	 * @see Lecteur#afficherEmprunts()
	 * @see Lecteur#emprunter(Exemplaire, Date, Date)
	 * @see Lecteur#supprimerEmprunt(Emprunt)
	 */
	public ArrayList<Emprunt> empruntEnCours=new ArrayList<Emprunt>();
	
	/**
	 * Liste de toute les instances de la classe lecteur.
	 * @see Lecteur#afficherLecteurs()
	 */
	static public ArrayList<Lecteur> lecteurs=new ArrayList<Lecteur>();
	
	/**
	 * Constructeur Lecteur.
	 * @param nomLecteur
	 * 					Le nom et le prénom du lecteur.
	 * @param idLecteur
	 * 					Un identifiant unique du lecteur.
	 * @param emailLecteur
	 * 					L'email du lecteur.
	 * @param sanction
	 * 					La sanction du lecteur, elle peut être initialisé à vert.
	 * @see Sanction
	 */
	public Lecteur(String nomLecteur, Integer idLecteur, String emailLecteur, Sanction sanction) {
		this.nomLecteur = nomLecteur;
		this.idLecteur = idLecteur;
		this.emailLecteur = emailLecteur;
		this.sanction = sanction;
		Lecteur.lecteurs.add(this);
	}
	
	/**
	 * Retourne le nom du lecteur
	 * @return nom du lecteur
	 * @see Lecteur#nomLecteur
	 */
	public String getNomLecteur() {
		return nomLecteur;
	}

	/**
	 * Met à jour le nom du lecteur
	 * @param nomLecteur
	 * @see Lecteur#nomLecteur
	 */
	public void setNomLecteur(String nomLecteur) {
		this.nomLecteur = nomLecteur;
	}

	/**
	 * Retourne l'id du lecteur
	 * @return Id du lecteur
	 * @see Lecteur#idLecteur
	 */
	public Integer getIdLecteur() {
		return idLecteur;
	}

	/**
	 * Met à jour l'id du lecteur
	 * @param idLecteur
	 * @see Lecteur#idLecteur
	 */
	public void setIdLecteur(Integer idLecteur) {
		this.idLecteur = idLecteur;
	}

	/**
	 * Retourne l'email du lecteur
	 * @return L'email du lecteur
	 * @see Lecteur#emailLecteur
	 */
	public String getEmailLecteur() {
		return emailLecteur;
	}

	/**
	 * Met à jour l'email du lecteur.
	 * @param emailLecteur
	 * @see Lecteur#emailLecteur
	 */
	public void setEmailLecteur(String emailLecteur) {
		this.emailLecteur = emailLecteur;
	}

	/**
	 * Retourne la sanction du lecteur.
	 * @return La sanction
	 * @see Lecteur#sanction
	 * @see Sanction
	 */
	public Sanction getSanction() {
		return sanction;
	}
	
	/**
	 * Met à jour la sanction du lecteur.
	 * @param sanction
	 * @see Sanction
	 * @see Lecteur#sanction
	 */
	public void setSanction(Sanction sanction) {
		this.sanction = sanction;
	}
	
	/**
	 * Pour emprunter un exemplaire.
	 * @param e
	 * @param dateEmprunt
	 * @param dateRetour
	 * @return 1 si l'emprunt est effectué et 0 sinon.
	 * @see Emprunt
	 * @see Exemplaire
	 */
	public Integer emprunter(Exemplaire e, Date dateEmprunt, Date dateRetour) {
		if (this.sanction==Sanction.jaune | this.sanction==Sanction.vert | e.getDispo() | empruntEnCours.size()<4) {
			empruntEnCours.add(new Emprunt(dateEmprunt, dateRetour, this, e));
			e.setDispo(false);
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * Affiche le code barre des exemplaires empruntés.
	 * @return Code barre des exemplaires
	 * @see Exemplaire
	 */
	public String afficherEmprunts() {
		int i;
		String s=new String("");
		for (i=0;i<empruntEnCours.size();i++) {
			s+=empruntEnCours.get(i).getExemplaire().getCodeBarre() + System.getProperty("line.separator");
		}
		return s;
	}
	
	
	/**
	 * <p>
	 * Pour supprimer un emprunt quand la date de retour est atteinte si le lecteur l'a rendu, et sanctionner le lecteur sinon.
	 * </p>
	 * <p>
	 * On dit qu'un exemplaire est rendu si l'admin a changé la dispo de l'exemplaire de false à true.
	 * </p>
	 * @param emprunt
	 * 				L'emprunt à supprimer.
	 * @return
	 */
	public String supprimerEmprunt(Emprunt emprunt) {
				
		// Récupérer la date d'aujourd'hui
		LocalDate n=java.time.LocalDate.now();
		Date now=Date.valueOf(n);
			
		//Si la dateRetour est atteinte et l'exemplaire est dispo
		if (emprunt.getDateRetour()==now && emprunt.getExemplaire().getDispo()) {
			this.empruntEnCours.remove(emprunt);
			return "Emprunt supprimé";
		}
			
		// Si la dateRetour est atteinte et l'exemplaire n'est pas dispo
		if (emprunt.getDateRetour()==now && !(emprunt.getExemplaire().getDispo())) {
			if (this.getSanction()==Sanction.vert) {
				this.setSanction(Sanction.jaune);
			} else {
				this.setSanction(Sanction.rouge);
			}
			return "Exemplaire non disponible, lecteur sanctionné";
		}
		return "date de retour non atteinte";
		}
	
	/**
	 * Pour afficher toutes les instances de la classe Lecteur.
	 * @return L'id et le nom de chaque lecteur.
	 * @see Lecteur#lecteurs
	 */
	static public String afficherLecteurs() {
		int i;
		String s=new String("");
		for (i=0;i<lecteurs.size();i++) {
			s+=Lecteur.lecteurs.get(i).getIdLecteur()+" "+Lecteur.lecteurs.get(i).getNomLecteur()+" "+Lecteur.lecteurs.get(i).getEmailLecteur()+" "+Lecteur.lecteurs.get(i).getSanction()+System.getProperty("line.separator");
		}
		return s;
	}
}
