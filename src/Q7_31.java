import java.util.Scanner;

public class Q7_31 {
	public static int[] merge(int[] list1, int[] list2){
		int[] Array = new int[list1.length + list2.length];
		int index1 = 0;
		int index2 = 0;
		for(int i=0; i<Array.length; i++){
			if(index1 == list1.length){
				Array[i] = list2[index2];
				index2++;
				continue;
			}
			if(index2 == list2.length){
				Array[i] = list1[index1];
				index1++;
				continue;
			}
			if(list1[index1] < list2[index2]){
				Array[i] = list1[index1];
				index1++;	
			}
			else {
				Array[i] = list2[index2];
				index2++;
			}
		}
		return Array;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter list 1: ");
		int size = sc.nextInt();
		int[] Array1 = new int[size];
		
		for(int i=0; i< Array1.length; i++){
			Array1[i] = sc.nextInt();
		}
		
		System.out.print("Enter list 2: ");
		int size2 = sc.nextInt();
		int[] Array2 = new int[size2];
		
		for(int i=0; i< Array2.length; i++){
			Array2[i] = sc.nextInt();
		}
		
		int[] Array3 = new int[size + size2]; 
		Array3 = merge(Array1, Array2);
		
		System.out.print("The merged list is ");
		
		for(int i=0; i< Array3.length; i++){
			System.out.print( Array3[i] + " ");
		}
	}

}
