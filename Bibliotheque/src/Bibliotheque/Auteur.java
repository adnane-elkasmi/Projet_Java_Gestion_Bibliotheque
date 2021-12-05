package Bibliotheque;

import java.util.ArrayList;

/**
 * <b>Auteur est la classe représentant un auteur d'un Document, c'est à dire un écrivain, un journaliste, un chercheur...</b>
 * <p>
 * Un auteur est caractérisé par les informations suivantes :
 * <ul>
 * <li>Son nom et prénom.</li>
 * <li>Le siecle où il a été le plus actif </li>
 * </ul>
 * </p>
 * <p>
 * De plus, un Auteur a une liste d'ouvrages Documents.
 * </p>
 * @see Document
 * @author Adnane Jules
 */

public class Auteur {
	
	/**
	 * Le nom et le prénom de l'auteur.
	 * @see Auteur#Auteur(String, Integer)
	 * @see Auteur#getNomAuteur()
	 * @see Auteur#setNomAuteur(String)
	 */
	private String nomAuteur;
	
	/**
	 * Le siecle où il a été le plus actif.
	 * @see Auteur#getSiecleActiv()
	 * @see Auteur#setSiecleActiv(Integer) 
	 */
	private Integer siecleActiv;
	
	/**
     * La liste des ouvrages que l'Auteur a réalisé.
     * <p>
     * Il est possible d'ajouter des objets Document dans cette liste.
     * <p>
     * 
     * @see Auteur#ajouterL(Livre)
     * @see Auteur#ajouterP(Periodique)
     * @see Auteur#ajouterPr(Proceeding)
     * @see Auteur#ajouterT(These)
     */
	private ArrayList<Document> ouvrages=new ArrayList<Document>();
	
	/**
     * Le nombre d'auteurs que contient la bibliotheque.
     * @see Auteur#getC()
     */
	static private Integer c=0;
	
	/**
     * Constructeur Auteur.
     * <p>
     * A la construction d'un objet Auteur, le nombre d'auteur est incrémenté de 1.
     * </p>
     * @param nomAuteur
     *            Le nom de l'auteur ainsi que son prénom.
     * @param siecleActiv
     *            Le siecle d'activité de l'auteur.
     * 
     * @see Auteur#nomAuteur
     * @see Auteur#siecleActiv
     */
	public Auteur(String nomAuteur, Integer siecleActiv) {
		this.nomAuteur=nomAuteur;
		this.siecleActiv=siecleActiv;
		c+=1;
	}
	
	/**
     * Retourne le nom de l'auteur.
     * 
     * @return Le nom et le prénom de l'auteur
     * 
     * @see Auteur
     */
	public String getNomAuteur() {
		return nomAuteur;
	}

	/**
     * Met à jour le nom de l'auteur, notamment si on a fait une faute lors de la création initiale.
     * 
     * @param nomAuteur
     * 					Le nouveau nom de l'auteur
     * @see Auteur
     */
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	
	/**
     * Retourne le siecle d'activité de l'auteur.
     * 
     * @return Le siecle d'activité de l'auteur.
     * 
     * @see Auteur
     */
	public Integer getSiecleActiv() {
		return siecleActiv;
	}

	/** 
	 * Met à jour le siecle d'activité de l'auteur.
	 * @param siecleActiv
	 * 					La nouvelle valeur du siecle d'activité.
	 * @see Auteur
	 */
	public void setSiecleActiv(Integer siecleActiv) {
		this.siecleActiv = siecleActiv;
	}
	
	/**
	 * Pour ajouter un livre à la liste des ouvrages de l'auteur.
	 * @param l
	 * 			Le livre à ajouter.
	 * @see Livre
	 */
	public void ajouterL(Livre l) {
		ouvrages.add(l);
	}
	
	/**
	* Pour ajouter un périodique à la liste des ouvrages de l'auteur.
	* @param p
	* 			Le périodique à ajouter.
	* @see Periodique
	*/
	public void ajouterP(Periodique p) {
		ouvrages.add(p);
	}
	
	/**
	 * Pour ajouter un proceeding à la liste des ouvrages de l'auteur.
	 * @param pr
	 * 			Le proceeding à ajouter.
	 * @see Proceeding
	 */
	public void ajouterPr(Proceeding pr) {
		ouvrages.add(pr);
	}
	
	/**
	* Pour ajouter une thèse à la liste des ouvrages de l'auteur.
	* @param t
	* 			La thèse à ajouter.
	* @see These
	*/
	public void ajouterT(These t) {
		ouvrages.add(t);
	}
	
	/**
	 * Pour afficher les ouvrages selon leurs genres
	 * @return Un ensemble de lignes contenant chacun un ouvrage précis (sa référence, son titre, et son genre).
	 * @see Document
	 */
	public String ouvrages() {
		int i;
		String o=new String("");
		String g=new String(", genre : ");
		for (i=0;i<ouvrages.size();i++) {
			if (ouvrages.get(i) instanceof These) {
				g+="these";
			}
			if (ouvrages.get(i) instanceof Proceeding) {
				g+="proceeding";
			}
			if (ouvrages.get(i) instanceof Periodique) {
				g+="periodique";
			}
			if (ouvrages.get(i) instanceof Livre) {
				g+="livre";
			}
			o+=ouvrages.get(i).ref + ' ' + ouvrages.get(i).titre + g;
		}
		return o;
	}
	
	/**
	 * Pour afficher le nombre d'auteurs contenus dans la bibliotheque.
	 * 
	 * @return Le nombre d'auteurs de la bibliotheque.
	 * @see Auteur#c
	 */
		public Integer getC() {
			return c;
		}
}
