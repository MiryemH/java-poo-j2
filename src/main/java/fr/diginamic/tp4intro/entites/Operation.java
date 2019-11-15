package fr.diginamic.tp4intro.entites;

/**
 * Représente une opération bancaire de n'importe quelle nature, avec simplement
 * une date et un montant
 * 
 * @author DIGINAMIC
 *
 */
public abstract class Operation {

	private String date;
	private double montant;

	/**
	 * Constructor
	 * 
	 * @param date
	 *            date de l'opération
	 * @param montant
	 *            montant de l'opération
	 */
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	

	/** Méthode abstraite qui impose au classe fille de retourner leur type
	 * @return String
	 */
	public abstract String getType();

	/** Cette méthode est appelée automatiquement lorsqu'on affiche une instance de la classe Operation avec un System.out.println
	 * C'est une redéfinition de la méthode toString() de la classe Object
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Type : "+ getType() + " - Date : " + date + " - Montant :" + montant;
	}


	/**
	 * Getter
	 * 
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Getter
	 * 
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Setter
	 * 
	 * @param montant
	 *            the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
}
