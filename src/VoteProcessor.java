import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> candidates = new ArrayList<String>();
	
		
		
		for(int i = 0; i < votes.size(); i++) {
			votes.set(i, votes.get(i).toLowerCase());
		}
		
		boolean found = false;
		for(String v : votes) {
			found = false;
			for(int i = 0; i < candidates.size(); i++) {
				if(candidates.contains(v)) {
					found = true;
				}
			}
			if(!found) {
				candidates.add(v);
			}
		}
		
		for(int i = 0; i< candidates.size(); i++) {
			list.add(0);
		}
		
		for(int i = 0; i < votes.size(); i++) {
			for(int j = 0; j < candidates.size(); j++) {
			if(votes.get(i).equals(candidates.get(j))) {
				list.set(j, list.get(j)+1);
				
				}
			}
		}
		
		int maxIndex = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(maxIndex) < list.get(i)) {
				maxIndex = i;
			}
		}
		
		
		
		boolean tie = true;
		int num1 = list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) != num1) {
				tie = false;
				//System.out.println(list.get(i));
			}
			
		}
		
		if(tie) {
			return "TIE";
		}
		
		
		//return candidates.get(maxIndex);
		
		System.out.println(maxIndex);
		System.out.println(Arrays.toString(candidates.toArray()));
		System.out.println(Arrays.toString(list.toArray()));
		return candidates.get(maxIndex);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> votes = new ArrayList<String>();
		votes.add("pope francis");
		votes.add("edward Snowden");
		
		VoteProcessor v = new VoteProcessor();
		
		System.out.println(v.calculateElectionWinner(votes));
	}

}
