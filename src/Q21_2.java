import java.util.*;

public class Q21_2 {

	public static TreeSet<String> displayAscending(HashSet<String> set){
		
		
		TreeSet<String> sett = new TreeSet<>(set);
		return sett;		
	
	}
	
	public static void main(String[] args) {	
		
		String[] words ={"bir", "iki", "uc", "dort", "bes", "uc", "alti", "yedi", "bir", "dokuz"};
		
		HashSet<String> set = new HashSet<>(Arrays.asList(words));
		
		System.out.print(displayAscending(set));
		

	}

}
