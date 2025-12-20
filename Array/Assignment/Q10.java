//MAximum Circule SUm
import java.util.*;

class Main{

    public static int MaximumSum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            ans = Math.max(ans, currsum);
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return ans;
    }

    public static int maxCircularSum(int[] arr) {

        // Step 1: Normal Kadane
        int maxNormal = MaximumSum(arr);

        // Step 2: All negative case
        if (maxNormal < 0) {
            return maxNormal;
        }

        int totalSum = 0;

        // Step 3: Invert array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        // Step 4: Min subarray sum using same Kadane
        int minSubarray = -MaximumSum(arr);

        // Step 5: Circular sum
        int maxCircular = totalSum - minSubarray;

        // Step 6: Final answer
        return Math.max(maxNormal, maxCircular);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(maxCircularSum(arr));
        }
        sc.close();
    }
}
