package sumeet.leetCode.string;

public class CountPrimes {
	
	public static int countPrimes(int n){
		if(n < 3){
			return 0;
		}
		
		boolean[] array = new boolean[n];
		
		int count = n / 2;
		for(int i = 3; i * i < n; i +=2){
			if(array[i]){
				continue;
			}
			
			for(int j = i; j < n; j += i * 2){
				if(!array[j]){
					--count;
					array[j] = true;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(CountPrimes.countPrimes(15));
	}
}
