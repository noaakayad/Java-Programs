package Jeu;

public class CibleCirculaire extends Cible{
	
	public CibleCirculaire(int x, int y, int taille , FenetreDeJeu FDJ) {
		super(x,y,taille,FDJ);
	}
	
	public boolean touchee(int tx, int ty) {
		return (tx - this.x)*(tx - this.x) + (ty - this.y)*(ty - this.y) <= this.taille*this.taille/4;
	}
	
	public void modifiee () {
		this.taille = this.taille/2;
	}
}
 