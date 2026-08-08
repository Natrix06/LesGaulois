package personnages;

public class Chaudron {

	private int quantitePotion;
	private int forcePotion;

	// Constructeur vide (nécessaire pour new Chaudron() dans Druide)
	public Chaudron() {
		this.forcePotion = 0;
		this.quantitePotion = 0;
	}

	public Chaudron(int quantitePotion, int forcePotion) {
		this.forcePotion = forcePotion;
		this.quantitePotion = quantitePotion;
	}

	public boolean resterPotion() {
		return quantitePotion > 0;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public int prendreLouche() {
		int forceLouche = 0;
		if (quantitePotion > 0) {
			quantitePotion--;
			forceLouche = forcePotion;
			if (quantitePotion == 0) {
				forcePotion = 0;
			}
		}
		return forceLouche;
	}
}
