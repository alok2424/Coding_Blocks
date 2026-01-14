class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        // Upper bound is max element in nums
        for (int num : nums) {
            high = Math.max(high, num);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;

            // Calculate sum of ceil divisions
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if (sum <= threshold) {
                ans = mid;        // valid divisor
                high = mid - 1;   // try smaller
            } else {
                low = mid + 1;    // need larger divisor
            }
        }

        return ans;
    }
}
