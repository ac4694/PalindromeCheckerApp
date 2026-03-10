import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
  boolean check(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

  public boolean check(String input) {
    Stack<Character> stack = new Stack<>();

    for (char c : input.toCharArray()) {
      stack.push(c);
    }

    for (char c : input.toCharArray()) {
      if (c != stack.pop()) {
        return false;
      }
    }
    return true;
  }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

  public boolean check(String input) {
    Deque<Character> deque = new ArrayDeque<>();

    for (char c : input.toCharArray()) {
      deque.addLast(c);
    }

    while (deque.size() > 1) {
      if (deque.removeFirst() != deque.removeLast()) {
        return false;
      }
    }
    return true;
  }
}

// Context class
class PalindromeChecker {

  private PalindromeStrategy strategy;

  public PalindromeChecker(PalindromeStrategy strategy) {
    this.strategy = strategy;
  }

  public boolean checkPalindrome(String input) {
    return strategy.check(input);
  }
}

// Main Application
public class PalindromeCheckerApp {

  public static void main(String[] args) {

    String input = "madam";

    // Choose strategy dynamically
    PalindromeStrategy strategy = new StackStrategy();
    // PalindromeStrategy strategy = new DequeStrategy();

    PalindromeChecker checker = new PalindromeChecker(strategy);

    boolean result = checker.checkPalindrome(input);

    System.out.println("Input String : " + input);

    if (result) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}