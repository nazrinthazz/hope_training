public class LeetCode2 {
    public boolean canAliceWin(int[] nums) {
        int s1=0,s2=0;
        for(int n:nums){
            if(n/10>0){
                s2+=n;
            }else s1+=n;
        }
        if(s1==s2)return false;
        else return true;
    }


    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length - 1;
        reverse(nums, 0, n);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n);
    }

    public int[] reverse(int[] nums, int i, int j) {
        for (; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }


    public int[] shuffle(int[] nums, int n) {
       int arr[]=new int[nums.length];
       int j=0,k=n;
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            arr[i]=nums[j++];
        }else arr[i]=nums[k++];
       }
       return arr;
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && (!isVowel(arr[i])))
                i++;
            while (i < j && (!isVowel(arr[j])))
                j--;
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);

    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < address.length()) {
            if (address.charAt(i) == '.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
    }


    public int lengthOfLastWord(String s) {
        int l=s.length();
        int i=l-1;
        int n=0;
        while(s.charAt(i)==' '){
            i--;
        }
        while(i>=0&&s.charAt(i)!=' '){
            i--;
            n++;
        }
        return n;
    }

    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') balance++;
            else balance--;
            if (balance == 0) count++;
        }
        return count;
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length()||j<word2.length()){
            if(i<word1.length())sb.append(word1.charAt(i));
            if(j<word2.length())sb.append(word2.charAt(j));
            i++;
            j++;
        }
        return sb.toString();
    }
    

}
