package figure_v2;

public class Point {
	
	private static int LastId = 0;
	private int identifiant;
	private double x;
	private double y;
	private Drawing draw;
	
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
		if (x < draw.BORNE_MIN || x > draw.BORNE_MAX) {
			x = 0;
		}
		if (y < draw.BORNE_MIN || y > draw.BORNE_MAX) {
			y = 0;
		}
	}
	
	public Point(double abs, double ord, Drawing draw) {
		if (abs < draw.BORNE_MIN || abs > draw.BORNE_MAX) {
			abs = 0;
		}
		if (ord < draw.BORNE_MIN || ord > draw.BORNE_MAX) {
			ord = 0;
		}
		this.x = abs;
		this.y = ord;
		LastId++;
		this.identifiant = LastId;
		this.draw = draw;
	}
	
	public void display() {
		System.out.println("le point " + identifiant + " est en position " + "("+x+","+y+")");
	}
	
	public boolean inLimit(double abs, double ord) {
		return (abs >= draw.BORNE_MIN && abs <= draw.BORNE_MAX) && (ord >= draw.BORNE_MIN && ord <= draw.BORNE_MAX);
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
		Drawing draw = new Drawing();
		
	    Point p1 = new Point(2, 7,draw);
	    Point p2 = new Point(5, 2,draw);
	    // Point hors plan
	    Point p3 = new Point(-5, 23,draw);
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
