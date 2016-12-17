
public class Q6_27 {
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
	public static boolean isPalindrome(int number){
		if(number == reverse(number))
			return true;
		else
			return false;	
	}
	public static boolean isPrime(int number){
		boolean isPrime = true;
		if(number < 2)
			isPrime = false;
		for(int i=2; i< number; i++){
			if(number % i == 0){
				isPrime = false;
			}	
		}
		return isPrime;
	}
	public static void main(String[] args) {	
		int number = 1;
		int count = 0;
		while(count < 100){
			if(isPrime(number) && isPrime(reverse(number)) && !isPalindrome(number)){
				System.out.print(number + " "); 
				count++;
				if(count % 10 == 0){
					System.out.println();
				}
			}
			number++;
		}
	}
}







