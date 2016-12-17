import java.util.Scanner;

public class Q7_35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = {"write", "california", "program", "computer", "java"};
		
		String choice = "y";
		while(choice.equals("y")){

		String word = words[(int) (Math.random() * (words.length))];
	
		char[] Array1 = word.toCharArray();
		char[] Array2 = new char[word.length()];

		for(int i=0; i<Array2.length; i++){
			Array2[i] = '*';
		}
        int missed = 0;
		boolean goon = true;
		while(goon){
			System.out.print("(Guess) Enter a letter in word ");
			for(int i=0; i<Array2.length; i++){
				System.out.print( Array2[i]);
			}
			System.out.print(">");
			char ch = sc.nextLine().charAt(0);
			boolean check = false;

			for(int i=0; i<Array1.length; i++){
				if(Array2[i] == ch){
					System.out.println(ch + " is already in the world"); 
					check = true;
					break;
				}
				else if(Array1[i] == ch){
					Array2[i] = Array1[i];
					check = true;
				}	
			}
			if(check == false){
				System.out.println(ch + " is not in the world"); 
				missed++;
			}
			goon = false;
			for(int i=0; i<Array2.length; i++){
				if(Array2[i] =='*' ){
					goon = true;
				}
			}

		}
		System.out.println("The word is " + word + ". You missed " + missed + " time.");
		System.out.println("Do you want to guess another word? Enter y or n:");
		choice = sc.nextLine();
		}	
		System.out.println("Program terminated.!!!");
	}

}
