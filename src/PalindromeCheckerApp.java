public class PalindromeCheckerApp {

  // UC4: Character Array Based Palindrome Check
  public static void main(String[] args) {

    String input = "madam";   // Hardcoded string

    // Convert string to character array
    char[] characters = input.toCharArray();

    int left = 0;
    int right = characters.length - 1;
    boolean isPalindrome = true;

    // Two-pointer comparison
    while (left < right) {
      if (characters[left] != characters[right]) {
        isPalindrome = false;
        break;
      }
      left++;
      right--;
    }

    System.out.println("Input String : " + input);

    if (isPalindrome) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}