package greatLearning;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String bracketExpression = "([[{}]])";
		Scanner scn = new Scanner(System.in);
		String bracketExpression = scn.nextLine();
Boolean result;
result = BalancingBrackets.checkingBracketsBalanced(bracketExpression);

if(result)
	System.out.println("The entered string has Balanced Brackets");
else
	System.out.println("The entered string do not have Balanced Brackets");
	}

}
