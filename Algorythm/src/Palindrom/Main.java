package Palindrom;

import java.util.Scanner;

class Main {
	public String solution(String s) {
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]","");
		System.out.println(s);
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		
		
		
		return answer;
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
				
	}
}
