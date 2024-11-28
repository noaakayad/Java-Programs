package Jeu;

public class CibleCarreMobile extends CibleCarre implements Mobile{

	public CibleCarreMobile(int x, int y, int taille , FenetreDeJeu FDJ) {
		super(x,y,taille,FDJ);
	}
	
	public void deplacer() {
		int newX = (int) (Math.random() * FDJ.getLargeur());
        int newY = (int) (Math.random() * FDJ.getLongueur());
        
        if (FDJ.getLargeur() - newX - 1 < taille) {
        	newX = newX - (taille - (FDJ.getLargeur() - newX));
        }

        if (newY + 1 < taille) {
        	newY = taille;
        }
        
        this.x = newX;
        this.y = newY;
	}
}
