import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

  // UC6: Queue + Stack Based Palindrome Check
  public static void main(String[] args) {

    String input = "madam";   // Hardcoded string

    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();

    // Enqueue and push characters
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      queue.add(ch);   // FIFO
      stack.push(ch);  // LIFO
    }

    boolean isPalindrome = true;

    // Compare dequeue (queue) and pop (stack)
    while (!queue.isEmpty()) {
      if (queue.remove() != stack.pop()) {
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