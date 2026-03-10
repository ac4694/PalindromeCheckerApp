import java.util.*;

public class PalindromeCheckerApp {

  // Reverse string method
  public static boolean reverseMethod(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
  }

  // Stack method
  public static boolean stackMethod(String str) {
    Stack<Character> stack = new Stack<>();

    for (char c : str.toCharArray()) {
      stack.push(c);
    }

    for (char c : str.toCharArray()) {
      if (c != stack.pop()) {
        return false;
      }
    }
    return true;
  }

  // Two pointer method
  public static boolean twoPointerMethod(String str) {

    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

  public static void main(String[] args) {

    String input = "madam";

    // Reverse method timing
    long start1 = System.nanoTime();
    boolean result1 = reverseMethod(input);
    long end1 = System.nanoTime();

    // Stack method timing
    long start2 = System.nanoTime();
    boolean result2 = stackMethod(input);
    long end2 = System.nanoTime();

    // Two pointer timing
    long start3 = System.nanoTime();
    boolean result3 = twoPointerMethod(input);
    long end3 = System.nanoTime();

    System.out.println("Input String : " + input);

    System.out.println("\nReverse Method Result : " + result1);
    System.out.println("Execution Time : " + (end1 - start1) + " ns");

    System.out.println("\nStack Method Result : " + result2);
    System.out.println("Execution Time : " + (end2 - start2) + " ns");

    System.out.println("\nTwo Pointer Method Result : " + result3);
    System.out.println("Execution Time : " + (end3 - start3) + " ns");
  }
}