package cas2xb3_finalprototype;

import edu.princeton.cs.algs4.SeparateChainingHashST;

public class Trial {
	private static SeparateChainingHashST<Integer, String> hashmap = new SeparateChainingHashST<Integer, String>();
	public static void main(String[] args){
		hashmap.put(2, "diya");
		hashmap.put(1, "shalmi");
		hashmap.put(0, "rhea");
		hashmap.put(1, "appu");
		System.out.println(hashmap.get(1));
		System.out.println(hashmap.toString());
	}
}
