package fr.diginamic.tp4intro.entites;

/** Représente une opération créditrice sur un compte bancaire
 * @author DIGINAMIC
 *
 */
public class Credit extends Operation {

	/** Constructeur
	 * @param date date
	 * @param montant montant
	 */
	public Credit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return "Crédit";
	}

}
