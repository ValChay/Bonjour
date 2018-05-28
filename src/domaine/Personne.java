package domaine;

public class Personne {

	private String nom;
	public Personne(String nm){
		System.out.println("instentiation de"+nm);
		nom = nm;
	}
	
	public String toString(){
		
		return nom ;
	}
	public String salut(){
		return "Bonjour"+nom;
	}
}
