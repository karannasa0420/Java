package Stacks.basic;

public class DesignStack {

  private int[] stack;
  private int size;
  private int capacity;

  // Constructor
  public DesignStack(int initialCapacity) {
    this.stack = new int[initialCapacity];
    this.size = 0;
    this.capacity = initialCapacity;
  }

  public void push(int element) {
    if (capacity == size) {
      // ie Stack is full
      resizeStack();
    }
    stack[size++] = element;
  }

  public int pop() {
    if (size == 0) {
      throw new IllegalStateException("Stack is empty");
    }
    return stack[--size];
  }

  public int size() {
    return size;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(stack[i]);
    }
  }

  private void resizeStack() {
    int[] newStack = new int[2 * capacity];
    System.arraycopy(stack, 0, newStack, 0, size);
    stack = newStack;
    capacity = 2 * capacity;
  }
}
