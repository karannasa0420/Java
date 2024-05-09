package Stacks.easy;

import java.util.Stack;

public class BaseballGame {

  public int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < operations.length; i++) {
      if (operations[i].equals("C")) {
        if (!stack.isEmpty()) {
          stack.remove(stack.size() - 1);
        }
      } else if (operations[i].equals("D")) {
        int lastElement = 2 * stack.get(stack.size() - 1);
        stack.add(lastElement);
      } else if (operations[i].equals("+")) {
        int sumElement =
          stack.get(stack.size() - 2) + stack.get(stack.size() - 1);
        stack.add(sumElement);
      } else {
        int strtoInt = Integer.parseInt(operations[i]);
        stack.add(strtoInt);
      }
    }
    int finalAnswer = 0;
    for (int i = stack.size() - 1; i >= 0; i--) {
      finalAnswer = finalAnswer + stack.get(i);
    }
    return finalAnswer;
  }

  public static void main(String[] args) {
    BaseballGame BaseballGame = new BaseballGame();

    // Test cases
    String[] test1 = { "5", "2", "C", "D", "+" }; // Expected output: 30
    String[] test2 = { "5", "-2", "4", "C", "D", "9", "+", "+" }; // Expected output: 27

    System.out.println("Test 1 result is: " + BaseballGame.calPoints(test1));
    System.out.println("Test 2 result is: " + BaseballGame.calPoints(test2));
  }
}
