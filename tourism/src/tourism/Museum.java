package tourism;

public class Museum extends Cultural{
	
	String taste;
	int minimumDuration;
	
	public Museum(String taste, int minimumDuration, int[] hours, double price) {
		super(hours, price);
		this.taste = taste;
		this.minimumDuration = minimumDuration;
	}
	
	public String toString() {
		return "L'activité est un musée. " + super.toString() + "Le thème est " + this.taste + " et la visite dure environ " + Integer.toString(this.minimumDuration) + "h.";
	}

}
