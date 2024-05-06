package LinkedList.basic;

// Implementation for Singly Linked List

public class SinglyLinkedList {

  public static class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  ListNode head;
  ListNode tail;

  public SinglyLinkedList() {
    head = new ListNode(-1);
    tail = head;
  }

  public void insertEnd(int val) {
    tail.next = new ListNode(val);
    tail = tail.next;
  }

  public void remove(int index) {
    int i = 0;
    ListNode cur = head;
    while (i < index && cur != null) {
      i++;
      cur = cur.next;
    }
    if (cur != null) {
      cur.next = cur.next.next;
    }
  }

  public void print() {
    ListNode curr = head.next;
    while (curr != null) {
      System.out.print(curr.val + " -> ");
      curr = curr.next;
    }

    System.out.println("null");
  }

  public static void main(String[] args) {
    // Creating a new singly linked list
    SinglyLinkedList list = new SinglyLinkedList();

    // Inserting elements at the end of the list
    list.insertEnd(1);
    list.insertEnd(2);
    list.insertEnd(3);
    list.insertEnd(4);

    // Printing the list
    System.out.println("Original List:");
    list.print(); // Expected output: 1 -> 2 -> 3 -> 4 -> null

    // Removing an element from the list
    System.out.println("List after removing element at index 2:");
    list.remove(2); // Remove the element at index 2 (0-based index)
    list.print(); // Expected output: 1 -> 2 -> 4 -> null
  }
}
