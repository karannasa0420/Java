package Arrays.easy;

public class ShuffleTheArray {

  public String[] ShuffleArray(String[] strs, int n) {
    String[] shuffedArray = new String[2 * n];
    for (int i = 0, j = 0; i < n; i++, j += 2) {
      shuffedArray[j] = strs[i];
      shuffedArray[j + 1] = strs[i + n];
    }
    return shuffedArray;
  }

  public void printShuffedArray(String[] array) {
    System.out.println("Shuffed array are:");
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      if (i > 0) System.out.print(", ");
      System.out.print(array[i]);
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    ShuffleTheArray solution = new ShuffleTheArray();
    String[] strs = { "x1", "x2", "x3", "y1", "y2", "y3" };
    String[] shuffedArray = solution.ShuffleArray(strs, 3);
    solution.printShuffedArray(shuffedArray);
  }
}

