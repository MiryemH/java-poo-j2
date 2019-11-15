/**
 * 
 */
package fr.diginamic.tp5intro.entites;

/** Représente un cercle, qui est aussi un objet géométrique
 * @author DIGINAMIC
 *
 */
public class Cercle implements ObjetGeometrique {
	
	/** rayon : double*/
	private double rayon;

	/** Constructeur
	 * @param rayon rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2.0 * Math.PI * rayon;
	}


	@Override
	public double surface() {
		return Math.PI * rayon * rayon;
	}

	@Override
	public String infos() {
		return "Cercle de rayon "+rayon;
	}

}
