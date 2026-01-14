import java.util.*;
// Imports utility classes (Scanner is needed for taking input)
class Main {
// Main class declaration (required by most coding platforms)

    public static void main(String[] args) {
    // Execution of the program starts from the main method

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to read input from the user

        String s = sc.nextLine();
        // Reads the input string and stores it in variable 's'

        System.out.print(s.charAt(0));
        // Prints the first character of the string
        // We print it directly because there is no previous character to compare with

        for (int i = 1; i < s.length(); i++) {
        // Loop starts from index 1 and goes till the end of the string
        // We start from 1 because we compare current character with previous character

            char curr = s.charAt(i);
            // Stores the current character at index i

            char prev = s.charAt(i - 1);
            // Stores the previous character (at index i-1)

            int diff = curr - prev;
            // Calculates ASCII difference between current and previous character
            // Example: 'c' - 'a' = 99 - 97 = 2

            System.out.print(diff);
            // Prints the ASCII difference between characters

            System.out.print(curr);
            // Prints the current character after the difference
        }
    }
}
