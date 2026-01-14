import java.util.*;
// Imports utility classes (Scanner is used to take input)

public class Main {
// Main class declaration (required by online judges)

    public static void main(String[] args) {
    // Execution of the program starts from the main method

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to read input from the user

        String s = sc.nextLine();
        // Reads the input string and stores it in variable 's'

        boolean isPalindrome = true;
        // Assumes the string is a palindrome initially

        int left = 0;
        // Pointer pointing to the start of the string

        int right = s.length() - 1;
        // Pointer pointing to the end of the string

        while (left < right) {
        // Loop continues until both pointers meet in the middle

            if (s.charAt(left) != s.charAt(right)) {
            // Checks if characters at left and right positions are different

                isPalindrome = false;
                // If mismatch found, string is not a palindrome

                break;
                // Exit the loop immediately
            }

            left++;
            // Move left pointer one step forward

            right--;
            // Move right pointer one step backward
        }

        System.out.print(isPalindrome);
        // Prints true if palindrome, false otherwise
    }
}
