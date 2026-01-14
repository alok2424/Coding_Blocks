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

        int[] freq = new int[256];
        // Creates a frequency array of size 256
        // This covers all possible ASCII characters (uppercase + lowercase)

        for (int i = 0; i < s.length(); i++) {
        // Loop through each character of the string

            char ch = s.charAt(i);
            // Extracts the character at index i

            freq[ch]++;
            // Increments the frequency count of that character
            // ASCII value of character is used as index
        }

        char ans = s.charAt(0);
        // Assumes the first character as the most frequent initially

        int maxFreq = freq[ans];
        // Stores the frequency of the assumed most frequent character

        for (int i = 1; i < s.length(); i++) {
        // Loop again to find the character with the highest frequency

            char ch = s.charAt(i);
            // Gets the current character

            if (freq[ch] > maxFreq) {
            // Checks if current character has higher frequency

                maxFreq = freq[ch];
                // Updates maximum frequency

                ans = ch;
                // Updates the answer character
            }
        }

        System.out.print(ans);
        // Prints the character with the highest frequency
    }
}
