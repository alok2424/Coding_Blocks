import java.util.*;

class FourSumTemplate {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> ans = fourSum(arr, target);
        for (List<Integer> quad : ans) System.out.println(quad);
    }

    static List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // skip duplicates for i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; // skip duplicates for j

                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {
                        res.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) left++;   // skip dup left
                        while (left < right && arr[right] == arr[right + 1]) right--; // skip dup right
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
