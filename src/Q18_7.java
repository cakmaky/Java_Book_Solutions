import java.util.Scanner;
public class Q18_7 {
	
	public static int count = 0;  // counts how many times fibonacci method called
	
	public static int fibonacci(int n){
		
		count++;
		if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}	
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci(" + n + ") = " + fibonacci(n)); 
		System.out.println("Fibonnacci method called " + count + " times.");
		
		
		
		


	}

}

