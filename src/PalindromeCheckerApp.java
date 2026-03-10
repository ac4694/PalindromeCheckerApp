public class PalindromeCheckerApp {

  // Node class for singly linked list
  static class Node {
    char data;
    Node next;

    Node(char data) {
      this.data = data;
      this.next = null;
    }
  }

  // Build linked list from string
  public static Node buildList(String str) {
    Node head = null, tail = null;

    for (char c : str.toCharArray()) {
      Node newNode = new Node(c);

      if (head == null) {
        head = tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }
    return head;
  }

  // Reverse linked list
  public static Node reverse(Node head) {
    Node prev = null;
    Node current = head;

    while (current != null) {
      Node next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  // Check palindrome using linked list
  public static boolean isPalindrome(Node head) {

    Node slow = head;
    Node fast = head;

    // Find middle
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // Reverse second half
    Node secondHalf = reverse(slow);

    Node firstHalf = head;

    // Compare halves
    while (secondHalf != null) {
      if (firstHalf.data != secondHalf.data) {
        return false;
      }
      firstHalf = firstHalf.next;
      secondHalf = secondHalf.next;
    }

    return true;
  }

  public static void main(String[] args) {

    String input = "madam";

    Node head = buildList(input);

    boolean result = isPalindrome(head);

    System.out.println("Input String : " + input);

    if (result) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}