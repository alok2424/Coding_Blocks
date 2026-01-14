//special question
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        // Edge cases
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        // Binary search (avoid boundaries)
        low = 1;
        high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Found the single element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            // Decide direction using index parity
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // safety (never reached)
    }
}
