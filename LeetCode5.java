public class LeetCode5 {
    public int pivotIndex(int[] nums) {
        int rsum = 0;
        int n = nums.length;
        for (int a : nums) {
            rsum += a;
        }
        int i = 0;
        int lsum = 0;
        while (i < n) {
            rsum -= nums[i];
            if (lsum == rsum) {
                return i;
            }
            lsum += nums[i];
            i++;
        }
        return -1;
    }


    public static int NoOfWords(String s){ 
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '&&((i+1)==n||((i+1)<n && s.charAt(i+1)==' ')))count++;
        }
        return count;
    }
}
