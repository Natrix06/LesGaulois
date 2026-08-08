package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		Romain minus = new Romain("Minus", 6);

		asterix.parler("Bonjour Obelix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tres bone idee.");

		System.out.println("Dans la foret " + asterix.getNom() + " et " + obelix.getNom() + " tombent nez a nez avec "
				+ "le romain " + minus.getNom() + ".");

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}

	}
}
