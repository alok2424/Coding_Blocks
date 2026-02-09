/*
1) Asked in Amazon,Google,Microsoft
2) sorting the array in descending order will not give the final answer
 */


import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        // Number of test cases

        while (t-- > 0) {

            int n = sc.nextInt();
            // Size of array

            String[] arr = new String[n];
            // Store numbers as strings (important!)

            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
                // Read each number as string
            }

            Arrays.sort(arr, (a, b) -> {
                // Custom comparator

                String ab = a + b;
                String ba = b + a;

                return ba.compareTo(ab);
                // Sort in descending order of concatenation
            });

            // Print result
            for (String s : arr) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
