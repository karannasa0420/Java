public class DesignDynamicArray {

  private int[] array;
  private int size;
  private int capacity;

  // Constructor
  public DesignDynamicArray(int intialCapacity) {
    this.array = new int[intialCapacity];
    this.size = 0;
    this.capacity = intialCapacity;
  }

  // Add elements at the end of array
  public void add(int element) {
    if (size == capacity) {
      // ie. array is full, double its capacity
      resizeArray();
    }
    array[size] = element;
    size++;
  }

  // Add elements at the end of array
  public void pop() {
    if (size > 0) {
      size--;
    }
  }

  // Resize the array by doubling its capacity
  private void resizeArray() {
    int newCapacity = capacity * 2;
    int[] newArray = new int[newCapacity];
    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
    capacity = newCapacity;
  }

  // Get element at given index
  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of range");
    }
    return array[index];
  }

  // Set element at given index
  public void set(int index, int element) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of range");
    }
    array[index] = element;
  }

  // Remove element at given index
  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of range");
    }
    for (int i = index; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    size--;
  }

  // print array
  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    // Create a dynamic array with initial capacity of 5
    DesignDynamicArray dynamicArray = new DesignDynamicArray(5);

    // Add elements to the array
    dynamicArray.add(10);
    dynamicArray.add(20);
    dynamicArray.add(30);
    dynamicArray.add(40);
    dynamicArray.add(50);

    // Print the array
    System.out.println("Array after adding elements:");
    dynamicArray.print(); // Output: 10, 20, 30, 40, 50

    // Remove an element at index 2
    dynamicArray.remove(2);

    // Print the array after removal
    System.out.println("\nArray after removing element at index 2:");
    dynamicArray.print(); // Output: 10, 20, 40, 50

    // Set element at index 1 to 25
    dynamicArray.set(1, 25);

    // Print the array after setting element
    System.out.println("\nArray after setting element at index 1 to 25:");
    dynamicArray.print(); // Output: 10, 25, 40, 50

    // Pop an element from the end of the array
    dynamicArray.pop();

    // Print the array after popping
    System.out.println("\nArray after popping an element:");
    dynamicArray.print(); // Output: 10, 25, 40

    // Add an element after popping
    dynamicArray.add(60);

    // Print the array after adding element after popping
    System.out.println("\nArray after adding element after popping:");
    dynamicArray.print(); // Output: 10, 25, 40, 60
  }
}
