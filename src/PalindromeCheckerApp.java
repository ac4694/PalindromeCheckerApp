public class PalindromeCheckerApp {

  // UC2: Hardcoded Palindrome Check
  public static void main(String[] args) {

    String input = "madam";   // Hardcoded string
    boolean isPalindrome = true;

    int left = 0;
    int right = input.length() - 1;

    while (left < right) {
      if (input.charAt(left) != input.charAt(right)) {
        isPalindrome = false;
        break;
      }
      left++;
      right--;
    }

    System.out.println("Hardcoded String : " + input);

    if (isPalindrome) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}