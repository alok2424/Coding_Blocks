import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(path)); // ✅ add at every level

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(i + 1, nums, path, ans); // use once
            path.remove(path.size() - 1);
        }
    }
}
