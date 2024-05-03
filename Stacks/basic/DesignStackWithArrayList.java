package Stacks.basic;

import java.util.ArrayList;

public class DesignStackWithArrayList {

  private ArrayList<Integer> stack;

  public DesignStackWithArrayList() {
    stack = new ArrayList<>();
  }

  public void push(int n) {
    stack.add(n);
  }

  public int pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    return stack.remove(stack.size() - 1);
  }

  public int size() {
    return stack.size();
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public void print() {
    for (int i = stack.size() - 1; i >= 0; i--) {
      System.out.println(stack.get(i));
    }
  }

  public static void main(String[] args) {
    DesignStackWithArrayList stack = new DesignStackWithArrayList();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("Stack size: " + stack.size());
    System.out.println("Popped element: " + stack.pop());
    System.out.println("Stack size after pop: " + stack.size());
    System.out.println("Is stack empty? " + stack.isEmpty());
    stack.print();
  }
}
