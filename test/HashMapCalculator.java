import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairsOld(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		
		int total = 0;
		
		ArrayList<String> matches = new ArrayList<String>();
		
		
		for(String s : hashmap1.keySet()) {
			for(String s2 : hashmap2.keySet()) {
				if(s.equals(s2)) {
					matches.add(s);
				}
			}
		}
		
		for(int i = 0; i < matches.size(); i++) {
			
			if(hashmap2.get(matches.get(i)).equals(hashmap1.get(matches.get(i)))) {
				total++;
			}
					
			
		}
		
		
		
				
		
		
		
		return total;
	}
	
	public int commonKeyValuePairs(HashMap<String, String> a, HashMap<String, String> b) {
		int count = 0;
		for(String k : a.keySet()) if(b.containsKey(k)) if(b.get(k).equals(a.get(k))) count++;
		return count;
	}

}
