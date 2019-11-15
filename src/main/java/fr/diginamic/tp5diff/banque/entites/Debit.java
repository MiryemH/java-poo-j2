package fr.diginamic.tp5diff.banque.entites;

public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return TYPE_DEBIT;
	}

}
