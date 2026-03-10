public class PalindromeCheckerApp {

  // Recursive method to check palindrome
  public static boolean isPalindrome(String str, int left, int right) {

    // Base condition
    if (left >= right) {
      return true;
    }

    // If characters don't match
    if (str.charAt(left) != str.charAt(right)) {
      return false;
    }

    // Recursive call
    return isPalindrome(str, left + 1, right - 1);
  }

  public static void main(String[] args) {

    String input = "madam";

    boolean result = isPalindrome(input, 0, input.length() - 1);

    System.out.println("Input String : " + input);

    if (result) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}