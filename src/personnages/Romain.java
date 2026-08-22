package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert isInvariantVerified();
		int debut_force_romain = force;
		force -= forceCoup;
		if (force < 1) {
			force = 0;
			parler("J\'abandonne !");
		} else {
			parler("Aie");
		}
		assert force < debut_force_romain;
		assert isInvariantVerified();
	}

	private boolean isInvariantVerified() {
		return this.force >= 0;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
				break;
			}
			// Pas de break ici pour laisser passer au cas 0 si c'est un autre équipement !
		case 0:
			equipements[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
			break;
		default:
			break;
		}
	}

}