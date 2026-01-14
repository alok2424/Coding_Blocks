import java.util.*;
// Imports utility classes (Scanner is used for input)
class Main{
// Main class declaration (required by online judges)

    public static void main(String[] args) {
    // Program execution starts from the main method

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to read input from the user

        String s = sc.nextLine();
        // Reads the input string and stores it in variable 's'

        int maxLen = 0;
        // Stores the length of the longest good substring found so far

        int currLen = 0;
        // Stores the length of the current good (vowel-only) substring

        for (int i = 0; i < s.length(); i++) {
        // Loop through each character of the string

            char ch = s.charAt(i);
            // Extracts the character at index i

            if (isVowel(ch)) {
            // Checks if the character is a vowel

                currLen++;
                // Increments current good substring length

                maxLen = Math.max(maxLen, currLen);
                // Updates maximum length if current length is greater

            } else {
            // Executes when the character is NOT a vowel

                currLen = 0;
                // Resets current length since good substring breaks
            }
        }

        System.out.print(maxLen);
        // Prints the length of the longest good substring
    }

    public static boolean isVowel(char ch) {
    // Function to check whether a character is a vowel

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        // Returns true if character is a vowel, otherwise false
    }
}
