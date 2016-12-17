import java.util.Scanner;

public class Q5_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string to reverse : ");
		String s = input.nextLine();
		
		String s2 = "";
		
		for(int i=s.length()-1; i>=0; i--){
			s2 += s.charAt(i); 
		}
		
		System.out.println("The reversed string is    :" + s2);
		

	}

}
