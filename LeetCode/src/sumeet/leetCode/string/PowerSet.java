package sumeet.leetCode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

	public static ArrayList<ArrayList<Integer>> powerSet(List<Integer> list){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		if(list == null || list.size() == 0){
			return res;
		}
		
		res.add(new ArrayList<Integer>());
		for(int num : list){
			int size = res.size();
			
			for(int i = 0; i < size; i++){
				ArrayList<Integer> sub = new ArrayList<Integer>();
				sub.addAll(res.get(i));
				sub.add(num);
				res.add(sub);
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		
		System.out.println(PowerSet.powerSet(Arrays.asList(1,2,3)));
	}
}
