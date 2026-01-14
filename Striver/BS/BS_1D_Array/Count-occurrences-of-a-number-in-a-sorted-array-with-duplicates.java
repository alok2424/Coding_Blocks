//last Occurence - first Occurence +1;


class Solution {
    public int CountOccurence(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccurrence(nums, n, target);
        int last = lastOccurrence(nums, n, target);
        //how to return index with two value
        return last-first+1;//array bana kar return karo
    }

    private int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                first = mid;
                high = mid - 1;//first occurence milne k baad bhi search karo left side
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return first;
    }

    private int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                last = mid;
                low = mid + 1;//ans mil gya, ab uske right hand side me search karo
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return last;
    }
}
