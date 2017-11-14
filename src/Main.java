
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Avant l'exécution il y a : ");
		System.out.println(Pays.getCompteur() + " pays");
		System.out.println(Capitale.getCompteur() + " capitale(s)");
		System.out.println(Ville.getCompteur() + " ville(s)");*/
		Capitale paris = new Capitale("paris",330,50000);
		Pays belgique = new Pays();
		Pays france = new Pays("france","français","euros", 500000, paris);
		Pays espagne = new Pays();
		
		Capitale bruxelle = new Capitale("Bruxelle", 235515, 1521496);


		
		Ville lille = new Ville("lille", 1521, 251);
		Ville biarritz = new Ville("Biarritz", 2400, 600);
		Ville evry = new Ville("evry", 3412, 854);
		
		
		
		/*System.out.println(france.toString());
		
		System.out.println(belgique.toString());
		System.out.println(espagne.toString());*/
		
		/*System.out.println("Après l'exécution il y a : ");
		System.out.println(Pays.getCompteur() + " pays");
		System.out.println(Capitale.getCompteur() + " capitales");
		System.out.println(Ville.getCompteur() + " villes");*/
		
		france.ajouterVille(lille);
		france.ajouterVille(evry);
		france.ajouterVille(biarritz);
		//france.supprimerVille(biarritz);
		
	//	System.out.println(belgique.toString());
		System.out.println(france.toString());
	//	System.out.println(espagne.toString());
		
		//System.out.println(france.rechercherVille("evry"));
		//france.supprimerVille(biarritz);
		//System.out.println(france.toString());
		
		
	}

}
