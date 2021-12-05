package Bibliotheque;

import java.sql.Date;

/**
 * <b>Emprunt est la classe dont les instances représentent les emprunts d'un exemplaire.</b>
 * <p>
 * Un Emprunt est caractérisé par les informations suivantes :
 * <ul>
 * <li>La date de l'emprunt de l'exemplaire.</li>
 * <li>La date de Retour de l'exemplaire.</li>
 * <li>Le Lecteur qui va emprunter l'exemplaire.</li>
 * <li>L'exemplaire en question.</li>
 * </ul>
 * </p>
 * @see Exemplaire
 * @see Lecteur
 * @author Adnane Jules
 */
public class Emprunt {
	
	/**
	 * La date de l'emprunt de l'exemplaire
	 * 
	 * @see Emprunt#getDateEmprunt()
	 * 
	 * @see Emprunt#setDateEmprunt(Date)
	 */
	private Date dateEmprunt;
	
	/**
	 * La date de retour de l'exemplaire
	 * 
	 * @see Emprunt#getDateRetour()
	 * 
	 * @see Emprunt#setDateRetour(Date)
	 */
	private Date dateRetour;
	
	/**
	 * Le lecteur qui emprunte l'exemplaire.
	 * 
	 * @see Emprunt#getLecteur()
	 * 
	 * @see Emprunt#setLecteur(Lecteur)
	 */
	private Lecteur lecteur;
	
	/**
	 * L'exemplaire emprunté.
	 * 
	 * @see Emprunt#getExemplaire()
	 * 
	 * @see Emprunt#setExemplaire(Exemplaire)
	 */
	private Exemplaire exemplaire;
	
	/**
     * Constructeur Emprunt.
     * @param dateEmprunt
     *            La date de l'emprunt.
     * @param dateRetour
     * 			  La date de retour de l'exemplaire.
     * @param lecteur
     * 			  Le lecteur qui va emprunter.
     * @param exemplaire
     * 
     * @see Emprunt#dateEmprunt
     * @see Emprunt#dateRetour
     * @see Emprunt#exemplaire
     * @see Emprunt#lecteur
     */
	public Emprunt(Date dateEmprunt, Date dateRetour, Lecteur lecteur, Exemplaire exemplaire) {
		this.dateEmprunt=dateEmprunt;
		this.dateRetour=dateRetour;
		this.exemplaire=exemplaire;
		this.lecteur=lecteur;
	}

	/**
	 * Retourne la nouvelle date d'emprunt.
	 * @return La nouvelle date d'emprunt.
	 * @see Emprunt#dateEmprunt
	 */
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	/**
	 * Met à jour la date d'emprunt
	 * @param dateEmprunt
	 * @see Emprunt#dateEmprunt
	 */
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	/**
	 * Retourne la date de retour de l'exemplaire.
	 * @return La date de retour
	 * @see Emprunt#dateRetour
	 */
	public Date getDateRetour() {
		return dateRetour;
	}

	/**
	 * Met à jour la date de retour de l'exemplaire.
	 * @param dateRetour
	 * @see Emprunt#dateRetour
	 */
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	/**
	 * Retourne le lecteur.
	 * @return le lecteur
	 * @see Emprunt#lecteur
	 */
	public Lecteur getLecteur() {
		return lecteur;
	}

	/**
	 * Met à jour le lecteur.
	 * @param lecteur
	 * @see Emprunt#lecteur
	 */
	public void setLecteur(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	/**
	 * Retourne l'exemplaire
	 * @return l'exemplaire
	 * @see Emprunt#exemplaire
	 */
	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	/**
	 * Met à jour l'exemplaire.
	 * @param exemplaire
	 * @see Emprunt#exemplaire
	 */
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
	
}
