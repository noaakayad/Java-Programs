package figure_v2;
import java.util.ArrayList;

public class Drawing {
	
	public int BORNE_MIN;
	public int BORNE_MAX;
	
	ArrayList<Point> points = new ArrayList<Point>();
	ArrayList<Circle> circles = new ArrayList<Circle>();
	
	public Drawing() {
		this.BORNE_MIN = 0;
		this.BORNE_MAX = 100;
	}
	
	public int nextInt(int limit) {
		return (int) Math.random()*limit;
	}
	
	public void generatePoints(int nb) {
		for (int i = 0; i < nb; i++) {
			int abs_i = nextInt(this.BORNE_MAX);
			int ord_i = nextInt(this.BORNE_MAX);
			Point p_i = new Point(abs_i, ord_i, this);
			points.add(p_i);
		}
	}
	
	public void generateCircle(int r) {
		int taille = points.size();
		for (int i = 0; i < taille; i++) {
			Point p_i = points.get(i);
			Circle c_i = new Circle(p_i, r, this);
			circles.add(c_i);
		}
	}
	
	public int nbSuperposition() {
		int taille = circles.size();
		int s = 0;
		
		for (int i = 0; i < taille; i++) {
			Circle c_i = circles.get(i);
			
			for (int j = i+1; j < taille; j++) {
				Circle c_j = circles.get(j);
				
				if ( c_i.superpose(c_j) ) {
					s++;
				}
			}
		}
		
		return s;
	}
	
}





