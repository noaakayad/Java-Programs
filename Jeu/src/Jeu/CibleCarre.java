package Jeu;

public class CibleCarre extends Cible{
	
	public CibleCarre(int x, int y, int taille , FenetreDeJeu FDJ) {
		super(x,y,taille,FDJ);
	}
	
	public boolean touchee(int tx, int ty) {
		boolean res = true;
		
		if (tx - this.x < 0 || tx - this.x > taille) {
			res = false;
		}
		
		if (this.y - ty < 0 || this.y - ty > taille) {
			res = false;
		}
		
		return res;
	}
	
	public void modifiee () {
		this.taille = this.taille/3;
	}
}
