package LinkedList.basic;

public class DoublyLinkedList {

  public static class ListNode {

    ListNode prev;
    int val;
    ListNode next;

    public ListNode(int val) {
      this.prev = null;
      this.val = val;
      this.next = null;
    }
  }

  private ListNode head;
  private ListNode tail;
  private int size;

  public DoublyLinkedList() {
    head = new ListNode(-1);
    tail = head;
    size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= size) return -1;

    ListNode temp = head;
    for (int i = 0; i <= index; i++) {
      temp = temp.next;
    }
    return temp.val;
  }

  public void addAtHead(int val) {
    ListNode atHead = new ListNode(val);
    atHead.next = head.next;
    if (head.next != null) head.next.prev = atHead;
    head.next = atHead;
    atHead.prev = head;
    if (tail == head) tail = atHead;
    size++;
  }

  public void addAtTail(int val) {
    ListNode atTail = new ListNode(val);
    atTail.prev = tail;
    tail.next = atTail;
    tail = atTail;
    size++;
  }

  public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) return;

    ListNode temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    ListNode newElement = new ListNode(val);
    newElement.next = temp.next;
    if (temp.next != null) temp.next.prev = newElement;
    temp.next = newElement;
    newElement.prev = temp;
    if (tail == temp) tail = newElement;
    size++;
  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) return;

    ListNode temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
    if (temp.next != null) temp.next.prev = temp; else tail = temp;
    size--;
  }
//   public class Main {
    public static void main(String[] args) {
        // Create a new instance of DoublyLinkedList
        DoublyLinkedList linkedList = new DoublyLinkedList();

        // Test addAtHead
        linkedList.addAtHead(5);
        linkedList.addAtHead(10);
        linkedList.addAtHead(15);
        System.out.println("Linked List after addAtHead:");
        printLinkedList(linkedList); // Expected: 15 -> 10 -> 5

        // Test addAtTail
        linkedList.addAtTail(20);
        linkedList.addAtTail(25);
        linkedList.addAtTail(30);
        System.out.println("Linked List after addAtTail:");
        printLinkedList(linkedList); // Expected: 15 -> 10 -> 5 -> 20 -> 25 -> 30

        // Test addAtIndex
        linkedList.addAtIndex(2, 100);
        System.out.println("Linked List after addAtIndex(2, 100):");
        printLinkedList(linkedList); // Expected: 15 -> 10 -> 100 -> 5 -> 20 -> 25 -> 30

        // Test get
        System.out.println("Value at index 4: " + linkedList.get(3)); // Expected: 20

        // Test deleteAtIndex
        linkedList.deleteAtIndex(4);
        System.out.println("Linked List after deleteAtIndex(4):");
        printLinkedList(linkedList); // Expected: 15 -> 10 -> 100 -> 5 -> 25 -> 30
    }

    // Helper method to print the linked list
    public static void printLinkedList(DoublyLinkedList linkedList) {
        DoublyLinkedList.ListNode temp = linkedList.head.next;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}


