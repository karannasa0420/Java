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
}
