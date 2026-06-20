import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {

        // Sort all intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        // Add first interval to result list
        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            // Last interval already present in merged result
            // Example: list = [[1,4]]
            // prev = [1,4]
            int[] prev = list.get(list.size() - 1);

            // Current interval 
            // Example: curr = [4,7]
            int[] curr = intervals[i];

            // Overlap condition
            // Current start time <= Previous end time
            // Example:
            // prev = [1,4]
            // curr = [4,7]
            // 4 <= 4 => overlap
            if (curr[0] <= prev[1]) {

                // Merge both intervals

                // Start time will always be the smaller one
                // Mostly prev[0] remains unchanged because array is sorted
                // prev[0] = Math.min(prev[0], curr[0]);

                // Take the maximum end time
                // [1,4] + [4,7] => [1,7]
                prev[1] = Math.max(prev[1], curr[1]);

            } else {

                // No overlap
                // Example:
                // prev = [1,7]
                // curr = [8,10]
                // 8 > 7
                // Add current interval as a new interval
                list.add(curr);
            }
        }

        // Convert List<int[]> to int[][]
        // If list contains:
        // [[1,7],[8,10],[15,18]]
        // Create:
        // new int[3][2]
        int[][] res = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {

            // Copy each merged interval into result array
            res[i] = list.get(i);
        }

        return res;
    }
}