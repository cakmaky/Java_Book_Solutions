import java.util.Scanner;

public class Q8_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int number = sc.nextInt();
		
		int[] Array = new int[9];
		
		for(int i=8; i>=0; i--){
			Array[i] = number % 2;
			number = (number -Array[i])/2;
		}
		
		//for(int i=0; i< Array.length; i++){
		//	System.out.print(Array[i]);
		//}
		
		char[][] Matrix = new char[3][3];
		System.out.println();
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(Array[3*i+j] == 0)
					Matrix[i][j] = 'H';
				else
					Matrix[i][j] = 'T';
				System.out.print(Matrix[i][j]);
	
			}
			System.out.println();
		}
		
		

	}

}
