import java.util.Scanner;

public class Q6_3 {
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number){
		int digit;
		int reverse = 0;
		while(number != 0){
			
			digit = number % 10; 
			reverse = reverse*10 + digit;
			number /= 10;
		}
		return reverse;	
	}
	// Return true if number is a palindrome
	public static boolean isPalindrome(int number){
		if(number == reverse(number))
			return true;
		else
			return false;	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number to check if it is palindrome: ");
		int number = input.nextInt();
		if(isPalindrome(number))
			System.out.println("Number is a palindrome");
		else
			System.out.println("Number is not a palindrome");
	}
}
