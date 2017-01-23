package sumeet.leetCode.string;

public class LicenseFormat {

	 public static String licenseKeyFormatting(String S, int K) {
         if(S == null || S.length() < K ){
             return S;
         }
         String s = S.replaceAll("-","");
         if(s.length() == K){
             return s;
         }
         int i = 0;
         int j = s.length() - 1;
        // System.out.print(s);
         StringBuilder sb = new StringBuilder();
         while(j >= 0){
             int k = K;
             while(k > 0 && j >= 0){
                 sb.insert(0, Character.toUpperCase(s.charAt(j)));
                 System.out.println(sb.toString());
                 k--;
                 j--;
             }
             if(j >= 0){
                 sb.insert(0, '-');
         }
     }
     return sb.toString();
	}
	 
	public static void main(String[] args) {
		System.out.println(LicenseFormat.licenseKeyFormatting("2-4A0r7-4k", 1));
	}
}
