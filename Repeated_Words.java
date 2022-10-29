package com.seleniumtesting;

public class Repeated_Words {

	public static void main(String[] args) {
		
		String word="karthika";
		
		for (int i=0;i<word.length();i++) {
		
			char ch=word.charAt(i);
			
			boolean repeat= false;
			for (int j = i=1; j < word.length(); j++) {
			if (ch==word.charAt(j)) {
				repeat=true;
				break;
			}	
			}
		if ( repeat==false) {
			System.out.println(ch+"is not repeated");
			break;
		}
	}

}
}