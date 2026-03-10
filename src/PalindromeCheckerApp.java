import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

  // UC7: Deque-Based Optimized Palindrome Checker
  public static void main(String[] args) {

    String input = "madam";   // Hardcoded string

    Deque<Character> deque = new LinkedList<>();

    // Insert characters into deque
    for (int i = 0; i < input.length(); i++) {
      deque.addLast(input.charAt(i));
    }

    boolean isPalindrome = true;

    // Compare front and rear characters
    while (deque.size() > 1) {

      char front = deque.removeFirst();
      char rear = deque.removeLast();

      if (front != rear) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println("Input String : " + input);

    if (isPalindrome) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}