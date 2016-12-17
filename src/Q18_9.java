
import java.util.Scanner;
public class Q18_9 {

	public static String reverseDisplay(String value){
		if(value.equals("")){
			return "";
		}
		else  {
			return value.charAt(value.length()-1) + reverseDisplay(value.substring(0, value.length()-1));
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to display reverse: ");
		String value = sc.nextLine();
		
		
		String result = reverseDisplay(value);
		System.out.println(result);
	}

}
