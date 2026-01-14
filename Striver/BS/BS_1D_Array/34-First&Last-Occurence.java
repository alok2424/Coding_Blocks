
//key points of the question
/*
1)how to return index with two value -> return new int[]{first, last};
2)first occurence milne k baad bhi search karo left side
3)first occurence milne k baad bhi search karo left side
*/


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccurrence(nums, n, target);
        int last = lastOccurrence(nums, n, target);
        //how to return index with two value
        return new int[]{first, last};//array bana kar return karo
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
