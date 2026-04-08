import java.util.*;

public class LeetCode6 {
    
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>map1=new HashMap<>();
        Map<Character,Integer>map2=new HashMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if (map1.equals(map2)) return true;
       else return false;
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m.get(c) == 1)
                return i;
        }
        return -1;
    }


    public int majorityElement(int[] nums) {
        Map<Integer, Integer>m=new HashMap<>();
        int maxfreq=0;
        int maxkey=0;
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
            if(maxfreq<m.get(n)){
                maxfreq=m.get(n);
                maxkey=n;
            }
            
        }
        return maxkey;

    }


    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m1 = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (m1.containsKey(c)) {
                m1.put(c, m1.get(c) - 1);
            } else
                return false;
            if (m1.get(c) == 0) {
                m1.remove(c);
            }
        }
        return true;
    }

}
