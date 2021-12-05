package Bibliotheque;

/**
 * <b>Livre est la classe dont les instances représentent les livres de la bibliotheque.</b>
 * <p>
 * Un Livre est caractérisé par les informations suivantes :
 * <ul>
 * <li>Son nombre de volumes.</li>
 * </ul>
 * </p>
 * <p>
 * Livre hérite de Document. De plus, Livre a une Edition.
 * </p>
 * @see Document
 * @see Edition
 * @author Adnane Jules
 */
public class Livre extends Document {
	
	/**
	 * Le nombre de volumes du livre.
	 * @see Livre#getNbVolumes()
	 * @see Livre#setNbVolumes(Integer)
	 */
	private Integer nbVolumes;
	
	/**
	 * L'edition du livre
	 * @see Livre#afficherEdit()
	 * @see Livre#edit(Integer, Integer, Editeur)
	 * @see Edition
	 */
	private Edition editionL;
	
	
	/**
	 * Constructeur Livre.
	 * 
	 * @param ref
	 * 			La référence du livre (document).
	 * @param titre
	 * 			Le titre du livre (document).
	 * @param resume
	 * 			Le résumé du livre (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires du livre (document).
	 * @param nbVolumes
	 * 			Le nombre de volumes du livre.
	 */
	public Livre(String ref, String titre, String resume, Integer nbExemplaires, Integer nbVolumes) {
		super(ref, titre, resume, nbExemplaires);
		this.nbVolumes=nbVolumes;
	}

	/**
	 * Retourne le nombre de volumes du livre
	 * @return le nombre de volumes
	 * @see Livre#nbVolumes
	 */
	public Integer getNbVolumes() {
		return nbVolumes;
	}

	/**
	 * Met à jour le nombre de volumes.
	 * @param nbVolumes
	 * @see Livre#nbVolumes
	 */
	public void setNbVolumes(Integer nbVolumes) {
		this.nbVolumes = nbVolumes;
	}

	/**
	 * Indique l'edition du livre, c'est à dire la date d'edition, le numéro d'edition et l'editeur.
	 * @param dateEdition
	 * @param numEdition
	 * @param e
	 * @see Editeur
	 * @see Edition
	 */
	public void edit(Integer dateEdition, Integer numEdition, Editeur e) {
		this.editionL=new Edition(dateEdition, numEdition, e, this);
	}
	
	/**
	 * Affiche l'édition du livre.
	 * @return La date et le numéro d'edition et l'éditeur du livre.
	 * @see Livre#edit(Integer, Integer, Editeur)
	 * @see Livre#editionL
	 */
	public String afficherEdit() {
		return this.editionL.getDateEdition() + " " + this.editionL.getNumEdition() + this.editionL.getEditeur().getNomEditeur();
	}
	
}
