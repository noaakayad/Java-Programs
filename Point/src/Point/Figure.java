package Point;

public class Figure {

	private Point[] envelop;
	
	public Figure(Point[] points){
		envelop = new Point[points.length];
		
		for (int i = 0; i<points.length; i++) {
			envelop[i] = points[i];
		}
	}
	
	public Point middle(Point p1, Point p2) {
		double newX = (p1.readAbs() + p2.readAbs())/2;
		double newY = (p1.readOrd() + p2.readOrd())/2;
		Point newPts = new Point(newX, newY);
		return newPts;
	}
	
	public void middle() {
		int taille = envelop.length;
		int newTaille = taille + taille*(taille-1)/2;
		Point[] newPoints = new Point[newTaille];
		
		for(int i = 0; i<taille; i++) {
			newPoints[i] = envelop[i];
		}
		
		int index = taille;
		for (int i = 0; i < taille; i++){
			for (int j = i+1; j < taille; j++) {
				newPoints[index] = middle(envelop[i], envelop[j]);
				index++;
			}
		}
		
		envelop = new Point[newTaille];
		
		for (int i = 0; i<newTaille; i++) {
			envelop[i] = newPoints[i];
		}
		
	}
	
	public int MinX() {
		int taille = envelop.length;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < taille; i++) {
			if ((int) envelop[i].readAbs() < min) {
				min = (int) envelop[i].readAbs();
			}
		}
		
		return min;
	}
	
	public int MaxX() {
		int taille = envelop.length;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < taille; i++) {
			if ((int) envelop[i].readAbs() > max) {
				max = (int) envelop[i].readAbs();
			}
		}
		
		return max;
	}
	
	public int MinY() {
		int taille = envelop.length;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < taille; i++) {
			if ((int) envelop[i].readOrd() < min) {
				min = (int) envelop[i].readOrd();
			}
		}
		
		return min;
	}
	
	public int MaxY() {
		int taille = envelop.length;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < taille; i++) {
			if ((int) envelop[i].readOrd() > max) {
				max = (int) envelop[i].readOrd();
			}
		}
		
		return max;
	}
	
	public void affichage(){
		double minX = MinX();
		double maxX = MaxX();
		double minY = MinY();
		double maxY = MaxY();
		
		int[][] affichage = new int[(int) (maxX - minX)][(int) (maxY - minY)];
		
		for (int i = 0; i < (int) (maxX - minX); i++) {
			for (int j =0; j < (int) (maxY - minY); j++) {
				affichage[i][j] = 0;
			}
		}
		
		for (int i = 0; i < envelop.length; i++) {
			Point pts = envelop[i];
			int x = (int) pts.readAbs();
			int y = (int) pts.readOrd();
			
			affichage[x][y] = 1;
		}
		
		for (int i = 0; i < (int) (maxX - minX); i ++) {
			for (int j = 0; j < (int) (maxY - minY); j ++) {
				System.out.print(affichage[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
