package fr.diginamic.tp2.banque;

import fr.diginamic.tp2.banque.entites.Compte;

/** Classe exécutable du TP2
 * @author DIGINAMIC
 *
 */
public class TestBanque {

	/** Méthode exécutable
	 * @param args paramètres du programme
	 */
	public static void main(String[] args) {
		
		// Création de l'instance
		Compte cpt1 = new Compte("A123", 825.5);
		
		// Affichage de l'instance: en l'absence de méthode toString() dans la classe Compte,
		// cette méthode affiche une chaine de caractères du genre:
		// fr.diginamic.tp1.banque.entites.Compte@15db9742
		System.out.println(cpt1);

	}

}
