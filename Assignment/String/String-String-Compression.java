import java.util.*;
// Imports utility classes (Scanner is required for input)
class Main {
// Main class (required by online judges)

    public static void main(String[] args) {
    // Entry point of the Java program

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to read input from standard input

        String s = sc.nextLine();
        // Reads the input string and stores it in variable 's'

        int count = 1;
        // Initializes count to 1 because the first character appears at least once

        for (int i = 1; i < s.length(); i++) {
        // Loop starts from index 1 to compare current character with previous character

            if (s.charAt(i) == s.charAt(i - 1)) {
            // Checks if current character is same as previous character

                count++;
                // Increments count for consecutive repeating characters

            } else {
            // Executes when the current character is different from previous

                System.out.print(s.charAt(i - 1));
                // Prints the previous character

                if (count > 1) {
                // Checks if the character appeared more than once

                    System.out.print(count);
                    // Prints the frequency only if it is greater than 1
                }

                count = 1;
                // Resets count for the new character
            }
        }

        // Handles the last character sequence (loop ends before printing it)

        System.out.print(s.charAt(s.length() - 1));
        // Prints the last character of the string

        if (count > 1) {
        // Checks if last character occurred more than once

            System.out.print(count);
            // Prints count only if greater than 1
        }
    }
}
