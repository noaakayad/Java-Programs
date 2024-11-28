package tourism;

public class Cultural extends building{
	
	int[] validityTemporalWindow;
	
	public Cultural(int[] hours, double price) {
		super(price);
		this.validityTemporalWindow = hours;
	}

	public double price (int unity) {
		return this.price*unity;
	}
	
	public String toString() {
		return super.toString() + "Les horaires d'ouverture sont de " + Integer.toString(this.validityTemporalWindow[0]) + "h à " + Integer.toString(this.validityTemporalWindow[1]) + '.';
	} 

}
