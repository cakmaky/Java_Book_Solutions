import java.util.Scanner;

public class Q7_34 {

	public static String sort(String s){
		char[] Array = s.toCharArray();
		char dummy;
		for(int i=0; i< Array.length; i++){
			for(int j=i+1; j< Array.length; j++){
				 if(Array[i] > Array[j]){
					dummy = Array[i];
					Array[i] = Array[j];
					Array[j] = dummy;
				}
			}	
		}
		String result = "";
		for(int i=0; i< Array.length; i++){
			result += Array[i];	
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to sort characters:");
		String s = sc.nextLine();
		s = sort(s);
		System.out.println(s);
	}
}
