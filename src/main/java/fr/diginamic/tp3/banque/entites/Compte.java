package fr.diginamic.tp3.banque.entites;

/**
 * Représente un compte bancaire élémentaire avec un numéro de compte et un
 * solde
 * 
 * @author DIGINAMIC
 *
 */
public class Compte {

	private String numeroCompte;
	private double solde;

	/** Constructeur
	 * @param numeroCompte numéro de compte
	 * @param solde solde
	 */
	public Compte(String numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	/** Cette méthode est appelée automatiquement lorsqu'on affiche une instance de Compte avec un System.out.println
	 * C'est une redéfinition de la méthode toString() de la classe Object
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Compte : " + numeroCompte+ " - Solde : "+solde+" €";
	}

	/** Getter
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/** Setter
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/** Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
