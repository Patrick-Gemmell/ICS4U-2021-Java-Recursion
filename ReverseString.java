/*
* This program takes the word "recursion" and reverses the order of the letters
* using recursion.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-06
*/

public final class ReverseString {
    private ReverseString() {

  }
  /**
   * This function will reverse a string that is passed into it using recursion.
   * @return
   * returns recursion.
   * @param someString
   */
  static String stringReversal(final String someString) {
    if (someString.length() == 0) {
      // Returning the current itteration of the string
      return someString;
    } else {
      // Calling and returning the reverseString function again to continue
      //   reversing the original word
      return stringReversal(someString.substring(1)) + someString.charAt(0);
    }
  }

  /**
   * This function prints a string then prints the same string in reverse.
   * @param args
   */
  public static void main(final String[] args) {
    // Initializing the original string
    String recursionString = "recursion";

    // Printing the initial string
    System.out.println("The original string is '" + recursionString + "'");

    // Calling the function that will reverse the string
    String newString = stringReversal(recursionString);

    // Printing out the newly reversed string
    System.out.println("The newly reversed string is '" + newString + "'");
  }
}
