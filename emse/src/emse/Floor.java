package emse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Floor {
	
	private ArrayList<SmartRoom> rooms;
	
	public Floor() {
		rooms = new ArrayList<SmartRoom>();
	}
	
	public void addRoom(int capa, int nbSensors) {
		SmartRoom newRoom = new SmartRoom(nbSensors, capa);
		rooms.add(newRoom);
	}
	
	public void addRoom() {
		SmartRoom newRoom = new SmartRoom();
		rooms.add(newRoom);
	}
	
	public void display() {
		int taille = rooms.size();
		
		for (int i = 0; i < taille; i++) {
			rooms.get(i).display();
		}
	}
	
	public int totalCapacity(ArrayList<SmartRoom> rooms) {
		int s = 0;
		int taille = rooms.size();
		
		for (int i = 0; i < taille; i++) {
			s = s + rooms.get(i).capacity;
		}
		
		return s;
	}
	
	public int totalCapacity() {
		return totalCapacity(this.rooms);
	}
	
	public ArrayList<SmartRoom> potentialRoom(){
		ArrayList<SmartRoom> newRooms = new ArrayList<SmartRoom>();
		int taille = rooms.size();
		
		for (int i = 0; i < taille; i++) {
			if(!rooms.get(i).reserved) {
				newRooms.add(rooms.get(i));
			}
		}
		
		return newRooms;
	}
	
	public ArrayList<SmartRoom> reservation(int promo){
		ArrayList<SmartRoom> newRooms = new ArrayList<SmartRoom>();
		ArrayList<SmartRoom> availableRooms = potentialRoom(); 
		int i = 0;
		
		while (totalCapacity(newRooms) < promo && i < availableRooms.size()) {
			newRooms.add(availableRooms.get(i));
			i++;
		}
		
		if (newRooms.size() < promo) {
			return new ArrayList<SmartRoom>();
		}
		else {
			return newRooms;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void sortedRooms() {
		Collections.sort((List) rooms);
		for (SmartRoom room : rooms) {
			System.out.println(room.id);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void sortedRoomsComparator(Comparator<SmartRoom> comparator) {
		Collections.sort((List) rooms, (java.util.Comparator<? super SmartRoom>) comparator);
		for (SmartRoom room : rooms) {
			System.out.println(room.id);
		}
	}

}



















