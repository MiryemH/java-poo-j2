package fr.diginamic.tp5intro.entites;

/**
 * Liste les méthodes obligatoires que doit posséder un objet géométrique
 * 
 * @author DIGINAMIC
 */
public interface ObjetGeometrique {
	/**
	 * Retourne le périmètre d’une forme géométrique
	 * 
	 * @return double
	 */
	double perimetre();

	/**
	 * Permet de sauvegarder un nouveau compte
	 * 
	 * @param nvCompte
	 *            nouveau compte à sauvegarder
	 */
	double surface();
	
	/** Retourne les informations concernant l'objet géométrique
	 * @return String
	 */
	String infos();
}