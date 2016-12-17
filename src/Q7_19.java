import java.util.Scanner;

public class Q7_19 {

	public static boolean isSorted(int[] list){
		boolean isSorted = true;
		for(int i=0; i<list.length-1; i++){
			if(list[i] > list[i+1]){
				isSorted = false;
			}
		}
		return isSorted;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		boolean result;
		System.out.print("Enter list: "); 
		size = input.nextInt();
		int[] array = new int[size];
		
		for(int i=0; i<size; i++){
			array[i] = input.nextInt();	
		}
		result = isSorted(array);
		if(result)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}
}
