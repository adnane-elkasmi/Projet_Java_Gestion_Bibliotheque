package Bibliotheque;

import java.sql.Date;

/**
 * <b>Proceeding est la classe dont les instances représentent les proceeding de la bibliotheque.</b>
 * <p>
 * Un proceeding est caractérisé par les informations suivantes :
 * <ul>
 * <li>La date du séminaire.</li>
 * </ul>
 * </p>
 * <p>
 * Proceeding hérite de la classe Document.
 * </p>
 * @see Document
 * @author Adnane Jules
 */
public class Proceeding extends Document {
	
	/**
	 * La date du séminaire
	 * @see Proceeding#getDateSeminaire()
	 * @see Proceeding#setDateSeminaire(Date)
	 */
	private Date dateSeminaire;

	/**
	 * Constructeur Proceeding
	 * @param ref
	 * 			La référence du proceeding (document).
	 * @param titre
	 * 			Le titre du proceeding (document).
	 * @param resume
	 * 			Le résumé du proceeding (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires du proceeding (document).
	 * @param dateSeminaire
	 * 			La date du séminaire.
	 * @see Document
	 */
	public Proceeding(String ref, String titre, String resume, Integer nbExemplaires, Date dateSeminaire) {
		super(ref, titre, resume, nbExemplaires);
		this.dateSeminaire=dateSeminaire;
	}

	/**
	 * Retourne la date du séminaire.
	 * @return Date du séminaire.
	 * @see Proceeding#dateSeminaire
	 */
	public Date getDateSeminaire() {
		return dateSeminaire;
	}

	/**
	 * Met à jour la date du séminaire
	 * @param dateSeminaire
	 * @see Proceeding#dateSeminaire
	 */
	public void setDateSeminaire(Date dateSeminaire) {
		this.dateSeminaire = dateSeminaire;
	}
	
	

}
