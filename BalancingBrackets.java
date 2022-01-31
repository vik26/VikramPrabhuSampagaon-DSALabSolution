package greatLearning;

import java.util.Stack;

public class BalancingBrackets {
	public static boolean checkingBracketsBalanced (String bracketExpression ) {

	Stack <Character> stack = new Stack<Character>();
	for(int i=0; i<bracketExpression.length();i++) {
		char character = bracketExpression.charAt(i);
		
		if(character == '(' || character == '[' || character == '{') {
			stack.push(character);
			continue;
		}
		if(stack.isEmpty())
			return false;
		
		char c = stack.pop();
		
		switch(character) {
		case'}':
			if (c!='{')
				return false;
			break;
		case')':
			if (c!='(')
				return false;
			break;
		case']':
			if (c!='[')
				return false;
			break;
			default: return false;
		}
	}
	return(stack.isEmpty());
	}

}
