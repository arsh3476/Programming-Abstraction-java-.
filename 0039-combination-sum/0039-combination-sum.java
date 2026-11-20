
import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(candidates, target, 0, current, result);

        return result;
    }

    public void backtrack(int[] candidates, int remaining, int start,
                          List<Integer> current,
                          List<List<Integer>> result) {

        // Target achieved
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try different candidates
        for (int i = start; i < candidates.length; i++) {

            if (candidates[i] <= remaining) {

                // Choose the number
                current.add(candidates[i]);

                // Same index allows reuse of the number
                backtrack(candidates, remaining - candidates[i],
                          i, current, result);

                // Undo the choice (backtracking)
                current.remove(current.size() - 1);
            }
        }
    }
}
