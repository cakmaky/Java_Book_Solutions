import java.util.Scanner;

public class Q7_30 {
	public static boolean isConsecutiveFour(int[] values){
		int count = 1;
		int value = values[0];
		boolean result = false;
		for(int i=1; i<values.length; i++){
			if(value == values[i]){
				count++;
			}
			else{
				count = 1;
				value = values[i];
			}
			if(count == 4){
				result = true;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of values:");
		int count = input.nextInt();
		
		int[] Array = new int[count];
		System.out.print("Enter the values: ");
		for(int i=0; i<Array.length; i++){
			Array[i] = input.nextInt(); 
		}
		
		if(isConsecutiveFour(Array)){
			System.out.println("The list has consecutive fours.");
		}
		else {
			System.out.println("The list has no consecutive fours.");
		}	
	}

}
