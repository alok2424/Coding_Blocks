//leetcode 39
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // optional but helps pruning
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
            if (a[i] > target) break;       // prune (needs sorting)
            path.add(a[i]);
            backtrack(i, a, target - a[i], path, ans); // ✅ unlimited use => i
            path.remove(path.size() - 1);
        }
    }
}
