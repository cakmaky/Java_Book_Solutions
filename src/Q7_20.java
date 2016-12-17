import java.util.Scanner;

public class Q7_20 {

	public static void selectionSort(double[] list){
		double temp;
		int largestI;
		int placeI= list.length -1;
		
		for(int j=0; j< list.length; j++){
		largestI = 0;	
		for(int i=0; i<=placeI; i++){
			if(list[i] > list[largestI]){
				largestI = i;	
			}
		}
		temp = list[largestI];
		list[largestI] = list[placeI];
		list[placeI] = temp;
		placeI--;
		}	
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.print("Please enter 10 double numbers to sort: ");
		for(int i=0; i<10; i++){
			array[i] = input.nextDouble();
		}
		
		selectionSort(array);
		
		System.out.print("Sorted array is: ");
		for(double d : array){
			System.out.print(d + " "); 
		}

	}

}
