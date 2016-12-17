import java.util.Scanner;

public class Q5_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the height of shape: ");
		int height = input.nextInt();
		
		System.out.println("\nThis is the first shape");
		for(int i=1; i<=height; i++){
			for(int j= 1; j<=i; j++){
				System.out.print(j + " "); 	
			}
			System.out.println();	
		}
		
		System.out.println("\nThis is the second shape");
		for(int i=height;i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(j + " "); 
			}
			System.out.println();
		}
		
		System.out.println("\nThis is the third shape");
		for(int i=1; i<=height; i++){
			for(int j= height - i; j>=1; j--){
				System.out.print("  ");
 			}
			for(int k=i; k>= 1; k--){
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nThis is the fourth shape");
		for(int i=height; i>=1; i--){
			for(int j=i;j<height; j++){
				System.out.print("  ");	
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+ " ");
			}
			System.out.println();
		}
		
		
	}

}
