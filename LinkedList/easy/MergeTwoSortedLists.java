package LinkedList.easy;

public class MergeTwoSortedLists {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }

    if (list1 != null) {
      current.next = list1;
    } else {
      current.next = list2;
    }

    return dummy.next;
  }

  public static void main(String[] args) {
    // Test cases
    // First sorted list: 1 -> 3 -> 5
    MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(1);
    list1.next = new MergeTwoSortedLists.ListNode(3);
    list1.next.next = new MergeTwoSortedLists.ListNode(5);

    // Second sorted list: 2 -> 4 -> 6
    MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(2);
    list2.next = new MergeTwoSortedLists.ListNode(4);
    list2.next.next = new MergeTwoSortedLists.ListNode(6);

    // Merge the two lists
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    MergeTwoSortedLists.ListNode mergedList = mergeTwoSortedLists.mergeTwoLists(
      list1,
      list2
    );

    // Print the merged list
    System.out.println("Merged List:");
    while (mergedList != null) {
      System.out.print(mergedList.val + " ");
      mergedList = mergedList.next;
    }
  }
}
