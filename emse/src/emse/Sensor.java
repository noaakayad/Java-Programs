package emse;
import java.util.Random;

public class Sensor{
	
	public Random r;
	public int value;
	public String name;
	
	public Sensor(String name) {
		this.r = new Random();
		this.value = 0;
		this.name = name;
	}
	
	public int update () {
		this.value = r.nextInt();
		return this.value;
	}

}
