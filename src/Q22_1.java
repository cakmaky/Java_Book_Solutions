import java.util.*;

public class Q22_1 {

	public static String maxSub(String s){

		String result= "";
		String sub =s.charAt(0) + "";

		for(int i=1; i<s.length();i++){
			char c = s.charAt(i); 

			if( c > s.charAt(i-1)){
				sub = sub.concat(c + "");
				if(sub.length() > result.length()){
					result = sub.toString() + "";
				}
			}
			else{

				sub = c + "";
			}	
		}
		return result;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string to find max consecutive substring : ");
		String s = sc.next();

		System.out.println("Max sub is " + maxSub(s));

	}

}
