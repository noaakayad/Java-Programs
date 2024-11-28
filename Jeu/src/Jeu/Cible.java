package Jeu;

public abstract class Cible {
	protected int x;
	protected int y;
	protected int taille;
	protected FenetreDeJeu FDJ;
	
	public Cible(int x, int y, int taille , FenetreDeJeu FDJ) {
		this.x = x;
		this.y = y;
		this.FDJ = FDJ;
		this.taille = taille;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public void setFDJ(FenetreDeJeu FDJ) {
		this.FDJ = FDJ;
	}
	
	public abstract boolean touchee(int tx, int ty);
	
	public abstract void modifiee();
	
}
