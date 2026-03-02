public class PalindromeCheckerApp {

  // UC3: Palindrome Check Using String Reverse
  public static void main(String[] args) {

    String original = "madam";   // Hardcoded string
    String reversed = "";

    // Reverse the string using for loop
    for (int i = original.length() - 1; i >= 0; i--) {
      reversed = reversed + original.charAt(i);
    }

    System.out.println("Original String : " + original);
    System.out.println("Reversed String : " + reversed);

    // Compare original and reversed string
    if (original.equals(reversed)) {
      System.out.println("Result : Palindrome");
    } else {
      System.out.println("Result : Not a Palindrome");
    }
  }
}