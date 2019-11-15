package fr.diginamic.tp3.banque.entites;

/** Représente un compte rémunéré
 * @author DIGINAMIC
 *
 */
public class CompteTaux extends Compte {
	
	private double tauxRemu;

	/** Constructeur
	 * @param numeroCompte numéro de compte
	 * @param solde solde
	 * @param taux taux
	 */
	public CompteTaux(String numeroCompte, double solde, double taux) {
		super(numeroCompte, solde);
		this.tauxRemu = taux;
	}
	
	/** Cette méthode est appelée automatiquement lorsqu'on affiche une instance de CompteTaux avec un System.out.println
	 * C'est une redéfinition de la méthode toString() de la classe Object
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String infosCompte = super.toString();
		return infosCompte + " - Taux de rémunération :"+tauxRemu;
	}

	/** Getter
	 * @return the tauxRemu
	 */
	public double getTauxRemu() {
		return tauxRemu;
	}

	/** Setter
	 * @param tauxRemu the tauxRemu to set
	 */
	public void setTauxRemu(double tauxRemu) {
		this.tauxRemu = tauxRemu;
	}

}
