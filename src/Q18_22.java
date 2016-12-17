import java.util.Scanner;

public class Q18_22 {
	public static String dec2Hex(int value){
		int digit = value % 16;
		String s = Integer.toString(digit);
		if(s.length() == 2){
			switch(s){
			case "10":
				s= "A"; break;
			case "11":
				s="B"; break;
			case "12":
				s= "C"; break;
			case "13":
				s= "D"; break;
			case "14":
				s= "E"; break;
			case "15":
				s= "F"; break;
			}	
		}
		if(value < 16){
			return s;
		}
		else {
			return dec2Hex(value/16) + s;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter decimal to convert Hex: ");
		int number = sc.nextInt();

		System.out.println("Hex number is " + dec2Hex(number));

	}

}
