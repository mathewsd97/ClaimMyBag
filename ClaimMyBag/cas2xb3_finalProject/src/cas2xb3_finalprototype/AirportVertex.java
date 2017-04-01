package cas2xb3_finalprototype;

public class AirportVertex implements Comparable<AirportVertex> {

	public String name; 	// label for vertex
	public int uid; 		// unique identifier for vertex (index)
	public String airportCode;
	public AirportVertex(String v, String code, int i) {
		name = v;
		uid = i;
		airportCode = code;
	}

	public int getID(){
		return this.uid;
	}
	
	public String getAirportCode(){
		return this.airportCode;
	}
	
	public String toString() {
		return name;
	}

	public int compareTo(AirportVertex other) {
		return name.compareTo(other.name);
	}
}