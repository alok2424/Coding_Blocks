/*
1)how to find the missing positive number
=> missing num = arr[mid] - (mid+1) 
*/

/*
Brute Approach:
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int N = arr.length;
        int num = 1;
        int i = 0;

        while (i < N && k > 0) {
            if (num == arr[i]) {
                i++;
            } else {
                k--;
            }
            num++;
        }

        while (k-- > 0) {
            num++;
        }

        return num - 1;
    }
}

 */
class Solution {
    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // Answer formula
        return low + k;
    }
}
