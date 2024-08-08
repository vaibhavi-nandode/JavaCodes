package java_codes.java_codes;

public class ReverseOfString {

	public static void main(String[] args) {

		String s="Today is friday";
		
		String arr[]=s.split(" ");
		String rev="";
		for(int i=0;i<arr.length;i++) {
			
			for(int j=arr[i].length()-1;j>=0;j--) {
				
				rev= rev+arr[i].charAt(j);
			}
			
			rev=rev+" "; 
		}
 
		System.out.println(rev);
	}

}
