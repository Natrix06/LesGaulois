package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, final int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public String getNom() {
		return nom;
	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > nbVillageois || numVillageois < 1) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		} else {
			return villageois[numVillageois - 1];
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abracourix", 6);
		Village village = new Village("Village des Irreductibles", abraracourcix, 30);
		village.trouverVillageois(30);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		Gaulois doublepolemix = new Gaulois("Doublepoemix", 4);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		asterix.sePresenter();
		obelix.sePresenter();
		doublepolemix.sePresenter();
	}

	public void afficherVillage() {
		System.out.println("Dans le village " + "\"" + getNom() + "\"" + " du chef " + getChef()
				+ " vivent les legendaires gaulois :");

		for (int i = 0; i < nbVillageois; i++) {
			if (villageois[i] != null) {
				System.out.println("- " + villageois[i]);
			}

		}
	}

}
