package fr.bonus;

public class Arme {
	
	private int _bonus;
	private String _nom;
	
	public Arme(String nom, int bonus) {
		this.setNom(nom);
		this.setBonus(bonus);
	}
	
	//Getter Setter
	public int getBonus() {
		return _bonus;
	}

	public void setBonus(int _puissance) {
		this._bonus = _puissance;
	}

	public String getNom() {
		return _nom;
	}

	public void setNom(String _nom) {
		this._nom = _nom;
	}

}                                                                    
