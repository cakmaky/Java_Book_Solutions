import java.util.Scanner;

public class Q3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 numbers to sort:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>b){
			a = a + b;
			b = a - b;
			a = a - b;	
		}
		if (b>c){
			b = b + c;
			c = b - c;
			b = b - c;
		}
		if(a>b){
			a = a + b;
			b = a - b;
			a = a - b;	
		}
		
		System.out.println("Non-decreasing order is :" + a + " " + b + " " + c);  
			

	}

}
