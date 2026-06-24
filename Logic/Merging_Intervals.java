
// You are given an array of intervals where each interval contains:
// a starting point
// an ending point
// An interval is represented as:
// [start, end]
// Your task is to merge all overlapping intervals and return a new list of non-overlapping merged intervals.
// Overlapping Condition
// Two intervals overlap if:
// current_start <= previous_end
// Example:
// [1,3] and [2,6]
// Since:
// 2 <= 3
// they overlap.
// Merged interval becomes:
// [1,6]
// Example 1
// Input
// intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output
// [[1,6],[8,10],[15,18]]
// Explanation
// [1,3] overlaps with [2,6]
// Merge them into [1,6]
// Other intervals do not overlap.
// Example 2
// Input
// intervals = [[1,4],[4,5]]
// Output
// [[1,5]]
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merging_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] mergedIntervals = mergeIntervals(intervals);
        for (int i = 0; i < mergedIntervals.length; i++) {
            System.out.println("[" + mergedIntervals[i][0] + "," + mergedIntervals[i][1] + "]");
        }
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }
        // Sort intervals based on the starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) { // Overlapping intervals
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else { // Non-overlapping interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
