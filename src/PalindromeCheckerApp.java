import java.util.Stack;

// Palindrome service class
class PalindromeChecker {

  public boolean checkPalindrome(String input) {

    Stack<Character> stack = new Stack<>();

    // Push characters into stack
    for (char c : input.toCharArray()) {
      stack.push(c);
    }

    // Compare with original
    for (char c : input.toCharArray()) {
      if (c != stack.pop()) {
        return false;
      }
    }

    return true;
  }
}

// Main application class
public class PalindromeCheckerApp {

  public static void main(String[] args) {

    String input = "madam";

    PalindromeChecker checker = new PalindromeChecker();

    boolean result = checker.checkPalindrome(input);

    System.out.println("Input String : " + input);

    if (result) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}