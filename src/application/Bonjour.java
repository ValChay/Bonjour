package application;

import domaine.Groupe;
import domaine.Personne;

public class Bonjour {


		public static void main(String arg[]){
			Groupe grp = new Groupe(arg);
			Personne personne[];
			personne = new Personne[arg.length];
			System.out.println("Salut au groupe "+grp);
	
		}
}
