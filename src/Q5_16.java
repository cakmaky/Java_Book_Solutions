import java.util.Scanner;

public class Q5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer number to get factors: ");
		int number = input.nextInt();
		int factor = 2;
		while(factor <= number){
			if(number % factor == 0){
				System.out.print(factor + " ");
				  number = number / factor;
			}
			else {
				factor++;
			}
		}	

	}

}
