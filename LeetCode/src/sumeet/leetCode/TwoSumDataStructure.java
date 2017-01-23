package sumeet.leetCode;

import java.util.HashMap;
import java.util.Map;

/*
 * Design a Data structure that method to insert integer values and 
 * and find method to check if there exists two values whose sum equal to 
 * the value to found
 */


public class TwoSumDataStructure {
	
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public void add(int value)
	{
		int count = map.containsKey(value) ? map.get(value) : 0;
		
		map.put(value, count+1);
	}
	
	public boolean findTarget(int target)
	{
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int n = entry.getKey(); // get the value from the map
			int y = target - n;     // subtract the value from the target
			if(y == n){             // if the result of subtraction and entry value are equal return true
				if(entry.getValue() >= 2){ // if the count of entry value is greater than 2, return true
					return true;
				}
			}else if(map.containsKey(y)){ //if the difference value is present in the map, return true.
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args)
	{
		TwoSumDataStructure val = new TwoSumDataStructure();
		val.add(2);
		val.add(4);
		val.add(5);
		val.add(8);
		System.out.println(val.findTarget(9));
	}
}
