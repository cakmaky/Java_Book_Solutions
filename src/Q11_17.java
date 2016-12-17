import java.util.*;
public class Q11_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();    ;
		
		System.out.print("Enter an integer m: ");
		Integer m= sc.nextInt();
		int n=1;
		int i = 2;
		while(m != 1){
			
			if(m % i == 0){
				list.add(i);
				m /= i;
				
			}
			else {
				i++;
			}
			
		}

		for(Integer number: list){
			if(list2.contains(number)){
				list2.remove(number);
			}
			else{
				list2.add(number);
			}	
		}
		n = 1;	
		for(Integer k: list2){
				n*=k;
		}
			
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
	}

}
