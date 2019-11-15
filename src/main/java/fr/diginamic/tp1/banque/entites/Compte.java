package fr.diginamic.tp1.banque.entites;

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
