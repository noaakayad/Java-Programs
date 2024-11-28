package Jeu;

public class FenetreDeJeu {
	public int largeur;
	public int longueur;
	
	public FenetreDeJeu(int x, int y) {
		if(x>=0) {
			this.largeur = x;
		}
		if(x<0) {
			this.largeur = 0;
		}
		if(y>=0) {
			this.longueur = y;
		}
		if(x<0) {
			this.longueur = 0;
		}
	}
	
	public int getLargeur() {
		return this.largeur;
	}
	
	public int getLongueur() {
		return this.longueur;
	}
	
	public boolean estDansFenetre (int x, int y) {
		if(x<0 || x > this.largeur || y<0 || y> this.longueur) {
			return false;
		}
		return true;
	}
}
