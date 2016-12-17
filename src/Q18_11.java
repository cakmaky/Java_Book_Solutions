import java.util.*;
public class Q18_11 {

	public static int sumDigits(long n){

		if(n < 10){
			return (int)n;	
		}
		else {
			int digit = (int) (n % 10);
			return digit + sumDigits(n / 10);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter long number to sum digits: ");
		long number = sc.nextLong();

		System.out.println("Result = " + sumDigits(number));



	}

}
