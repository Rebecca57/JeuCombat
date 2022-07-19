package Personnage;

public class Soigneur extends Personne{
	
	private int _pointsSoin;

	//Constructeur
	public Soigneur(String prenom, String nom, int pointsDeVie, int pointsAction, int pointsAttaque, int pointsSoin) {
		super(prenom, nom, pointsDeVie, pointsAction, pointsAttaque);
		this.setPointsSoin(pointsSoin);
	}
	
	//Getter Setter
	private void setPointsSoin(int soin) {
		this._pointsSoin = soin;
	}
	private int getPointsSoin() {
		return this._pointsSoin;
	}
	
	
	//Methodes
	
	@Override
	public String toString() {
		return "Soigneur - "+super.toString();
	}
	
	@Override
	public void attaquer(Personne p) {
		//Modifier pointsDeVie de p 
		int totalAttaque =  this.getPointsAttaque();
		//Si il reste des points d'action: ajout de la valeur de pouvoir dans attqueTotale et décrément des points actions
		if (this.getPointsAction()>0) {
			System.out.println("Bonus Soin activé ("+this.getPointsSoin()+")");
			this.setPointsAction(this.getPointsAction() - 1);
		}
		else {
				System.out.println("Bonus Soin inactif");
		}
		//Maj des points de vie de p
		p.setPointsDeVie( Math.max(0,p.getPointsDeVie() - totalAttaque) );
		System.out.println(this+" ("+this.getPointsDeVie()+") attaque -- ("+totalAttaque+") -->  "+p+" ("+p.getPointsDeVie()+")");
		//Le soigneur se soigne
		this.soigner();
		System.out.println("_________________________________________________________________________");
		
	}
	
	//Maj des points de vie de this
	private void soigner() {
		this.setPointsDeVie(Math.min(this.getPointsSoin() + this.getPointsDeVie(),100));
	}

}
