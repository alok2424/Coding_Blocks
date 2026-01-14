/*
1)the max value present in the pile can be high(max) ans 
2)If the pile has less than k bananas, she eats all of them instead 
and will not eat any more bananas during this hour.
3)total hours req for each pile  =
            for (int pile : piles) {
                // ceil(pile / mid)
                totalHours += (pile + mid - 1) / mid;
            }
4)Apply BS on total hours vs given hour
 */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find maximum pile (upper bound for k)
        for (int p : piles) {
            high = Math.max(high, p);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2; // candidate k

            long totalHours = 0;

            // Calculate hours needed for this k
            for (int pile : piles) {
                // ceil(pile / mid)
                totalHours += (pile + mid - 1) / mid;
            }

            if (totalHours <= h) {
                ans = mid;        // k works, try smaller
                high = mid - 1;
            } else {
                low = mid + 1;    // k too slow
            }
        }

        return ans;
    }
}
