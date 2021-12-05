package Bibliotheque;

/**
 * <b>Edition est la classe dont les instances représentent les éditions des livres et périodiques</b>
 * <p>
 * Une Edition est caractérisée par les informations suivantes :
 * <ul>
 * <li>La date d'édition.</li>
 * <li>Le numéro d'édition</li>
 * <li>Un éditeur.</li>
 * <li>Un périodique ou un livre</li>
 * </ul>
 * </p>
 * @see Livre
 * @see Periodique
 * @see Editeur
 * @author Adnane Jules
 */
public class Edition {
	
	// Date et numéro d'édition
	private Integer dateEdition;
	private Integer numEdition;
	private Editeur editeur;
	private Livre livre;
	private Periodique periodique;
	
	/**
	 * Constructeur Edition : Cas où il s'agit d'une edition d'un livre.
	 * @param dateEdition
	 * @param numEdition
	 * @param editeur
	 * @param livre
	 */
	public Edition(Integer dateEdition, Integer numEdition, Editeur editeur, Livre livre) {
		this.dateEdition=dateEdition;
		this.numEdition=numEdition;
		this.editeur=editeur;
		this.livre=livre;
	}
	
	/**
	 * Constructeur Edition: Cas où il s'agit d'une edition de periodique.
	 * @param dateEdition
	 * @param numEdition
	 * @param editeur
	 * @param periodique
	 */
	public Edition(Integer dateEdition, Integer numEdition, Editeur editeur, Periodique periodique) {
		this.dateEdition=dateEdition;
		this.numEdition=numEdition;
		this.editeur=editeur;
		this.periodique=periodique;
	}

	/**
	 * Retourne le périodique.
	 * @return Périodique
	 */
	public Periodique getPeriodique() {
		return periodique;
	}
	
	/**
	 * Met à jour la valeur de periodique.
	 * @param periodique
	 */
	public void setPeriodique(Periodique periodique) {
		this.periodique=periodique;
	}

	/**
	 * Retourne la date d'édition
	 * @return Date d'édition
	 */
	public Integer getDateEdition() {
		return dateEdition;
	}

	/**
	 * Met à jour la date d'édition
	 * @param dateEdition
	 */
	public void setDateEdition(Integer dateEdition) {
		this.dateEdition = dateEdition;
	}

	/**
	 * Retourne le numéro d'édition.
	 * @return numéro d'édition.
	 */
	public Integer getNumEdition() {
		return numEdition;
	}

	/**
	 * Met à jour le numéro d'édition.
	 * @param numEdition
	 */
	public void setNumEdition(Integer numEdition) {
		this.numEdition = numEdition;
	}

	/**
	 * Retourne l'éditeur.
	 * @return Editeur
	 */
	public Editeur getEditeur() {
		return editeur;
	}

	/**
	 * Met à jour la valeur de editeur.
	 * @param editeur
	 */
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	/**
	 * Retourne le livre.
	 * @return Le livre.
	 */
	public Livre getLivre() {
		return livre;
	}

	/**
	 * Met à jour la valeur de livre.
	 * @param livre
	 */
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	
}
