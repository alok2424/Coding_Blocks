/*
1)If I take any capacity lesser than the max capacity available in the array, then I am not able to ship the weights which care greater than it
=> Low : max weight available in the array(minimum)

2)Worst case scenario: all the items shipped in one day
 high = sum of array

 */

class Solution {

    public int shipWithinDays(int[] weights, int days) {

        // 1️⃣ Find search space
        int low = 0;
        int high = 0;

        for (int w : weights) {
            low = Math.max(low, w); // max weight
            high += w;             // sum of weights
        }

        // 2️⃣ Binary search on capacity
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int requiredDays = daysRequired(weights, mid);

            if (requiredDays <= days) {
                // capacity works, try smaller
                high = mid - 1;
            } else {
                // capacity too small
                low = mid + 1;
            }
        }

        // low is the minimum capacity
        return low;
    }

    // 3️⃣ Helper function to calculate days needed
    private int daysRequired(int[] weights, int capacity) {
        int days = 1;
        int load = 0;

        for (int w : weights) {
            if (load + w <= capacity) {
                load += w;
            } else {
                days++;
                load = w;
            }
        }
        return days;
    }
}
