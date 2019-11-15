package fr.diginamic.tp4intro;

import fr.diginamic.tp4intro.entites.Credit;
import fr.diginamic.tp4intro.entites.Debit;
import fr.diginamic.tp4intro.entites.Operation;

/** Classe exécutable du TP4 - INTRO
 * @author DIGINAMIC
 *
 */
public class TestOperation {

	/** Méthode exécutable
	 * @param args paramètres du programme
	 */
	public static void main(String[] args) {
		
		// Instanciation d'un tableau de 4 opérations
		Operation[] operations = new Operation[4];
		operations[0]=new Credit("11/11", 125.0);
		operations[1]=new Debit("12/11", 75.0);
		operations[2]=new Credit("12/11", 10.5);
		operations[3]=new Debit("13/11", 24.8);

		// Déclaration d'une variable pour stocker le solde global
		double soldeGlobal = 0.0;
		
		// Boucle permettant d'afficher les 4 opérations ainsi que de calculer le solde global
		for (int i=0; i<operations.length; i++){
			
			// Affichage de chaque opération: nécessite que la méthode toString() existe dans la classe Operation
			System.out.println(operations[i]);
			
			// Calcul du solde global
			if (operations[i].getType().equals("Crédit")){
				soldeGlobal+=operations[i].getMontant();
			}
			else {
				soldeGlobal-=operations[i].getMontant();
			}
		}
		
		// Affichage du solde global
		System.out.println("Solde Global = "+soldeGlobal);
	}

}
