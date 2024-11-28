package tourism;

public class building extends Tourisme{

	public double price;
	
	public building(double prix) {
		if(prix > 0) {
			this.price = prix;
		}
		else {
			this.price = 0;
		}
	}
	
	
	public String toString() {
		String def = "Son prix est ";
		return def + Double.toString(this.price) + " euros.";
	}

}
