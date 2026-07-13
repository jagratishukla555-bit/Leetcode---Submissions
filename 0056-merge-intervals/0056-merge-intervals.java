class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            int j;
            for (j = i + 1; j < intervals.length; j++) {

                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ans.add(new ArrayList<>(Arrays.asList(start, end)));
            i = j - 1;
        }

        int[][] result = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}