package emse;

public abstract class CO2Comparator implements Comparator<SmartRoom> {
	public int compare(SmartRoom r1, SmartRoom r2) {
		if (r1.valueSensor("co2") > r2.valueSensor("co2")) {
			return 1;
		}
		else if (r1.valueSensor("co2") < r2.valueSensor("co2")) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
