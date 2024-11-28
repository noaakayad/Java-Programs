package Jeu;

import java.util.ArrayList;

public class TestJeuPartie2 {

	public static void main(String[] args) {
		FenetreDeJeu fenetre = new FenetreDeJeu(5, 5); 
		System.out.println("Fenêtre de jeu créée avec succès.");
		
        Joueur joueur = new Joueur(0, 0, 50, fenetre);
        System.out.println("Joueur créé avec un score initial de " + joueur.getScore() + ".");
        
        ArrayList<Cible> MonJeu = new ArrayList<Cible>();
        
        CibleCarre cibleCarre = new CibleCarre(2, 2, 1, fenetre);
        CibleCarreMobile cibleCarreMobile = new CibleCarreMobile(5, 5, 1, fenetre);
        CibleCirculaire cibleCirculaire = new CibleCirculaire(5, 2, 1, fenetre);
        CibleCirculaireMobile cibleCirculaireMobile = new CibleCirculaireMobile(4, 4, 1, fenetre);
        
        MonJeu.add(cibleCarre);
        MonJeu.add(cibleCarreMobile);
        MonJeu.add(cibleCirculaire);
        MonJeu.add(cibleCirculaireMobile);
        
        int nbCibles = 4;
        
        while(joueur.getScore() >= 0 && joueur.getScore() <= 100 && nbCibles > 0) {
        	int newX = (int) (Math.random() * fenetre.getLargeur());
            int newY = (int) (Math.random() * fenetre.getLongueur());
            
            joueur.cliquer(newX, newY);
            System.out.println("Joueur se déplace à (" + newX + ", " + newY + ").");
            
            for(Cible cible : MonJeu) {
            	if(cible.taille > 0 && cible.touchee(joueur.getX(), joueur.getY())) {
            		cible.modifiee();
            		System.out.println("Cible touchée! taille de la cible " + cible.taille + ".");
            		if(cible.taille == 0) {
                		nbCibles = nbCibles - 1;
                		System.out.println("Nombre de cibles restantes: " + nbCibles);
                		if(nbCibles < 0) {
                    		System.out.println("Vous avez gagné");
                    		break;
                		}
                	}
            		joueur.setScore(joueur.getScore() + 10);
            		System.out.println("Cible touchée! Score augmenté à " + joueur.getScore() + ".");
            	}
            	else {
            		joueur.setScore(joueur.getScore() - 1);
            		System.out.println("Cible manquée. Score diminué à " + joueur.getScore() + ".");
            		if(joueur.getScore() < 0) {
            			System.out.println("Le score est négatif, vous avez perdu.");
            			break;
            		}
            	}
            }
        }

	}

}
