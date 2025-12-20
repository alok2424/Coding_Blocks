//Pair of Rose
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {

            int m = sc.nextInt(); // size of rose array
            int[] rose = new int[m];

            for (int i = 0; i < m; i++) {
                rose[i] = sc.nextInt();
            }

            int deepak_money = sc.nextInt();

            // Step 1: sort the array
            Arrays.sort(rose);

            // Step 2: two pointers
            int left = 0;
            int right = m - 1;

            int minDiff = Integer.MAX_VALUE;
            int ans1 = 0, ans2 = 0;

            while (left < right) {
                int sum = rose[left] + rose[right];

                if (sum == deepak_money) {
                    int diff = rose[right] - rose[left];

                    if (diff < minDiff) {
                        minDiff = diff;
                        ans1 = rose[left];
                        ans2 = rose[right];
                    }
                    left++;
                    right--;
                }
                else if (sum < deepak_money) {
                    left++;
                }
                else {
                    right--;
                }
            }
        System.out.print("Deepak should buy roses whose prices are " + ans1 + " and " + ans2);
        
         // Blank line after each test case
            if (t >= 0) {
                System.out.println();
            }
            
        }
        sc.close();
    }
}
