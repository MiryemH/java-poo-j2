package fr.diginamic.tp4intro.entites;

/** Représente une opération débitrice sur un compte bancaire
 * @author DIGINAMIC
 *
 */
public class Debit extends Operation {

	/** Constructeur
	 * @param date date
	 * @param montant montant
	 */
	public Debit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return "Débit";
	}
}
