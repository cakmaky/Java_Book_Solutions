import java.util.*;
public class Q11_13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Enter 10 numbers:");
		Integer number;
		for(int i=0; i<10;i++){
			
			number = (Integer)sc.nextInt();
			if(!list.contains(number)){
				list.add(number);
			}
		}
		System.out.println("The distinct integers are: " + list.toString() ); 
		
}
}
