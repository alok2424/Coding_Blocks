import java.util.*; 
// Imports all utility classes (Scanner is used for input)
class Main{ 
// Main class (required by most online judges)

    public static void main(String[] args) { 
    // Program execution starts from here

        Scanner sc = new Scanner(System.in); 
        // Creates Scanner object to take input from keyboard

        String s = sc.nextLine(); 
        // Reads the input string and stores it in variable 's'

        for (int i = 0; i < s.length(); i++) { 
        // Loop runs from index 0 to last index of the string

            char ch = s.charAt(i); 
            // Fetches the character at index i from the string

            if (i % 2 == 0) { 
            // Checks if index i is even

                ch = (char)(ch + 1); 
                // Converts character to next ASCII character
                // Example: 'a' → 'b', 'c' → 'd'

            } else { 
            // Executes when index i is odd

                ch = (char)(ch - 1); 
                // Converts character to previous ASCII character
                // Example: 'b' → 'a', 'g' → 'f'
            }

            System.out.print(ch); 
            // Prints the modified character without moving to a new line
        }
    }
}
