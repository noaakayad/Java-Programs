package Jeu;

public class Joueur {
	private int x;
	private int y;
	private int score;
	private FenetreDeJeu FDJ;
	
	public Joueur(int x, int y, int score, FenetreDeJeu FDJ) {
		this.x = x;
		this.y = y;
		this.score = score;
		this.FDJ = FDJ;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setFDJ(FenetreDeJeu FDJ) {
		this.FDJ = FDJ;
	}
	
	public boolean cliquer(int x, int y) {
		if (FDJ.estDansFenetre(x,y)) {
			this.x = x;
			this.y = y;
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
