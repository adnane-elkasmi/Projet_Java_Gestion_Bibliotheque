package Bibliotheque;

/**
 * <b>Sanction est une énumération des différentes sanctions d'un lecteur donnée.</b>
 * <p>
 * Une sanction est soit :
 * <ul>
 * <li>Vert : c'est à dire que le lecteur n'a jamais eu d'avertissements</li>
 * <li>Jaune : c'est à dire que le lecteur a un avertissement.</li>
 * <li>Rouge : le lecteur est exclu.
 * </ul>
 * </p>
 * @see Lecteur
 * @see Emprunt
 * @author Adnane Jules
 */
public enum Sanction {
	vert, jaune, rouge

}
