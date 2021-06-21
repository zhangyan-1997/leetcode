import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution20 {
    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length==0||intervals==null) return res.toArray(new int[0][]);
        Arrays.sort(intervals,(l1,l2)->{return l1[0]-l2[0];});

        int i=0;

        while(i<intervals.length){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i<intervals.length-1&&intervals[i+1][0]<=right){
                i++;
                right = Math.max(intervals[i][1],right);
            }
            res.add(new int[]{left,right});
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,4},{2,3}};
        System.out.println(Arrays.deepToString(merge(ints)));
    }
}
