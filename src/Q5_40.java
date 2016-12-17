
public class Q5_40 {

	public static void main(String[] args) {
		
		double number;
		int heads = 0;
		int tails = 0;
		for(int i= 1; i<= 1_000_000; i++){
			number = Math.random();
			if(number > 0.5)
				heads++;
			else 
				tails++;		
		}
		System.out.println("Heads: " + heads + "\nTails: " + tails);
	}
}
