
import java.util.Arrays;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;

        // Create an array to store original indices
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices according to heights in descending order
        Arrays.sort(indices, (a, b) ->
            Integer.compare(heights[b], heights[a])
        );

        // Store names in sorted order
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = names[indices[i]];
        }

        return result;
    }
}
