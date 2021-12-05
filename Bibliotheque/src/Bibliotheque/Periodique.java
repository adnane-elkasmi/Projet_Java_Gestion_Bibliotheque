package Bibliotheque;

import java.sql.Date;

/**
 * <b>Periodique est la classe dont les instances représentent les periodiques de la bibliotheque.</b>
 * <p>
 * Un périodique est caractérisé par les informations suivantes :
 * <ul>
 * <li>Sa date de parution</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un périodique a une édition. <br>
 * Periodique hérite de la classe Document.
 * </p>
 * @see Edition
 * @see Document
 * @author Adnane Jules
 */
public class Periodique extends Document {
	
	/**
	 * Date de parution du périodique
	 * @see Periodique#getDateParution()
	 * @see Periodique#setDateParution(Date)
	 */
	private Date dateParution;
	
	/**
	 * L'edition du périodique.
	 * @see Edition
	 * @see Periodique#afficherEdit()
	 * @see Periodique#edit(Integer, Integer, Editeur)
	 */
	private Edition editionP;
	
	/**
	 * Constructeur Periodique
	 * @param ref
	 * 			La référence du périodique (document).
	 * @param titre
	 * 			Le titre du périodique (document).
	 * @param resume
	 * 			Le résumé du périodique (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires du périodique (document).
	 * @param dateParution
	 * 			La date de parution du périodique.
	 * @see Document
	 */
	public Periodique(String ref, String titre, String resume, Integer nbExemplaires, Date dateParution) {
		super(ref, titre, resume, nbExemplaires);
		this.dateParution=dateParution;
	}

	/**
	 * Retourne la date de parution du périodique.
	 * @return Date de parution
	 * @see Periodique#dateParution
	 */
	public Date getDateParution() {
		return dateParution;
	}

	/**
	 * Met à jour la date de parution.
	 * @param dateParution
	 * @see Periodique#dateParution
	 */
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	/**
	 * Methode pour indiquer l'edition du périodique.
	 * @param dateEdition
	 * @param numEdition
	 * @param e
	 * @see Editeur
	 * @see Edition
	 */
	public  void edit(Integer dateEdition, Integer numEdition, Editeur e) {
		this.editionP=new Edition(dateEdition, numEdition, e, this);
	}
	/**
	 * Méthode pour afficher l'edition du periodique.
	 * @return La date d'édition, le numéro d'édition et le nom de l'éditeur du périodique.
	 * @see Periodique#editionP
	 * @see Edition
	 */
	public String afficherEdit() {
		return this.editionP.getDateEdition()+ " " + this.editionP.getNumEdition() + " " +this.editionP.getEditeur().getNomEditeur();
	}
}
