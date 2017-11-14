
public class Pays {

	
	private String nom;
	private String langue;
	private String monnaie;
	private int nbHabitants;
	private Capitale saCapitale;
	private Ville lesVilles[];
	private int nbVille;
	private static int compteur = 0;
	
	
	
	public Pays(){
		compteur = compteur + 1;
		this.lesVilles = new Ville[5];
		this.nbVille = 0;
		this.saCapitale = new Capitale();
	}
	
	public Pays(String unNom, String uneLangue, String uneMonnaie, int unHabitant, Capitale saCapitale){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.nbHabitants = unHabitant;
		this.saCapitale = saCapitale;
		this.lesVilles = new Ville[5];
		this.nbVille = 0;
		compteur = compteur + 1;
		
	}
	
	public Pays(String unNom, String uneMonnaie, String uneLangue){
		this.nom = unNom;
		this.monnaie = uneMonnaie;
		this.langue = uneLangue;
		this.saCapitale = new Capitale();
		this.lesVilles = new Ville[5];
		this.nbVille = 0;
		compteur = compteur + 1;
		
	}
	
	/**
	 * Retourne le nom du pays
	 * @return
	 */
	public 	String getNom(){
		return nom;
	}
	
	/**
	 * Paramètre le nom
	 * @param unNom
	 */
	public void setNom(String unNom){
		this.nom = unNom;
	}
	
	/**
	 * Retourne la langue du pays
	 * @return
	 */
	public String getLangue(){
		return langue;
	}
	
	/**
	 * Paramètre la langue
	 * @param uneLangue
	 */
	public void setLangue(String uneLangue){
		this.langue = uneLangue;
	}
	
	public String getMonnaie(){
		return monnaie;
	}
	
	public void setMonnaie(String uneMonnaie){
		this.monnaie = uneMonnaie;
	}
	
	public static int getCompteur(){
		return compteur;
	}
	
	public int getNbVille(){
		return nbVille;
	}
	
	public void ajouterVille(Ville uneVille){
		
		this.lesVilles[this.nbVille] = uneVille;
		this.nbVille = this.nbVille + 1;
	}
	
public void ajouterVille(String unNom, int nbHabitantsV, int superficie){
		Ville uneVille = new Ville(unNom, nbHabitantsV, superficie);
		this.lesVilles[this.nbVille] = uneVille;
		this.nbVille = this.nbVille + 1;
	}
	
	/*public String afficherVille(){
		String chaine = "";
		for(int i = 0; i < this.nbVille; i++){
			chaine = chaine + " " + this.lesVilles[i].getNom();
		}
		return chaine;
	}*/
	
	public void supprimerVille(Ville uneVille){
		int i = 0;
		while(i < this.nbVille && !uneVille.equals(this.lesVilles[i].getNom())){
			i++;
		}
		if(i<this.nbVille){
			for(i = i; i < this.nbVille; i++){
				this.lesVilles[i] = this.lesVilles[i+1];
			}
		}
		else{
			System.out.println("Il n'est pas dans la liste");
		}
	}
	
	public String rechercherVille(String unNom){
		int i = 0;
		while(i < this.nbVille && !unNom.equals(this.lesVilles[i].getNom())){
			i++;
		}
		if(i < this.nbVille){
			return this.lesVilles[i].getNom();
		}
		else{
			return "Pas dans la liste";
		}
	}

	
	public String toString(){
		String chaine = "Le nom : " + this.nom + "\nLa langue : " + this.langue + "\nLa monnaie : " + this.monnaie + "\n Nombre d'habitants : " + this.nbHabitants + this.saCapitale.toString();
		
		for(int i = 0; i < this.nbVille; i++){
			chaine += this.lesVilles[i].toString();
		}
		return chaine;
		
	}
	
	public void majuscule(String unNom){
		this.nom = unNom.toUpperCase();
		
	}
	
	private void caractere(String unNom){
		this.nom = unNom.toUpperCase();
		
		char premiere = unNom.charAt(0);
		
		
	}

}
