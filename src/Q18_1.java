import java.math.BigInteger;
import java.util.*;
public class Q18_1 {
	public static BigInteger factorial(BigInteger n){
		if(n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter big number: ");
		BigInteger number= sc.nextBigInteger();
		
		System.out.print(number + "! = "+ factorial(number));
		
		

	}

}
