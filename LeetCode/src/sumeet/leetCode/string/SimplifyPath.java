package sumeet.leetCode.string;

public class SimplifyPath {

	public static String simplifiedPath(String s){
		
		StringBuilder path = new StringBuilder();
		String[] paths = s.split("/");
		int byPass = 0;
		System.out.println(paths.length);
		for(int i = paths.length - 1; i >= 0; i--){
			if(paths[i].equals("..")){
				byPass++;
			}
			else if(!paths[i].isEmpty() && !paths[i].equals(".")){
				if(byPass > 0){
					byPass--;
				}
				else {
					path.insert(0, "/" + paths[i]);
				}
			}
		}
		return s.length() == 0 ? "/" : path.toString();
	}
	
	public static void main(String[] args){
		
		System.out.println(SimplifyPath.simplifiedPath("/../ab/.../asd/.."));
	}
}
