import java.util.Scanner;

public class Q7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int count = 0;
		boolean appear = false;
		int[] array = new int[10];
		System.out.print("Enter 10 numbers: ");
		number= input.nextInt();
		for(int j=1; j<10; j++){
			for(int i=0; i<count; i++){
				if(array[i] == number){
					appear = true;
					break;
				}
			}
			if(!appear){
				array[count] = number;
				count++;
			}
			appear = false;
			number= input.nextInt();
		}
		System.out.println("The number of distinct number is " + count);
		System.out.print("The distinct numbers are: ");
		for(int i=0; i<count; i++){
			System.out.print(array[i] + " ");
		}
	}
}
