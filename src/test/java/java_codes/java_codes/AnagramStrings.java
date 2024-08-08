package java_codes.java_codes;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {

		String s1="re1a2d";
		String s2="de21ar";

		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
		char temp;
		//without sorting function
		if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					temp=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=temp;
				}
			}
			
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]>arr2[j]) {
					temp=arr2[j];
					arr2[j]=arr2[i];
					arr2[i]=temp;
				}
			}
			
		}
//		System.out.println(arr1);
//		System.out.println(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("strings are anagram");
		}
		}else {
			System.out.println("strings are not anagram");
		}
		
		
//		if(Arrays.equals(arr1, arr2)) {
//			System.out.println("strings are anagram");
//			
//		}else {
//			System.out.println("strings are not anagram");
//		}


	}

}
