import java.util.*;
public class LeetCode7 {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int n:nums2){
            if(set1.contains(n))s.add(n);
        }
        int[] res=new int[s.size()];
        int i=0;
        for(int n:s){
            res[i++]=n;
        }
        return res;
    }

    public int[][] merge(int[][] intervals) {
        Comparator<int[]> byZerothIndex = new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        };
        Arrays.sort(intervals, byZerothIndex);
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] cur = intervals[i];
            if (res.isEmpty() || res.get(res.size() - 1)[1] < cur[0]) {
                res.add(cur);
            } else {
                int[] merge = res.get(res.size() - 1);
                merge[1]=Math.max(merge[1],cur[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }


}
