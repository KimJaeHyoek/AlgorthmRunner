package palindromeword;

import java.util.Scanner;

class Main {
	public String solution(String str) {
		String answer ="NO";
		String tmp=new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="Yes";
		return answer;
			
					
	}
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		
		
		
	
}

}
