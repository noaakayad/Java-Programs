package tp_tab;

public class TestTableauClass {

	public static void main(String[] args) {
		int[] tableau = new int[10];
		int valeurMin = 1;
		int valeurMax = 100;
		
		for (int i = 0; i < 10; i++) {
			int taille = valeurMax - valeurMin;
			double r = Math.random();
			r = r*taille + valeurMin;
			tableau[i] = (int) r;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(tableau[i] + " ");
		}
		
		int s = 0;
		int s2 = 0;
		int moyenne = (valeurMax + valeurMin)/2;
		boolean existe = false;
		
		System.out.println("moyenne : " + moyenne);
		
		while (s < 10) {
			if(tableau[s] >= moyenne) {
				s2 ++;
				if (s2 == 3) {
					existe = true;
					System.out.println("3e valeur : " +tableau[s]);
				}
			}
			s++;
			if(s == 9) {
				if (!existe) {
					System.out.println("La 3e valeure n'existe pas");
				}
			}
		}
		
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < 10; i++) {
			if (tableau[i]> max) {
				max = tableau[i];
			}
		}
		
		System.out.println("le max est : " + max);
		
		int nbValPlusPetite = 0;
		int nbValPlusGrande = 0;
		int s3 = 0;
		
		while (s3 < 10) {
			if (tableau[s3] < moyenne) {
				nbValPlusPetite++;
			}
			else {
				nbValPlusGrande++;
			}
			s3++;
		}
		
		int[] tabPlusPetit = new int[nbValPlusPetite];
		int[] tabPlusGrand = new int[nbValPlusGrande];
		
		int s4 = 0;
		int s5 = 0;
		
		for (int i = 0; i < 10; i++) {
			if (tableau[i] < moyenne) {
				tabPlusPetit[s4] = tableau[i];
				s4++;
			}
			else {
				tabPlusGrand[s5] = tableau[i];
				s5++;
			}
		}
		
		System.out.println("Plus Petit : ");
		for (int i = 0; i < nbValPlusPetite; i++) {
			System.out.println(tabPlusPetit[i] + " ");
		}
		System.out.println("Plus Grand : ");
		for (int i = 0; i < nbValPlusGrande; i++) {
			System.out.println(tabPlusGrand[i] + " ");
		}
		
	}

}



