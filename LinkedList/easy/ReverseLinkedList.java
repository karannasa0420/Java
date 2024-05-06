package LinkedList.easy;

public class ReverseLinkedList {

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

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode prev = null;
    ListNode current = head;
    ListNode nextnode;
    while (current != null) {
      nextnode = current.next;
      current.next = prev;
      prev = current;
      current = nextnode;
    }
    return prev;
  }

  public static void main(String[] args) {
    // Test cases
    ReverseLinkedList solution = new ReverseLinkedList();

    // Test case 1: Empty list
    ListNode head1 = null;
    ListNode reversedHead1 = solution.reverseList(head1);
    printList(reversedHead1);

    // Test case 2: Single node
    ListNode head2 = new ListNode(1);
    ListNode reversedHead2 = solution.reverseList(head2);
    printList(reversedHead2);

    // Test case 3: Multiple nodes
    ListNode head3 = new ListNode(
      1,
      new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))
    );
    ListNode reversedHead3 = solution.reverseList(head3);
    printList(reversedHead3);
  }

  public static void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }
}
