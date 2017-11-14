
public class Ville {
	
	private String nom;
	private int nbHabitantsV;
	private float superficie;
	private static int compteur = 0;
	//test
	public Ville(){
		compteur = compteur + 1;
	}
	//tes
	public Ville(String unNom, int unHabitant, float uneSuperficie){
		this.nom = unNom;
		this.nbHabitantsV = unHabitant;
		this.superficie = uneSuperficie;
		compteur = compteur + 1;
	}
	
	public Ville(String unNom, float uneSuperficie){
		this.nom = unNom;
		this.superficie = uneSuperficie;
		compteur = compteur + 1;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String unNom) {
		this.nom = unNom;
	}

	public int getNbHabitants() {
		return nbHabitantsV;
	}

	public void setNbHabitants(int unHabitant) {
		this.nbHabitantsV = unHabitant;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float uneSuperficie) {
		this.superficie = uneSuperficie;
	}
	
	public static int getCompteur(){
		return compteur;
	}
	
	public String toString(){
		return "Le nom : " + this.nom + "\nLe nombre d'habitants : " + this.nbHabitantsV + "\nLa superficie : " + this.superficie;
	}
	
	

}
