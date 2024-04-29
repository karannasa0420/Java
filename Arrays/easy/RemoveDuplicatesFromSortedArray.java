package Arrays.easy;

public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int uniqueIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[uniqueIndex]) {
        uniqueIndex++;
        nums[uniqueIndex] = nums[i];
      }
    }
    return uniqueIndex + 1;
  }

  public void printUniqueElements(int[] array, int length) {
    System.out.println("Unique elements of the array are:");
    System.out.print("[");
    for (int i = 0; i < length; i++) {
      if (i > 0) System.out.print(", ");
      System.out.print(array[i]);
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
    int[] nums = { 1, 1, 2, 2, 3, 4, 5, 5 };
    int uniqueLength = solution.removeDuplicates(nums);
    solution.printUniqueElements(nums, uniqueLength);
  }
}
