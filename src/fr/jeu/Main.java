package fr.jeu;

import Personnage.Guerrier;
import Personnage.Personne;
import Personnage.Soigneur;
import Personnage.Sorcier;
import fr.bonus.Arme;
import fr.bonus.Pouvoir;

public class Main {

	public static void main(String[] args) {
		
		//Initialisation des personnages
		Arme arme1 = new Arme("pistolet",3);
		Pouvoir pouvoir1 = new Pouvoir("feu",4);
		
		Personne guerrier1 = new Guerrier("Achille","Talon",100,10,5,arme1);
		Personne soigneur1 = new Soigneur("Merlin","Enchanteur",100,8,5,2);
		Personne sorcier1 = new Sorcier("Merlin","Enchanteur", 100,10,5,pouvoir1);
		
		Jeu jeu1 = new Jeu(guerrier1, sorcier1);
		jeu1.combattre();
		
	}
	

}
