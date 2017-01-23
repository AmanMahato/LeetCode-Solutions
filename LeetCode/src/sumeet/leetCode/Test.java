package sumeet.leetCode;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;int count = 0;
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				s += j * j;
				count++;
			}
		}
		System.out.println(count);
	}

}
