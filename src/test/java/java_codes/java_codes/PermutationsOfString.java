package java_codes.java_codes;

public class PermutationsOfString {

	public static void main(String[] args) {
		String s="ABC";
		permutations(s,"");
		

	}
	public static void permutations(String str,String ans) {
		
		if(str.length()==0) {
			System.out.println(ans+"");
		}
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			String ros=str.substring(0,i)+str.substring(i+1);
			
			permutations(ros,ans+ch);
		}
		
	}

}
