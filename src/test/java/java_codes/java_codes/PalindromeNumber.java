package java_codes.java_codes;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=2112;
		int rev=0,rem=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(rev==temp) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}

	}

}
