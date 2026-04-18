import java.util.*;
public class LeetCode {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(target==nums[m])return m;
            if(nums[l]<=nums[m]){
                if(target<=nums[m]&&target>=nums[l]){
                    r=m-1;
                }else l=m+1;
            }else{
                if(target>=nums[m]&&target<=nums[r]){
                    l=m+1;
                }else r=m-1;
            }
        }
        return -1;
    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(sum>max)max=sum;
            if(sum<0)sum=0;
        }

        return max;
    }


    public int minCostToMoveChips(int[] position) {
        int even=0, odd=0;
        for(int n:position){
            if(n%2==0)even++;
            else odd++;
        }
        return Math.min(odd,even);
    }


    public int numIdenticalPairs(int[] nums) {
        int n=nums.length,cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])cnt++;
            }
        }
        return cnt;
    }


    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
                
            }
            max=Math.max(sum,max);
        }
        return max;
    }
    
    public int arraySign(int[] nums) {
        int res=1;
        for (int n : nums) {
            if (n == 0) return 0;
            if (n < 0) res=-res;
        }
        return res;
    }

    public String categorizeBox(int length, int width, int height, int mass) {
        long v=1L*length*width*height;//to change it into long
        boolean b=false,h=false;
        if(length>=10000||width>=10000||height>=10000||v>=1000000000)b=true;
        if(mass>=100)h=true;
        if(b&h)return "Both";
        else if(b )return "Bulky";
        else if(h )return "Heavy";
        else return "Neither";
    }



    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        char[] res = new char[n];
        Arrays.fill(res,'0');
        int c = 0;
        for(int i = 0; i< n; i++){
            char ch = s.charAt(i);
            if(ch == '1' & c ==0){
                res[n-1] = '1';
                c++;
            }
            else if(ch == '1'){
                res[c-1] = '1';
                c++;
            }
        }
        return new String(res);
    }


    
    public int hammingWeight(int n) {
       int c=0;
       String s=Integer.toBinaryString(n);
       for(char ch:s.toCharArray()){
        if(ch=='1')c++;
       }
       return c;
    }
} 
