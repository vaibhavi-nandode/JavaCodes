package java_codes.java_codes;

public class VowelsAndConsonents {

	public static void main(String[] args) {
		String s="this is awesome1234 websi!@#$";
		System.out.println("length- "+s.length());
		int vowels = 0,consonants = 0,digits=0,spaces=0,specialchars=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println("vowel- "+s.charAt(i));
				++vowels;
			}else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				System.out.println("consonents- "+s.charAt(i));
				++consonants;
			}else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				System.out.println("digits- "+s.charAt(i));
				++digits;
			}else if(s.charAt(i)==' ') {
				System.out.println("spaces- "+s.charAt(i));
				++spaces;
			}else {
				System.out.println("special char- "+s.charAt(i));
				++specialchars;
			}
		}
		
		System.out.println("vowels- "+vowels+" consonants- "+consonants+" digits- "+digits+" spaces- "+spaces
				+" specialchars- "+specialchars);

	}

}
