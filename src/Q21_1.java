import java.util.*;

public class Q21_1 {

	public static void main(String[] args) {
		
		String[] Array1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		String[] Array2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
		
		Set<String> set1 = new LinkedHashSet<>(Arrays.asList(Array1));
		Set<String> set2 = new LinkedHashSet<>(Arrays.asList(Array2));
		
		//set1.addAll(set2);  // union of two sets
		//System.out.println("Union is " + set1);
		
		//set1.retainAll(set2);  // intersection of two sets
		
		
		//System.out.println("intersection is" + set1);
		
		set1.removeAll(set2); // difference of two sets. difference of set1 then set2
		System.out.println("Difference s1/s2 " + set1);
		
		//System.out.println("set2 is" + set2);
		
		

	}

}
