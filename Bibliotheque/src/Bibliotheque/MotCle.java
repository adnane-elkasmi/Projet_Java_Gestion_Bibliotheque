package Bibliotheque;

import java.util.ArrayList;

/**
 * <b>MotCle est la classe dont les instances représentent les mots-clés d'un Document.</b>
 * <p>
 * Un MotCle est caractérisé par les informations suivantes :
 * <ul>
 * <li>Le mot.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un MotCle a une liste de Document qui le contiennent.
 * </p>
 * @see Document
 * @author Adnane Jules
 */
public class MotCle {
	
	/**
	 * Le mot clé
	 * 
	 * @see MotCle#getMot()
	 * 
	 * @see MotCle#setMot(String)
	 */
	private String mot;
	
	/**
	 * La liste des documents qui contiennent le mot clé.
	 * 
	 * @see MotCle#ajouterL(Livre)
	 * @see MotCle#ajouterP(Periodique)
	 * @see MotCle#ajouterPr(Proceeding)
	 * @see MotCle#ajouterT(These)
	 */	
	public ArrayList<Document> documents=new ArrayList<Document>();
	
	/**
	 * Constructeur MotCle
	 * @param mot
	 * 			Le mot clé.
	 * @see MotCle#mot
	 */
	public MotCle(String mot) {
		this.mot=mot;
	}
	
	/**
	 * Retourne le mot clé
	 * @return le mot clé
	 * @see MotCle#mot
	 */
	public String getMot() {
		return mot;
	}

	/**
	 * Met à jour le mot
	 * @param mot
	 * @see MotCle#mot
	 */
	public void setMot(String mot) {
		this.mot = mot;
	}
	
	/**
	 * Pour ajouter un livre à la liste de documents qui contienent le mot clé.
	 * @param l
	 * @see MotCle#documents
	 */
	public void ajouterL(Livre l) {
		documents.add(l);
	}
	
	/**
	 * Pour ajouter un périodique à la liste de documents qui contienent le mot clé.
	 * @param p
	 * @see MotCle#documents
	 */
	public void ajouterP(Periodique p) {
		documents.add(p);
	}
	
	/**
	 * Pour ajouter un proceeding à la liste de documents qui contienent le mot clé.
	 * @param pr
	 * @see MotCle#documents
	 */
	public void ajouterPr(Proceeding pr) {
		documents.add(pr);
	}
	
	/**
	 * Pour ajouter une thèse à la liste de documents qui contiennent le mot clé.
	 * @param t
	 * @see MotCle#documents
	 */
	public void ajouterT(These t) {
		documents.add(t);
	}

}
