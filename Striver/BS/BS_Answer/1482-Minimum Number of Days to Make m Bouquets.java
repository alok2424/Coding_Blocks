/*
1) In order to bloom atleast one flower ,min value of array
2) Handle the impossible case:
  at any point of time: if(m*k > N), then it is impossible to make m bouqets
3)how to write this function: canMakeBouquets(bloomDay, m, k, mid)
 */
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // 1️⃣ Impossible case
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        // 2️⃣ Search space: days
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int d : bloomDay) {
            low = Math.min(low, d);
            high = Math.max(high, d);
        }
        // 3️⃣ Binary search on days
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                // possible → try smaller days
                ans = mid;
                high = mid - 1;
            } else {
                // not possible → need more days
                low = mid + 1;
            }
        }
        return ans;
    }

    // 4️⃣ Check function
    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int d : bloomDay) {
            if (d <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}
