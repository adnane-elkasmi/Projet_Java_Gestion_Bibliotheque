package Bibliotheque;

import java.sql.Date;

/**
 * <b>These est la classe dont les instances représentent les thèses de la bibliotheque.</b>
 * <p>
 * Une thèse est caractérisée par les informations suivantes :
 * <ul>
 * <li>La date de la soutenance.</li>
 * <li>Le lieu de la soutenance.</li>
 * </ul>
 * </p>
 * <p>
 * These hérite de la classe Document.
 * </p>
 * @see Document
 * @author Adnane Jules
 */
public class These extends Document {
	
	/**
	 * Date de la soutenance de la thèse.
	 * @see These#getDateSoutenance()
	 * @see These#setDateSoutenance(Date)
	 */
	private Date dateSoutenance;
	
	/**
	 * Lieu de la soutenance de la thèse.
	 * @see These#getLieuSoutenance()
	 * @see These#setDateSoutenance(Date)
	 */
	private String lieuSoutenance;

	/**
	 * Constructeur These.
	 * @param ref
	 * 			La référence de la thèse (document).
	 * @param titre
	 * 			Le titre de la thèse (document).
	 * @param resume
	 * 			Le résumé de la thèse (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires de la thèse (document).
	 * @param dateSoutenance
	 * 			La date de la soutenance de la thèse.
	 * @param lieuSoutenance
	 * 			Le lieu de la soutenance de la thèse.
	 */
	public These(String ref, String titre, String resume, Integer nbExemplaires, Date dateSoutenance, String lieuSoutenance) {
		super(ref, titre, resume, nbExemplaires);
		this.dateSoutenance=dateSoutenance;
		this.lieuSoutenance=lieuSoutenance;
		
	}
	
	/**
	 * Retourne la date de la soutenance de la thèse.
	 * @return La date de la soutenance.
	 * @see These#dateSoutenance
	 */
	public Date getDateSoutenance() {
		return dateSoutenance;
	}

	/**
	 * Met à jour la date de la soutenance de la thèse.
	 * @param dateSoutenance
	 * @see These#dateSoutenance
	 */
	public void setDateSoutenance(Date dateSoutenance) {
		this.dateSoutenance = dateSoutenance;
	}

	/**
	 * Retourne le lieu de soutenance de la thèse.
	 * @return Le lieu de la soutenance.
	 * @see These#lieuSoutenance
	 */
	public String getLieuSoutenance() {
		return lieuSoutenance;
	}

	/**
	 * Met à jour le lieu de la soutenance de la thèse.
	 * @param lieuSoutenance
	 * @see These#lieuSoutenance
	 */
	public void setLieuSoutenance(String lieuSoutenance) {
		this.lieuSoutenance = lieuSoutenance;
	}

}
