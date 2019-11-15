package fr.diginamic.tp2.banque;
public abstract class Compte {

	private String numeroCompte;
	private double solde;
	
	public Compte(String numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public abstract void afficherSolde();
	
	public String toString(){
		return numeroCompte+" "+solde+" €";
	}
	
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
}
