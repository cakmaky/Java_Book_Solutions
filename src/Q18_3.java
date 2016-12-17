import java.util.*;
public class Q18_3 {
	public static int gcd(int m, int n){
		int div = 1;
		
		for(int i= 2; i<=m && i<=n; i++){
			if(m % i == 0 && n % i == 0){
				div =i;
			}
		}
		return div;
	}
	
	public static int gcd2(int m, int n){
		if(m % n == 0){
			return n;
		}
		else {
			return gcd2(n, m % n);
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers to find GCD :");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("gcd(" + m + ", " + n + ") = " + gcd(m , n)); 
		System.out.println("gcd(" + m + ", " + n + ") = " + gcd2(m , n)); 
		
		
		

	}

}
