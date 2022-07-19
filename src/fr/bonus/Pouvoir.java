package fr.bonus;

public class Pouvoir {
	
	private String _nom;
	private int _valeur;
	
	public Pouvoir(String nom, int valeur) {
		this.setNom(nom);
		this.setValeur(valeur);
	}

	public String getNom() {
		return _nom;
	}

	public void setNom(String _nom) {
		this._nom = _nom;
	}

	public int getValeur() {
		return _valeur;
	}

	public void setValeur(int _valeur) {
		this._valeur = _valeur;
	}

}
