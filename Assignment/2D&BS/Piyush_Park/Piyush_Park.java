//My_Solution
//mistake:

// Mistakes in Your Code

// Used int[][] instead of char[][]
// The park contains characters ('.', '*', '#'), not integers.

// Took wrong input type
// You used sc.nextInt() for grid input instead of reading characters.

// Compared characters with strings

// garden[i][j] == "."


// should be

// garden[i][j] == '.'


// Incorrect strength calculation logic

// Step cost (-1) not handled correctly

// Mixed up deductions like -2, -3, +4 inconsistently

// Last-column rule not applied properly

// Modified loop variables inside for loop

// i++;
// j = 0;


// This breaks loop control and causes logical errors.

// Incorrect handling of # (blockade)
// You should immediately stop processing the current row using break, not manually jump indices.

// Did not stop traversal immediately when S <= K
// Piyush must stop as soon as strength becomes ≤ K during traversal.

// Escape condition checked incorrectly

// Strength must be strictly greater than K while walking

// Final strength must be ≥ K, not just greater

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();

        char[][] park = new char[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                park[i][j] = sc.next().charAt(0);
            }
        }

        boolean escaped = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                if (S <= K) {
                    escaped = false;
                    break;
                }

                char cell = park[i][j];

                if (cell == '#') {
                    break; // jump to next row
                }

                // Step cost (except last column)
                if (j != M - 1) {
                    S -= 1;
                }

                if (cell == '.') {
                    S -= 2;
                } else if (cell == '*') {
                    S += 5;
                }
            }

            if (!escaped) break;
        }

        if (escaped && S >= K) {
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
    }
}
