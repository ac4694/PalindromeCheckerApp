import java.util.Stack;

public class PalindromeCheckerApp {


  public static void main(String[] args) {

    String input = "madam";   // Hardcoded string
    Stack<Character> stack = new Stack<>();

    // Push characters into stack
    for (int i = 0; i < input.length(); i++) {
      stack.push(input.charAt(i));
    }

    // Pop characters to build reversed string
    String reversed = "";
    while (!stack.isEmpty()) {
      reversed = reversed + stack.pop();
    }

    System.out.println("Input String : " + input);
    System.out.println("Reversed String : " + reversed);

    // Compare original and reversed
    if (input.equals(reversed)) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}