import java.util.*;
public class Q18_8 {

	public static int reverseDisplay(int value){
		if(value == 0){
			return 0;
		}
		else {
			System.out.print(value % 10);
			return reverseDisplay(value / 10);
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to display reverse: ");
		int value = sc.nextInt();
		
		
		reverseDisplay(value);
	
	}

}
