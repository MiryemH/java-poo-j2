/**
 * 
 */
package fr.diginamic.tp5intro.entites;

/**
 * Représente un rectangle, qui est aussi un objet géométrique
 * 
 * @author DIGINAMIC
 *
 */
public class Rectangle implements ObjetGeometrique {

	/** longueur : double */
	private double longueur;

	/** largeur : double */
	private double largeur;

	/**
	 * Constructeur
	 * 
	 * @param longueur
	 *            longueur du rectangle
	 * @param largeur
	 *            largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return 2.0 * (longueur + largeur);
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}
	
	@Override
	public String infos() {
		return "Rectangle de longueur="+longueur+" et de largeur="+largeur;
	}


	/** Getter
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/** Setter
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/** Getter
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/** Setter
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
