import java.util.*;

// change Character to int --> Integer.parseInt(stack.pop().toString());
//change int to Character --> new Character(Integer.toString(result).charAt(0)); 


public class Q20_14 {
	public static Character evaluate(String exp){
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<exp.length(); i++){
			char c = exp.charAt(i);
			if(c >= '0' && c <= '9'){
				stack.push(new Character(c));
			}
			else{
				
				int n2 =Integer.parseInt(stack.pop().toString());
				int n1 =Integer.parseInt(stack.pop().toString());
				
				int result = 0;
				
				switch(c){
				case '+':
					result = n1 + n2;break;
				case '-':
					result = n1 - n2;break;
				case '*':
					result = n1 * n2;break;
				case '/':
					result = n1 / n2;break;
				default: break;
				}
				Character ch = new Character(Integer.toString(result).charAt(0)); 
				stack.push(ch);
			}	
		}
		return stack.peek();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter expression to evaluate: ");
		String exp = sc.nextLine();
		
		System.out.println("Result = " + Q20_14.evaluate(exp).toString());
		

	}

}
