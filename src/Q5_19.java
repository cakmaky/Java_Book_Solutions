import java.util.Scanner;
public class Q5_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height of shape:");
		int height = input.nextInt();
		
		for(int i= 1; i<=height; i++){
			for(int j=height - i; j>=0; j--){
				System.out.print("    ");	
			}
			for(int k=1; k<=i;k++){
				System.out.printf("%4d",(int)Math.pow(2, k-1) );
				
			}
			for(int t=i-1; t>=1;t--){
				System.out.printf("%4d",(int)Math.pow(2, t-1) );
			}
			System.out.println();	
		}
	}
}
