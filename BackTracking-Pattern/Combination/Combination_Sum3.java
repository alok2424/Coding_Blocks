//leetcode:216
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int k, int target, List<Integer> path, List<List<Integer>> ans) {
        if (path.size() == k) {
            if (target == 0) ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > target) break;          // prune
            path.add(i);
            backtrack(i + 1, k, target - i, path, ans); // use once
            path.remove(path.size() - 1);
        }
    }
}
