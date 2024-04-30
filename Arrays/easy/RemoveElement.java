package Arrays.easy;

/*Problem statement
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 */
public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    int newindex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[newindex] = nums[i];
        newindex++;
      }
    }
    return newindex;
  }
  public void printOtherElements(int[] array, int length) {
    System.out.println("Other elements of the array are:");
    System.out.print("[");
    for (int i = 0; i < length; i++) {
      if (i > 0) System.out.print(", ");
      System.out.print(array[i]);
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    RemoveElement solution = new RemoveElement();
    int[] nums = { 1, 1, 2, 1, 3, 1, 5, 5 };
    int OtherLength = solution.removeElement(nums, 1);
    solution.printOtherElements(nums, OtherLength);
  }
}
