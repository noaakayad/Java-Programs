package Jeu;
import java.util.ArrayList;

public class TestJeu {
	
    public static void main(String[] args) {
        
        FenetreDeJeu FDJ = new FenetreDeJeu(108, 600);  

        ArrayList<Mobile> mobiles = new ArrayList<>();

        mobiles.add(new CibleCirculaireMobile(100, 100, 50, FDJ));
        mobiles.add(new CibleCarreMobile(200, 200, 50, FDJ));

        for (int i = 0; i < 10; i++) {
            for (Mobile mobile : mobiles) {
                mobile.deplacer();
                if (mobile instanceof CibleCirculaireMobile) {
                    System.out.println("Cible Circulaire Mobile: Nouvelle position = (" 
                        + ((CibleCirculaireMobile) mobile).getX() + ", " 
                        + ((CibleCirculaireMobile) mobile).getY() + ")");
                } else if (mobile instanceof CibleCarreMobile) {
                    System.out.println("Cible Carre Mobile: Nouvelle position = (" 
                        + ((CibleCarreMobile) mobile).getX() + ", " 
                        + ((CibleCarreMobile) mobile).getY() + ")");
                }
            }
        }
    }
}
