package Personnage;

public abstract class Personne {
	
	//attributs
	private String _nom;
	private String _prenom;
	private int _pointsDeVie;
	private int _pointsAction;
	private int _pointsAttaque;
	
	//Constructeur
	Personne(final String prenom, final String nom, int pointsDeVie, int pointsAction, int pointsAttaque){
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setPointsDeVie(pointsDeVie);
		this.setPointsAction(pointsAction);
		this.setPointsAttaque(pointsAttaque);
	}

	//getter setter
	public int getPointsAction() {
		return this._pointsAction;
	}
	public void setPointsAction(int action) {
		this._pointsAction = action;
	}
	
	public String getNom() {
		return _nom;
	}
	public void setNom(String _nom) {
		this._nom = _nom;
	}

	public String getPrenom() {
		return _prenom;
	}
	public void setPrenom(String _prenom) {
		this._prenom = _prenom;
	}

	public int getPointsDeVie() {
		return _pointsDeVie;
	}
	public void setPointsDeVie(int _pointsDeVie) {
		this._pointsDeVie = _pointsDeVie;
	}
	
	public int getPointsAttaque() {
		return _pointsAttaque;
	}

	public void setPointsAttaque(int _pointsAttaque) {
		this._pointsAttaque = _pointsAttaque;
	}
	
	//Méthodes
	@Override
	public String toString() {
		return this.getPrenom() +" "+this.getNom();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Personne)) return false;
		Personne perso = (Personne) obj;
		return (this.getNom()== perso.getNom() 
				&& this.getPrenom() == perso.getPrenom() 
				&& this.getPointsDeVie() == perso.getPointsDeVie()
				&& this.getPointsAttaque() == perso.getPointsAttaque()
				&& this.getPointsAction() == perso.getPointsAction());
	}
	
	//abstraite
	public abstract void attaquer(Personne p);




}
