package fr.jeu;

import Personnage.Personne;

public class Jeu {
	
	//Attributs
	private Personne _p1;
	private Personne _p2;
	
	public Jeu(Personne p1, Personne p2) {
		this.setP1(p1);
		this.setP2(p2);
	}

	//Getter Setter
	public Personne getP1() {
		return _p1;
	}

	public void setP1(Personne _p1) {
		this._p1 = _p1;
	}

	public Personne getP2() {
		return _p2;
	}

	public void setP2(Personne _p2) {
		this._p2 = _p2;
	}
	
	//methodes
	public void combattre(){
		
		double combatNbr = Math.round(Math.random());
		
		do {
			if (combatNbr == 0) {
				this.getP1().attaquer(this.getP2());
			}
			else {
				this.getP2().attaquer(this.getP1());
			}
			
			//Random 0 ou 1
			combatNbr = Math.round(Math.random());
			
		}while(this.getP1().getPointsDeVie() > 0 && this.getP2().getPointsDeVie() > 0);
		
		this.afficherResultat();
		
	}
	
	public void afficherResultat() {
		if (this.getP1().getPointsDeVie() == 0) {
			System.out.println(this.getP1()+" lose!");
			System.out.println(this.getP2()+" final score: "+this.getP2().getPointsDeVie());
		}
		else {
			System.out.println(this.getP2()+" lose!");
			System.out.println(this.getP1()+" final score: "+this.getP1().getPointsDeVie());
		}
		
		
		
	}
	
	

}
