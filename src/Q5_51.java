import java.util.Scanner;

public class Q5_51 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: "); 
		String s1 = input.nextLine();
		
		System.out.print("Enter the second string: "); 
		String s2 = input.nextLine();
		String common ="";
		if(s1.charAt(0) != s2.charAt(0)){
			System.out.println("They have no common prefix");
		}
		else {
		for(int i=0; i< s1.length(); i++){
			if(s1.charAt(i) == s2.charAt(i)){
				common += s1.charAt(i);
			}
			else
				break;	
		}
		System.out.println("The common prefix is " + common);
		}
	}
}
