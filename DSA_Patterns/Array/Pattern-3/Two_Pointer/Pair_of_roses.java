import java.util.*;
class Solution{
      static int[] findPair(int[] arr, int m) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        int bestA = 0, bestB = 0;
        int minDiff = Integer.MAX_VALUE;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == m) {
                int diff = arr[j] - arr[i];
                if (diff < minDiff) {
                    minDiff = diff;
                    bestA = arr[i];
                    bestB = arr[j];
                }
                i++;//if it has multiple answers
                j--;
            } else if (sum < m) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{bestA, bestB};
    }
}