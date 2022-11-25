package com.practice;

import java.util.Stack;

 public class Valid_Parentheses {
    public static boolean isValid(String s) {

        Stack<Character> stackOb = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
            	//push() to insert an element into the stack
                stackOb.push(c);
            }
            // peek() = fetch the first element of the Stack or the element present at the top of the Stack
            else if (c == ')' && !stackOb.isEmpty() && stackOb.peek() == '(') {
            	//pop() to remove an element from the stack.
                stackOb.pop();
            } else if (c == '}' && !stackOb.isEmpty() && stackOb.peek() == '{') {
                stackOb.pop();
            } else if (c == ']' && !stackOb.isEmpty() && stackOb.peek() == '[') {
                stackOb.pop();
            }
            else {
                return false;
            }
        }
        // isEmpty() method checks if the input string is empty or not.
        //Note that here empty means the number of characters contained in a string 
        return stackOb.isEmpty();
    }

    public static void main(String[] args) {

        String s ="()()";
        //Indicates whether an instantiated Session object is still valid.
        boolean b= isValid(s);
        System.out.println(b);

    }
}
					

			
		


		


