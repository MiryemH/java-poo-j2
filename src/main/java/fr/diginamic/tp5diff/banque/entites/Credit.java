package fr.diginamic.tp5diff.banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return TYPE_CREDIT;
	}

}
