import java.util.*;
public class Q8_9 {

	public static void displayTheBoard(char[][] Array){
		for(int i=0; i<3; i++){
			System.out.println("-------");
			for(int j=0; j<3 ; j++){
				System.out.print("|");
				System.out.print(Array[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("-------");
	}
	public static boolean checkBoard(char[][] Array){
		boolean full = false;
		for(int i=0; i<3; i++){
			if(Array[i][0] == Array[i][1] && Array[i][1] == Array[i][2] && Array[i][2] != ' '){
				System.out.println(Array[i][2] + " wins");
				full = true;
			} 
			if(Array[0][i] == Array[1][i] && Array[1][i] == Array[2][i] && Array[2][i] != ' '){
				System.out.println(Array[2][i] + " wins");
				full = true;
			}
			}
			if(Array[0][0] == Array[1][1] && Array[1][1] == Array[2][2] && Array[2][2] != ' '){
				System.out.println(Array[2][2] + " wins");
				full = true;
			}
			if(Array[0][2] == Array[1][1] && Array[1][1] == Array[2][0] && Array[2][0] != ' '){
				System.out.println(Array[2][0] + " wins");
				full = true;
			}
			return full;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] Array = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

		System.out.println("Welcome to tic tac to game");
		boolean full = false;
		char[] PlayerArray = {'X','O'};
		int turn = 0;

		while(!full){
			displayTheBoard(Array);
			turn %= 2;
			System.out.print("Enter a row (0, 1, or 2) for player " + PlayerArray[turn] + " :");
			int row = sc.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player " + PlayerArray[turn] + " :");
			int column = sc.nextInt();

			if(Array[row][column] == ' '){
				Array[row][column] = PlayerArray[turn];
				turn++;
			}
			else {
				System.out.println("Invalid choice. Try again.");
			}
			full = true;
			for(int i=0; i<3; i++){
				for(int j=0; j<3 ; j++){
					if(Array[i][j] == ' '){
						full = false;
					}
				}
			}
			if(full){
				System.out.println("Nobody wins.");
			}
			full = checkBoard(Array);
		}
		displayTheBoard(Array);
		System.out.println("Game over!!!");	
	}
}
