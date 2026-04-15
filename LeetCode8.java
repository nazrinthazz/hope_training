import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode8 {

    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> m = new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] s = paragraph.split(" ");
        int max = 0;
        String res = "";
        for (int i = 0; i < s.length; i++) {
            s[i]=s[i].replace(","," ");
            if (s[i].equals("") || ban.contains(s[i]))
                continue;
            m.put(s[i], m.getOrDefault(s[i], 0) + 1);
            if (max < m.get(s[i])) {
                res = s[i];
                max = m.get(s[i]);
            }
        }
        return res;
    }



    public int numJewelsInStones(String jew, String s) {
        int count = 0;
        for(int i=0; i<jew.length();i++){
            for(int j=0; j<s.length();j++){
                if(jew.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }


    public boolean checkIfPangram(String s) {
        int x=0;
        for(char c:s.toCharArray()){
            x=(x|1<<(c-'a'+1));
        }
        if((1<<26)-1==x)return true;
        else return false;
    }


    
    public int findMinArrowShots(int[][] points) {
        if(points.length<=1)return 1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow=1;
        int end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>end){
                arrow++;
                end=points[i][1];
            }
        }
        return arrow;
    }
}