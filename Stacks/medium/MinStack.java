package Stacks.medium;

import java.util.ArrayList;

public class MinStack {

  private ArrayList<Integer> minStack;

  public MinStack() {
    minStack = new ArrayList<>();
  }

  public void push(int val) {
    minStack.add(val);
  }

  public void pop() {
    if (minStack.isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    minStack.remove(minStack.size() - 1);
  }

  public int top() {
    return minStack.get(minStack.size() - 1);
  }

  public int getMin() {
    int min = minStack.get(0);
    for (int i = 0; i < minStack.size(); i++) {
      if (minStack.get(i) <= min) {
        min = minStack.get(i);
      }
    }
    return min;
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();

    // Push elements into the stack
    minStack.push(3);
    minStack.push(5);
    minStack.push(2);
    minStack.push(1);

    // Test top method
    System.out.println("Top element: " + minStack.top()); // Expected output: 1

    // Test getMin method
    System.out.println("Minimum element: " + minStack.getMin()); // Expected output: 1

    // Pop elements from the stack
    minStack.pop();
    minStack.pop();

    // Test getMin method after popping
    System.out.println("Minimum element after popping: " + minStack.getMin()); // Expected output: 3
  }
}
