import java.util.Scanner;

public class Q7_18 {

	public static void bubleSort(double[] array){
		double temp;
		for(int i=0; i< array.length; i++){
			for(int j=0; j< array.length-1; j++){
				if(array[j] < array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}	
			}
		}	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.print("Please enter 10 double numbers to sort: ");
		for(int i=0; i<10; i++){
			array[i] = input.nextDouble();
		}
		
		bubleSort(array);
		
		System.out.print("Sorted array is: ");
		for(double d : array){
			System.out.print(d + " "); 
		}
	}
}
