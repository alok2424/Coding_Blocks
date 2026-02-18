//leetcode 40
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int idx, int[] a, int target, List<Integer> path, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < a.length; i++) {
            if (i > idx && a[i] == a[i - 1]) continue; // ✅ skip duplicates
            if (a[i] > target) break;                  // ✅ prune
            path.add(a[i]);
            backtrack(i + 1, a, target - a[i], path, ans); // ✅ use once => i+1
            path.remove(path.size() - 1);
        }
    }
}
