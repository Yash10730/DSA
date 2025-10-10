import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }

    // Helper method for backtracking
    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> list) {
        // ✅ Base Case 1: Found a valid combination
        if (target == 0) {
            list.add(new ArrayList<>(current));
            return;
        }

        // ✅ Base Case 2: Target went negative → invalid path
        if (target < 0) return;

        // Try all candidates starting from 'start' index
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // choose
            // we pass 'i' (not i+1) because we can reuse same number
            backtrack(candidates, target - candidates[i], i, current, list);
            current.remove(current.size() - 1); // unchoose / backtrack
        }
    }
}
