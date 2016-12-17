import java.util.*;
public class Q18_21 {

	public static String dec2Bin(int value){
		int digit = value % 2;
		if(value < 1){
			return "";
		}
		return dec2Bin(value/2)+ Integer.toString(digit);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter decimal to convert binary: ");
		int number = sc.nextInt();

		System.out.println("Binary number is " + dec2Bin(number));


	}

}
