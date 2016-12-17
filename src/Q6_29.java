
public class Q6_29 {
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
		int smallP = 2, largeP = 3;
		for(int i=3; i<1000; i++){
			if(isPrime(i)){
				smallP = largeP;
				largeP = i;
				if(largeP - smallP == 2){
					System.out.println("(" + smallP + "," + largeP + ")");
				}	
			}
		}
	}

}
