package Arrays.easy;

public class ConcatenationofArray {

  public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2 * n];
    System.arraycopy(nums, 0, ans, 0, n);
    System.arraycopy(nums, 0, ans, n, n);
    return ans;
  }

  public void printArray(int[] array) {
    System.out.println("array:");
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      if (i > 0) System.out.print(", ");
      System.out.print(array[i]);
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    ConcatenationofArray solution = new ConcatenationofArray();
    int[] nums = { 1, 2, 1 };
    int[] ans = solution.getConcatenation(nums);
    solution.printArray(ans);
  }
}
