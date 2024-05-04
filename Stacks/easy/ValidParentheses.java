package Stacks.easy;

import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i); // last string character
      if (c == '(' || c == '{' || c == '[') {
        stack.add(c);
      } else if (
        stack.isEmpty() ||
        (c == ')' && stack.pop() != '(') ||
        (c == '}' && stack.pop() != '{') ||
        (c == ']' && stack.pop() != '[')
      ) {
        return false;
      }
    }

    return stack.isEmpty();
  }



  
  public static void main(String[] args) {
    ValidParentheses ValidParentheses = new ValidParentheses();

    // Test cases
    String test1 = "()[]{}";
    String test2 = "()[{}";
    String test3 = "[{({)}}]";

    System.out.println("Test 1 result: " + ValidParentheses.isValid(test1));
    System.out.println("Test 2 result: " + ValidParentheses.isValid(test2));
    System.out.println("Test 3 result: " + ValidParentheses.isValid(test3));
  }
}
