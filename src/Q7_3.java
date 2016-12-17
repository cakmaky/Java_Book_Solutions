import java.util.Scanner;

public class Q7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[100];  // array is filled with all zeros after initialization
		System.out.print("Enter the integers between 1 and 100: ");
		number = input.nextInt();
		while (number != 0){
			array[number]++;
			number = input.nextInt();
		}
		for(int i=1; i<100; i++){
			if(array[i] != 0){
				if(array[i] == 1)
					System.out.println(i + " occours " + array[i] + " time");
				else
					System.out.println(i + " occours " + array[i] + " times");
			}
		}
		

	}

}
