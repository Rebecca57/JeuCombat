package Personnage;
import fr.bonus.Arme;

public class Guerrier extends Personne{
	
	private Arme _monArme;

	//Constructeur
	public Guerrier(String prenom, String nom, int pointsDeVie, int pointsAction, int pointsAttaque, Arme arme) {
		super(prenom, nom, pointsDeVie, pointsAction, pointsAttaque);
		this.setMonArme(arme);
	}
	
	//getter setter
	private Arme getMonArme() {
		return _monArme;
	}

	private void setMonArme(Arme _monArme) {
		this._monArme = _monArme;
	}
	
	//Methodes
	
	@Override
	public String toString() {
		return "Guerrier - "+super.toString();
	}
	
	@Override
	public void attaquer(Personne p) {
		//Modifier pointsDeVie de p
		int totalAttaque =  this.getPointsAttaque();
		//Si il reste des points d'action: ajout de la valeur de pouvoir dans attqueTotale et décrément des points actions
		if (this.getPointsAction()>0) {
			System.out.println("Bonus Arme activé ("+this.getMonArme().getBonus()+")");
			totalAttaque += this.getMonArme().getBonus();
			this.setPointsAction(this.getPointsAction() - 1);
		}
		else {
			System.out.println("Bonus Arme inactif");
		}
		//Maj des points de vie de p
		p.setPointsDeVie( Math.max(0,p.getPointsDeVie() - totalAttaque) );
		System.out.println(this+" ("+this.getPointsDeVie()+") attaque -- ("+totalAttaque+") -->  "+p+" ("+p.getPointsDeVie() +")");
		//Décrémenter les points actions de this
		
		System.out.println("_________________________________________________________________________");
		
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Guerrier)) return false;
		Guerrier perso = (Guerrier) obj;
		return (super.equals(perso) && this.getMonArme().equals(perso.getMonArme()));
	}

}
