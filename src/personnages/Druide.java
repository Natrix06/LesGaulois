package personnages;

public class Druide {
	
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}

	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
}
