/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].



Sorting takes O(n log(n)) and merging the intervals takes O(n). So, the resulting algorithm i.e. sorting, takes O(n log(n)).
*/

 
class Solution {
  
	public int[][] merge(int[][] intervals) {
		if (intervals.length <= 1)
			return intervals;

		// Sort on th basis of ascending starting point
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);
    
    
		for (int[] interval : intervals) {
			if (interval[0] <= newInterval[1])
        // Overlapping intervals, move the end if needed
         // overlap condition (update the end pointer)

				newInterval[1] = Math.max(newInterval[1], interval[1]);
      
			else {                             
        // Disjoint intervals, add the new interval to the list
        
				newInterval = interval;
				result.add(newInterval);
			}
		}

		return result.toArray(new int[result.size()][]);
	}
}
