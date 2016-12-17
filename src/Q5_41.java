import java.util.Scanner;

public class Q5_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int count = 1;
		System.out.print("Enter numbers: ");
		number = input.nextInt();
		int max = number;
		while(number != 0){
			number = input.nextInt();
			if(number < max){
				continue;
			}
			else if(number == max){
				count++;
			}
			else{
				max = number;
				count = 1;
			}	
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurence count of the largest number is " + count);
	}
}
