import java.util.*;
public class Q18_2 {

	
	public static int fibonacci(int n){
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
	
	public static int fibonacci2(int n){
		
		int f0 = 0;
		int f1 = 1;
		int f2 = f1 + f0;
		
		for(int i=2; i<=n; i++){
			
			f2 = f1 + f0;
			f0 = f1;
			f1 = f2;
		}
		return f2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci(" + n + ") = " + fibonacci(n)); 
		System.out.println("Fibonacci(" + n + ") = " + fibonacci2(n)); 
		
		
		


	}

}
