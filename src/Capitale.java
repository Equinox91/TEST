
public class Capitale extends Ville {
	

	
	public Capitale() {
		super();

	}

	public Capitale(String unNom, float uneSuperficie) {
		super(unNom, uneSuperficie);

	}

	public Capitale(String unNom, int unHabitant, float uneSuperficie) {
		super(unNom, unHabitant, uneSuperficie);

	}

	public String toString() {
		return "Capitale: Nom=" + getNom() + ", NbHabitants="
				+ getNbHabitants() + ", Superficie=" + getSuperficie()
				 + super.toString();
	}
	
	

}


