import java.util.Scanner;

public class Q5_17 {

	public static void main(String[] args) {
		// 9 a kadar dogru calisiyor, 9-15 arasi 1 tane kaydiriyor
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of lines:");
		int lines = input.nextInt();
	    int m=0;
		for(int i=1 ; i<= lines; i++){
			System.out.print("               ");
			for( int j= (lines -i) ; j>0; j--){
				System.out.print("  ");
			}
			
			for (int k= i; k>=1; k--){
				System.out.print(k + " ");
			}
			for(int t=2; t<=i; t++){
				System.out.print(t + " "); 
			}
			System.out.println();
			
		}

	}

}
