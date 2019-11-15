package fr.diginamic.tp5intro;

import fr.diginamic.tp5intro.entites.Cercle;
import fr.diginamic.tp5intro.entites.ObjetGeometrique;
import fr.diginamic.tp5intro.entites.Rectangle;

/**
 * Classe exécutable du TP5 - INTRO
 * 
 * @author DIGINAMIC
 *
 */
public class TestObjetGeometrique {

	/**
	 * Méthode exécutable
	 * 
	 * @param args
	 *            paramètres du programme
	 */
	public static void main(String[] args) {
		
		// Instanciation d'un tableau de 4 objets géométriques
		ObjetGeometrique[] objets = new ObjetGeometrique[4];
		objets[0] = new Cercle(1.0);
		objets[1] = new Rectangle(1.0, 2.5);
		objets[2] = new Cercle(2.0);
		objets[3] = new Rectangle(4.0, 3.5);

		// Boucle permettant d'afficher les 4 objets géométriques
		for (int i = 0; i < objets.length; i++) {

			// Ajout d'une méthode permettant d'afficher les caractéristiques de l'objet
			System.out.println(objets[i].infos());
			
			// Affichage de la surface de chaque objet: 
			System.out.println("Surface :" + objets[i].surface());
			
			// Affichage du périmètre de chaque objet: 
			System.out.println("Périmètre :" + objets[i].perimetre());
			
			// Ajout d'une ligne de séparation
			System.out.println("-----------------------------------------------");

		}

	}

}
