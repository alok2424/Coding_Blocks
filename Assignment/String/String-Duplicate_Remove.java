import java.util.*;
// Imports utility classes (Scanner is used for input)
class Main {
// Main class declaration (required by coding platforms)

    public static void main(String[] args) {
    // Program execution starts from the main method

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to read input from the user

        String s = sc.nextLine();
        // Reads the input string and stores it in variable 's'

        // Print the first character of the string
        // because it has no previous character to compare with
        System.out.print(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
        // Loop starts from index 1 to compare current character with previous character

            char curr = s.charAt(i);
            // Stores the current character at index i

            char prev = s.charAt(i - 1);
            // Stores the previous character at index i-1

            if (curr != prev) {
            // Checks if current character is different from previous character

                System.out.print(curr);
                // Prints the character only if it is NOT a consecutive duplicate
            }
        }
    }
}
