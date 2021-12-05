package Bibliotheque;

/**
 * <b>Exemplaire est la classe dont les instances représentent les exemplaires d'un Document.</b>
 * <p>
 * Un Exemplaire est caractérisé par les informations suivantes :
 * <ul>
 * <li>Le code barre.</li>
 * <li>La référence du document.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un Editeur a un paramétre de disponibilité, soit vrai soit faux.
 * </p>
 * @see Emprunt
 * @see Document
 * @author Adnane Jules
 */
public class Exemplaire {
	
	/**
	 * Le code barre unique de l'exemplaire
	 * 
	 * @see Exemplaire#getCodeBarre()
	 * 
	 * @see Exemplaire#setCodeBarre(Integer)
	 */
	private Integer codeBarre;
	
	/**
	 * La référence du document (livre, périodique, proceeding ou thèse).
	 * 
	 * @see Exemplaire#getRefDoc()
	 * 
	 * @see Exemplaire#setRefDoc(String)
	 */	
	private String refDoc;
	
	/**
	 * Disponibilité de l'exemplaire, false si l'exemplaire est emprunté et true si disponible, initialisée à true.
	 * 
	 * @see Exemplaire#getDispo()
	 * 
	 * @see Exemplaire#setDispo(Boolean)
	 */	
	private Boolean dispo=true;
	
	/**
     * Constructeur Exemplaire.
     * @param codeBarre
     *            Le code barre de l'exemplaire.
     * @param refDoc
     * 			  La référence du document.
     * @see Exemplaire#codeBarre
     * @see Exemplaire#refDoc
     */
	public Exemplaire(Integer codeBarre, String refDoc) {
		this.codeBarre=codeBarre;
		this.refDoc=refDoc;
	}

	/**
	 * Retourne le code barre de l'exemplaire.
	 * 
	 * @return Le code barre.
	 * @see Exemplaire#codeBarre
	 */	
	public Integer getCodeBarre() {
		return codeBarre;
	}

	/** 
	 * Met à jour le codeBarre du document.
	 * 
	 * @param codeBarre
	 * @see Exemplaire#codeBarre
	 */
	public void setCodeBarre(Integer codeBarre) {
		this.codeBarre = codeBarre;
	}
	
	/**
	 * Retourne la disponibilité de l'exemplaire.
	 * 
	 * @return La disponibilité.
	 * @see Exemplaire#dispo
	 */		
	public Boolean getDispo() {
		return dispo;
	}

	/**
	 * Met à jour la disponibilité du document.
	 * @param dispo
	 * @see Exemplaire#dispo
	 */
	public void setDispo(Boolean dispo) {
		this.dispo = dispo;
	}

	/**
	 * Retourne la référence du document que représente l'exemplaire.
	 * 
	 * @return La référence du document.
	 * @see Exemplaire#refDoc
	 */	
	public String getRefDoc() {
		return this.refDoc;
	}
	
	/**
	 * Met à jour la référence du document que représente l'exemplaire.
	 * @param refDoc
	 * @see Exemplaire#refDoc
	 */
	public void setRefDoc(String refDoc) {
		this.refDoc=refDoc;
	}

	
}
