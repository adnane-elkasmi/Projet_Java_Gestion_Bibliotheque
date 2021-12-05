package Bibliotheque;

import java.util.ArrayList;

/**
 * <b>Document est la classe dont les instances représentent un document de la bibliotheque.</b>
 * <p>
 * Un document est caractérisé par les informations suivantes :
 * <ul>
 * <li>Sa référence.</li>
 * <li>Son titre </li>
 * <li>Un court résumé.</li>
 * <li>Le nombre d'exemplaires disponibles dans la bibliotheque</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un Document a une liste d'auteurs Auteur et une liste d'exemplaires Exemplaire.
 * </p>
 * @see Auteur
 * @see Exemplaire
 * @author Adnane Jules
 */
public class Document {
	
	/**
	* La référence du document dans la bibliotheque.
	* @see Document#Document(String, String, String, Integer)
	* @see Document#getRef()
	* @see Document#setRef(String)
	*/
	protected String ref;
	
	/**
	* Le titre du document.
	* @see Document#getTitre()
	* @see Document#setTitre(String)
	*/
	protected String titre;
	
	/**
	* Un court résumé du document.
	* @see Document#getResume()
	* @see Document#setResume(String)
	*/
	protected String resume;
	
	/**
	* Le nombre d'exemplaires disponibles dans la bibliotheque
	* @see Document#getNbExemplaires()
	* @see Document#setNbExemplaires(Integer)
	*/
	protected Integer nbExemplaires;
	
	/**
     * La liste des auteurs du document.
     * <p>
     * Il est possible d'ajouter des objets Auteur dans cette liste.
     * <p>
     * 
     * @see Document#addAuteur(Auteur)
     */
	protected ArrayList<Auteur> auteurs=new ArrayList<Auteur>();
	
	/**
     * La liste des exemplaires du document.
     * <p>
     * Il est possible d'ajouter des objets Exemplaire dans cette liste.
     * <p>
     * 
     * @see Document#addExemplaire(Integer)
     */
	protected ArrayList<Exemplaire> exemplaires=new ArrayList<Exemplaire>();
	
	/**
	 * Liste de toutes les instances de la classe Document.
	 * @see Document#Document(String, String, String, Integer)
	 * @see Document#afficherTout()
	 */
	static public ArrayList<Document> documents=new ArrayList<Document>();
	
	/**
     * Constructeur Document.
     * @param ref
     *            La référence du document.
     * @param titre
     *            Le titre du document.
     * @param resume
     *            Le résumé du document		
     * @param nbExemplaires
     * 			  Le nombre d'exemplaires.
     * @see Document#ref
     * @see Document#titre
     * @see Document#resume
     * @see Document#nbExemplaires
     */
	public Document(String ref, String titre, String resume, Integer nbExemplaires) {
		this.ref = ref;
		this.titre = titre;
		this.resume = resume;
		this.nbExemplaires = nbExemplaires;
		Document.documents.add(this);
	}
	
	/**
    * Retourne la référence du document.
    * 
    * @return La référence du document
    * @see Document
    */
	public String getRef() {
		return ref;
	}
	
	/**
     * Met à jour la référence du document.
     * 
     * @param ref
     * 					La nouvelle référence.
     * @see Document
     */
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	/**
	* Retourne le titre du document.
	* 
	* @return Le titre du document
	* @see Document
	*/
	public String getTitre() {
		return titre;
	}
	
	/**
     * Met à jour le titre.
     * 
     * @param titre
     * 					Le nouveau titre.
     * @see Document
     */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	/**
	* Retourne le résumé du document.
	* 
	* @return Le résumé du document
	* @see Document
	*/
	public String getResume() {
		return resume;
	}
	
	/**
     * Met à jour le résumé.
     * 
     * @param resume
     * 					Le nouveau résumé.
     * @see Document
     */
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	/**
	* Retourne le nombre d'exemplaires du document.
	* 
	* @return Le nombre d'exemplaires du document
	* @see Document
	*/
	public Integer getNbExemplaires() {
		return nbExemplaires;
	}
	
	/**
     * Met à jour le nombre d'exemplaires.
     * 
     * @param nbExemplaires
     * 					Le nouveau nombre d'exemplaires.
     * @see Document
     */
	public void setNbExemplaires(Integer nbExemplaires) {
		this.nbExemplaires = nbExemplaires;
	}
	
	/**
	 * Pour ajouter les auteurs d'un document.
	 * @param auteur
	 * 			L'auteur à ajouter.
	 * @see Auteur
	 */
	public void addAuteur(Auteur auteur) {
		auteurs.add(auteur);
	}
	
	/**
	 * Pour afficher les auteurs d'un document
	 * @return Les auteurs du documents
	 * @see Livre
	 */
	public String afficherAuteurs() {
		int i;
		String s= new String("");
		for (i=0;i<auteurs.size();i++) {
			s+= auteurs.get(i).getNomAuteur() + ' ' + auteurs.get(i).getSiecleActiv() + System.getProperty("line.separator");
		}
		return s;
	}
	
	/**
	 * Pour ajouter les exemplaires du document.
	 * @param codeBarre
	 * 			Le codeBarre de l'exemplaire à ajouter
	 * @see Exemplaire
	 */
	public void addExemplaire(Integer codeBarre) {
		exemplaires.add(new Exemplaire(codeBarre, this.ref));
	}
	
	/**
	 * Pour afficher les codes barre des exemplaires du document.
	 * @return Les exemplaires du document.
	 * @see Exemplaire
	 */
	public String afficherExemplaires() {
		int i;
		String s=new String("");
		for (i=0;i<exemplaires.size();i++) {
			s+=exemplaires.get(i).getCodeBarre() + System.getProperty("line.separator");
		}
		return s;
	}

	/**
	 * Pour voir si un document contient un mot clé en particulier
	 * @param k
	 * 			Le mot clé qu'il faut chercher.
	 * @return True si le document contient le mot clé, false sinon.
	 * @see MotCle
	 */
	public Boolean contient(MotCle k) {
		if (k.documents.contains(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Affiche toutes les instances de la classe Document.
	 * @return La référence et le titre de chaque document.
	 * @see Document#documents
	 */
	static public String afficherTout() {
		int i;
		String s=new String("");
		for (i=0;i<documents.size();i++) {
			s+=documents.get(i).getRef()+" "+ documents.get(i).getTitre()+ System.getProperty("line.separator");
		}
		return s;
	}
	
}
