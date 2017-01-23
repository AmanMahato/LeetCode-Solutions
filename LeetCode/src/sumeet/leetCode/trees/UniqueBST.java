package sumeet.leetCode.trees;

public class UniqueBST {
	
	public static int numberOfUniqueBST(int n){
		if(n < 0){
			return 0;
		}
		
		int[] num = new int[n+1];
        num[0]=1;
        num[1]=1;
        
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                num[i] += num[j-1]*num[i-j];
            }
        }
        return num[n];
	}
	
	public static void main(String[] args){
		
		System.out.println(UniqueBST.numberOfUniqueBST(4));
	}
}
