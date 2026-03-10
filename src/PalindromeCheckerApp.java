public class PalindromeCheckerApp {

  public static void main(String[] args) {

    String input = "Madam In Eden Im Adam";

    // Normalize the string
    String normalized = input.replaceAll("\\s+", "").toLowerCase();

    int left = 0;
    int right = normalized.length() - 1;
    boolean isPalindrome = true;

    while (left < right) {
      if (normalized.charAt(left) != normalized.charAt(right)) {
        isPalindrome = false;
        break;
      }
      left++;
      right--;
    }

    System.out.println("Original String : " + input);

    if (isPalindrome) {
      System.out.println("Result : Palindrome (Ignoring spaces and case)");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}