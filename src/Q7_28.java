import java.util.Scanner;

public class Q7_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] Array = new int[10];
		System.out.println("Enter 10 integers to get all combinations: ");
		for(int i=0; i<Array.length; i++){
			Array[i] = input.nextInt();	
		}
		
		for(int i=0; i<Array.length; i++){
			for(int j=i; j<Array.length; j++){
				System.out.println("(" + Array[i] + "," + Array[j] + ")"); 
				
			}
		}
	}
}
