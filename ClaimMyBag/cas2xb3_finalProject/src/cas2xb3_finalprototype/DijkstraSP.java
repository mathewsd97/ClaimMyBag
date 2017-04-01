package cas2xb3_finalprototype;
import edu.princeton.cs.algs4.IndexMinPQ;
import edu.princeton.cs.algs4.Stack;

public class DijkstraSP {
	private AirportEdge[] edgeTo;
	private double[] averageRiskLevel;
	private IndexMinPQ<Double> pq;
	
	public DijkstraSP(AirportGraph G, int s){
		edgeTo = new AirportEdge[G.V()];
		averageRiskLevel = new double[G.V()];
		pq = new IndexMinPQ<Double>(G.V());
		
		for (int v = 0; v < G.V(); v++){
			averageRiskLevel[v] = Double.POSITIVE_INFINITY;
		}
		averageRiskLevel[s] = 0.0;
		
		pq.insert(s,  0.0);
		while(!pq.isEmpty())
			relax(G, pq.delMin());
	}
	
	
	private void relax(AirportGraph G, int v){
		for (AirportEdge e : G.adj(v)){
			int w = e.to();
			if (averageRiskLevel[w] > averageRiskLevel[v] + e.frequencyRisk()){
				averageRiskLevel[w] = averageRiskLevel[v] + e.frequencyRisk();
				edgeTo[w] = e;
				if (pq.contains(w)) pq.changeKey(w, averageRiskLevel[w]);
				else pq.insert(w, averageRiskLevel[w]);
			}
		}
	}
	
	public double riskLevelTo(int v){
		return averageRiskLevel[v];
	}
	
	public boolean hasPathTo(int v){
		return averageRiskLevel[v] < Double.POSITIVE_INFINITY;
	}
	
	public Iterable<AirportEdge> pathTo(int v){
		if (!hasPathTo(v)) return null;
		Stack<AirportEdge> path = new Stack<AirportEdge>();
		for (AirportEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()])
			path.push(e);
		return path;
	}
}