import java.util.*;

public class Q21_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		System.out.print("Enter numbers to count: ");
		int number = sc.nextInt();
		int max = 0;
		while(number != 0){	
			if(!map.containsKey(number)){
				map.put(number, 1);
			}
			else {
				int n = map.get(number);
				n++;
				max = n;
				map.put(number, n);
			}
			number = sc.nextInt();;
		}
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for( Map.Entry<Integer, Integer> entry  : entrySet){
			
			if(entry.getValue() == max){
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
			}	
		}
	}

}
