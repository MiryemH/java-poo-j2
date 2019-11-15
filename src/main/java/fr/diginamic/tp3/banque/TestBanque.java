package fr.diginamic.tp3.banque;

import fr.diginamic.tp3.banque.entites.Compte;
import fr.diginamic.tp3.banque.entites.CompteTaux;

/** Classe exécutable du TP3
 * @author DIGINAMIC
 *
 */
public class TestBanque {

	/** Méthode exécutable
	 * @param args paramètres du programme
	 */
	public static void main(String[] args) {
		
		// Création du tableau de comptes
		Compte[] comptes = new Compte[2];
		comptes[0] = new CompteTaux("12A", 150.0, 0.8);
		comptes[1] = new CompteTaux("12B", 250.0, 1.5);
		
		// Boucle sur le tableau de comptes
		for (int i=0; i<comptes.length; i++){
			System.out.println(comptes[i]);
		}

	}

}
