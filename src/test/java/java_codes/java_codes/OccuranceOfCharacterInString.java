package java_codes.java_codes;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {

		String str="vaibhavi";
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer> ();
		for(int i=0;i<str.length();i++) {
			Integer count=hm.get(str.charAt(i));
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), count+1);
			}else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
//		for(Map.Entry<Character,Integer> m:hm.entrySet()) {
//			if(m.getValue()>1) {
//				System.out.println(m.getKey()+" - "+m.getValue());
//			}
//		}

	}

}
