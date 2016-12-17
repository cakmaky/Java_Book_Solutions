import java.util.Scanner;

public class Q5_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isPrime = true;
		int counter = 0;
		for (int i=2; i<=1000; i++){
			for(int j=2; j<i; j++){
				if(i % j == 0){
					isPrime = false;
				}
			}
			if(isPrime){
				System.out.print(i + " ");
				counter++;
			}
			if(counter % 8 == 0 && counter != 0){
				System.out.println();
				counter = 0;
			}
			isPrime = true;
		}
	}
}
