package tourism;

public class Accomodation extends building {
	
	public String type;
	public int nbBeds;
	public int TAX;
	
	
	public Accomodation(String type, int nbBeds, int tax, double price) {
		super(price);
		this.type = type;
		this.nbBeds = nbBeds;
		this.TAX = tax;
	}
	
	public double price (int unity) {
		return this.price*unity + this.TAX;
	}
	
	public String toString() {
		return super.toString() + "Son type est " + this.type + '.' + "Son nb de lit est " + Integer.toString(this.nbBeds) + '.';
	}

}
