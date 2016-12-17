import java.util.Scanner;

public class Q5_51_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int index1=0, index2=0;
		int length = 0;
		System.out.print("Enter the first string: "); 
		String s1 = input.nextLine();
		
		System.out.print("Enter the second string: "); 
		String s2 = input.nextLine();
		String common = "";
		String greatest= "";
		System.out.println("common strings are: ");
		for(int i=0; i<s1.length(); i++){
			for(int j=0;j<s2.length(); j++){
				index1=i;
				index2=j;
				while(s1.charAt(index1) == s2.charAt(index2)){
					common += s1.charAt(index1);
					if(index1 != s1.length() -1 && index2 != s2.length() -1){
					index1++;
					index2++;
					}
					else{
						break;
					}
				}
				if(!common.equals("") && common.length()>length){
				System.out.println(common);	
				greatest = common;	
				length = common.length();
				}
				common="";
			}
		}
		System.out.println("greatest is " + greatest);
		
	}
	
}
