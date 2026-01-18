import java.util.*;

public class Main {

    // Kadane's Algorithm for Maximum Subarray Sum
    static int kadaneMax(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    // Kadane's Algorithm for Minimum Subarray Sum
    static int kadaneMin(int[] nums) {
        int minEndingHere = nums[0];
        int minSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            minEndingHere = Math.min(nums[i], minEndingHere + nums[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        return minSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            int totalSum = 0;

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                totalSum += nums[i];
            }

            int maxNormal = kadaneMax(nums);

            // If all elements are negative
            if (maxNormal < 0) {
                System.out.println(maxNormal);
                continue;
            }

            int minSubarray = kadaneMin(nums);
            int maxCircular = totalSum - minSubarray;

            System.out.println(Math.max(maxNormal, maxCircular));
        }
        sc.close();
    }
}
