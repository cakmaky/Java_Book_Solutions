
public class Q6_28 {
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
		System.out.println("p\t\t2^p-1"); 
		int mersenne;
		for(int p=2; p<=31; p++){
			mersenne =(int)(Math.pow(2, p) - 1);
			if(isPrime(mersenne)){
				System.out.println(p + "\t\t" + mersenne);
				
			}	
		}
	}
}
