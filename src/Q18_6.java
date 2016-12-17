import java.util.*;
public class Q18_6 {

	public static double sum(double n){
		if(n == 0){
			return 0;
		}	
		else {
			return n / (n + 1) + sum(n-1);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=10; i++){
			System.out.println("m(" + i + ") = " + sum((double)i)); 

	}

}
}
