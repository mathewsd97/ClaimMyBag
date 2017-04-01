package cas2xb3_finalprototype;

public class AirportEdge {
	private final int v;
	private final int w;
	private final double frequencyRisk;
	
	public AirportEdge(int v, int w, double frequencyRisk){
		this.v = v;
		this.w = w;
		this.frequencyRisk = frequencyRisk;
	}
	
	public double frequencyRisk(){
		return frequencyRisk;
	}
	
	public int from(){
		return v;
	}
	
	public int to(){
		return w;
	}
	
}