package Personnage;

import fr.bonus.Pouvoir;

public class Sorcier extends Personne{

	private Pouvoir _monPouvoir;
	
	//Constructeur
	public Sorcier(String prenom, String nom, int pointsDeVie, int pointsAction, int pointsAttaque, Pouvoir pouvoir) {
		super(prenom, nom, pointsDeVie, pointsAction, pointsAttaque);
		this.setPouvoir(pouvoir);
	}
	
	//Getter Setter
	private Pouvoir getPouvoir() {
		return this._monPouvoir;
	}
	
	private void setPouvoir(Pouvoir p) {
		this._monPouvoir = p;
	}
	
	
	//Methodes
	@Override
	public String toString() {
		return "Sorcier - "+super.toString();
	}
	
	@Override
	public void attaquer(Personne p) {
		
		//Modifier pointsDeVie de p
		int totalAttaque =  this.getPointsAttaque();
		//Si il reste des points d'action: ajout de la valeur de pouvoir dans attaqueTotale et décrément des points actions
		if (this.getPointsAction()>0) {
			System.out.println("Bonus Pouvoir activé ("+this.getPouvoir().getValeur()+")");
			totalAttaque += this.getPouvoir().getValeur();
			this.setPointsAction(this.getPointsAction() - 1);
		}
		else {
			System.out.println("Bonus Pouvoir inactif");
		}

		//Maj des points de vie de p
		p.setPointsDeVie( Math.max(0,p.getPointsDeVie() - totalAttaque) );
		System.out.println(this+" ("+this.getPointsDeVie()+") attaque -- ("+totalAttaque+") -->  "+p+" ("+p.getPointsDeVie()+")");
		System.out.println("_________________________________________________________________________");
		
	}
	
}
