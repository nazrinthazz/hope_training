import java.util.*;
public class LeetCode1 {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == ' ') {
                rev(arr, start, end - 1);
                start = end + 1;
            }
        }
        rev(arr, start, arr.length - 1);

        return new String(arr);
    }

    static void rev(char c[],int l,int r){
         while(l<r){
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;
            }
    }

       public void moveZeroes(int[] nums) {
        int a=0;
        for(int n:nums){
           if(n!=0) {
                nums[a]=n;
                a++;
           }
        }
        for(int i=a;i<nums.length;i++){
            nums[i]=0;
        }
    }

        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sol=new int[m+n];
        int k=0,i=0,j=0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                sol[k++]=nums1[i++];
            }else {
                sol[k++]=nums2[j++];
            }
        }
        while(i<m||j<n){
            if(i<m){
                sol[k++]=nums1[i++];
            }
            if(j<n){
                sol[k++]=nums2[j++];
            }
        }
        for( i=0;i<m+n;i++){
            nums1[i]=sol[i];
        }
    }

    public void sortColors(int[] nums) {
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]<nums[i]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
       }
       
    }

    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }
                total += (max - min);
            }
        }
        return total;
    }

        public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;

        while (xor != 0) {
            xor=xor&(xor-1);
            count++;
        }

        return count;
    }
}


