package emse;

public class Room {
	
	public int id;
	public int capacity;
	private static final int defaultCapacity = 20;
	public boolean reserved;
	
	int id0 = 0;
	
	public Room(int capacite) {
		this.id = id0;
		id0++;
		this.capacity = capacite;
		this.reserved = false;
	}
	
	public Room() {
		this.id = id0;
		id0++;
		this.capacity = defaultCapacity;
		this.reserved = false;
	}
	
	public boolean reserve(int nbStudent) {
		if (!this.reserved && nbStudent < this.capacity) {
			this.reserved = true;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void release() {
		this.reserved = false;
	}
	
	public void display() {
		if (!this.reserved) {
			System.out.println("la salle " + this.id + "de " + this.capacity + "places est libre");
		}
		else {
			System.out.println("la salle " + this.id + "de " + this.capacity + "places n'est pas libre");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
