import java.util.*;

public class Q22_2 {
//abtycdjkefghi
// Bu kod yanlis. Bu inputla calismadi, cozumu biraz zor.	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		
		String result = "";
		String sub = "";
		
		for(int i=0; i<s.length(); i++){
			sub = s.charAt(i) + "";
			for(int j=i+1; j<s.length(); j++){
				
				if(s.charAt(j) > sub.charAt(sub.length()-1)){
					sub = sub + s.charAt(j);
				}
			
			}
			
			if(sub.length() > result.length()){
				
				result = sub;
			}
		
			
		}
		
		System.out.println("Result = " + result);
		
	}

}
