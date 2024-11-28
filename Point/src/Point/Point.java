package Point;

public class Point {
	
	private static int LastId = 0;
	private int identifiant;
	private double x;
	private double y;
	
	public static final int BORNE_MIN = 0;
	public static final int BORNE_MAX = 100;
	
	public int readId () {
		return identifiant;
	}
	public double readAbs () {
		return x;
	}
	public double readOrd () {
		return y;
	}
	
	public void verifXY() {
		if (x < BORNE_MIN || x > BORNE_MAX) {
			x = 0;
		}
		if (y < BORNE_MIN || y > BORNE_MAX) {
			y = 0;
		}
	}
	
	public Point(double abs, double ord) {
		if (abs < BORNE_MIN || abs > BORNE_MAX) {
			abs = 0;
		}
		if (ord < BORNE_MIN || ord > BORNE_MAX) {
			ord = 0;
		}
		this.x = abs;
		this.y = ord;
		LastId++;
		this.identifiant = LastId;
	}
	
	public void display() {
		System.out.println("le point " + identifiant + " est en position " + "("+x+","+y+")");
	}
	
	public boolean inLimit(double abs, double ord) {
		return (abs >= BORNE_MIN && abs <= BORNE_MAX) && (ord >= BORNE_MIN && ord <= BORNE_MAX);
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}
	
	public boolean deplace(double dx, double dy) {
		x += dx;
		y += dy;
		return inLimit(x,y);
	}
	
	public static void main(String[] args) {
	    Point p1 = new Point(2, 7);
	    Point p2 = new Point(5, 2);
	    // Point hors plan
	    Point p3 = new Point(-5, 23);
	    // point au centre

	    Point[] points = {p1, p2, p3};

	    for (int i = 0; i < points.length; i++) {
	        points[i].display();
	    }

	    System.out.println("La distance entre p1 et p2 est: " + p1.distance(p2));
	    if (p1.deplace(10, 15.0)) {
	        System.out.println(" p1 deplacé ");
	    } else {
	        System.out.println(" p1 non déplacé ");
	    }

	    if (p2.deplace(95, 1)) {
	        System.out.println(" p2 déplacé ");
	    } else {
	        System.out.println(" p2 non déplacé ");
	    }

	    p2.deplace(150, 1);
	    System.out.println("La nouvelle distance entre p1 et p2 est: " + p1.distance(p2));
	}


}
