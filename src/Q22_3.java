import java.util.*;
public class Q22_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string 1: ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter string 2: ");
		String s2 = sc.nextLine();
		
		boolean result = true;
		int index = -1;
		for(int i=0; i<s1.length()-s2.length(); i++){
			result = true;
			for(int j=0; j<s2.length(); j++){
				if(s1.charAt(i+j) != s2.charAt(j)){	
					result = false;
				}	
			}
			if(result == true){
				index = i;
			}
		}
		
		System.out.println("Index is " + index); 
	
	}

}
