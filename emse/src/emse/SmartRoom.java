package emse;
import java.util.ArrayList;



public class SmartRoom extends Room implements Comparable<SmartRoom>{
	
	public ArrayList<Sensor> sensors;
	
	public SmartRoom(int nbSensors, int capa) {
		super(capa);
		this.sensors = new ArrayList<Sensor> ();
		this.sensors.add(new Sensor("température"));
	}

	public SmartRoom() {
		super();
		this.sensors = new ArrayList<Sensor> ();
		this.sensors.add(new Sensor("température"));
	}
	
	public void addSensor (Sensor sensor){ 
		sensors.add(sensor);
	}
	
	public Integer valueSensor(String name) {
		int nbSensor = sensors.size(); 
		
		for (int i = 0; i < nbSensor; i++) {
			if (sensors.get(i).name == name) {
				return sensors.get(i).value;
			}
		}
		
		return null;
	}
	
	public int compareTo(SmartRoom autreRoom) {
		return Integer.compare(this.valueSensor("température"), autreRoom.valueSensor("température"));
	}
	
}
