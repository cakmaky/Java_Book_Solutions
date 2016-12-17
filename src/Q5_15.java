
public class Q5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i='!'; i<= '~'; i++){
			System.out.print((char)i + " ");
			count++;
			if(count % 10 == 0){
				System.out.println();
			}	
		}
	}
}
