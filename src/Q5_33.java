
public class Q5_33 {
	public static void main(String[] args) {
		System.out.println("Number \t -> Divisors");
		int sum = 0;
		for(int i=1; i<10000; i++){
			for(int j=1; j<i; j++){
				if(i % j == 0){
					sum += j;
				}	
			}
			if(sum == i){
				System.out.print(i + "\t -> ");
			
			for(int j=1; j<i; j++){
				if(i % j == 0){
				System.out.print(j + " "); 
				}
			}
			System.out.println();
			}
			
			sum = 0;	
		}
	}
}
