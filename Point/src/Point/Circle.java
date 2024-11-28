package Point;

public class Circle {
	
	private Point centre;
	private double rayon;
	
	public Point readCentre () {
		return centre;
	}
	
	public double readRayon() {
		return rayon;
	}
	
	public void verifSurface() {
		double surface = Math.PI * rayon * rayon;
		if (surface > centre.BORNE_MIN*centre.BORNE_MAX) {
			rayon = 0;
		}
	}
	
    public double findMin(double a, double b, double c, double d) {
        double min = a; 

        if (b < min) {
            min = b; 
        }
        if (c < min) {
            min = c; 
        }
        if (d < min) {
            min = d; 
        }

        return min; 
    }
	
	public Circle(Point c, double r) {
		
		double dhaut = c.BORNE_MAX - (c.readOrd() + r);
		if (dhaut < 0) {
			dhaut = c.BORNE_MAX - c.readOrd();
		}
		double dbas = c.readOrd() - r;
		if (dbas < 0) {
			dbas = c.readOrd();
		}
		double dgauche = c.readAbs() - r;
		if (dgauche < 0) {
			dgauche = c.readAbs();
		}
		double ddroite = c.BORNE_MAX - (c.readAbs() + r);
		if (ddroite < 0) {
			ddroite = c.BORNE_MAX - c.readOrd() ;
		}
		
		double d = findMin(dhaut, dbas, dgauche, ddroite);
		
		if (r > d) {
			r = d;
		}	
		
		if (r < 0) {
			r = -r;
		}
		
		this.rayon = r;
		this.centre = c;

	}
	
	public boolean inDisque (Point p) {
		double distance = Math.sqrt(Math.pow((centre.readAbs() - p.readAbs()), 2) + Math.pow((centre.readOrd() - p.readOrd()), 2));
		return rayon >= distance;
	}
	
	public boolean superpose(Circle c ) {
		return c.centre.readAbs() == centre.readAbs() && c.centre.readOrd() == centre.readOrd() && c.readRayon() == this.readRayon();
	}
	
	public void display() {
		System.out.println("le cercle a pour rayon " + rayon + " , son centre est le point " + centre.readId() + " est en position (" + centre.readAbs() + "," + centre.readOrd() + ")");
	}

}


