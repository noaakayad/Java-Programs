package Jeu;

public class CibleCirculaireMobile extends CibleCirculaire implements Mobile{
	
	public CibleCirculaireMobile(int x, int y, int taille , FenetreDeJeu FDJ) {
		super(x,y,taille,FDJ);
	}
	
	public void deplacer() {
		if(this.x + this.taille + 1 > FDJ.getLargeur()) {
			this.x = 0;
		}
		else {
			this.x++;
		}
	}

}
