import java.util.Scanner;

public class Q18_25 {

	
	public static void displayPermutation(String s){
		String s1 = "";
		String s2 = s.substring(0);
		displayPermutation(s1, s2);	
	}
	public static void displayPermutation(String s1, String s2){
		
		
		if(s2.length() > 0){
		for(int i=0; i<s2.length();i++){
		 String	st1 =s1 + s2.charAt(i);
		 String	st2 = s2.substring(0,i) + s2.substring(i+1);
		 
		 displayPermutation(st1,st2);
			
		}
		
		}
		else {
			System.out.println(s1);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		
		
		displayPermutation(s);
		
		
		

	}

}
