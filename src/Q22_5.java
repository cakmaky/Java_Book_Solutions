import java.util.*;

public class Q22_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers : ");
		int maxNumber = 0;
		int count = 0;
		int maxCount = 0;
		int n = sc.nextInt();
		int preNumber = n;
		while( n != 0){
			if(n == preNumber){
				count++;
				if(count > maxCount){
					maxCount = count;
					maxNumber = n;
				} 
				
			}
			else{
				count = 1;
				preNumber = n;
			}
			n = sc.nextInt();
		}
		
       System.out.print(maxNumber + " appears " + maxCount + " times.");
	}

}
