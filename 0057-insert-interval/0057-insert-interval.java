class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         /*
           Two steps to follow: 

           Step 1 - since the intervals are sorted, find the correct position of new interval by skipping the 
                    intervals whose end is smaller than newInterval start

           Step 2 - if intervals overlap, i.e newInterval.end is greater than interval[i].start 
                    then merge these two   intervals
        */

        List<int[]> ans = new ArrayList<>(); // answer list
        int i=0; //to keep track of intervals of interval array

        // STEP - I skip the intervals whose end is smaller than newInterval start
        while( i<intervals.length && intervals[i][1]<newInterval[0] ) {
            ans.add(intervals[i]);
            i ++;
        }

        // STEP - II merge the intervals whose start is less than newInterval.end
        while( i<intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);

            i++;
        }
        ans.add(newInterval);

        // add the remaining intervals into the ans array
        while( i<intervals.length ) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][2]);
    }
}