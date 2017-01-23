package sumeet.leetCode;
import java.util.ArrayList;

public class Interval {
		
		public static ArrayList<String> findInterval(int[] array, int start, int end)
		{
			ArrayList<String> res = new ArrayList<String>();
			int prev = start -1;
			for(int i=0; i<=array.length; i++){
				int cur = (i == array.length) ? end + 1 : array[i];
				if(cur - prev >=2){
				res.add(getRanges(prev + 1, cur - 1));
				}
				prev = cur;
			}
			return res;
		}
		public static String getRanges(int start, int end){
			return (start == end) ? String.valueOf(start) : start + "->" + end ;
		}
		public static void main(String[] args)
		{
			int [] array = {54, 75, 80};
			ArrayList<String>  result = findInterval(array, 0, 99);
			System.out.println(result);
		}
}
