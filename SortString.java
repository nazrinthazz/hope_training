import java.util.*;

public class SortString {
    static char[] sortString(String s) {

        int[] freq = new int[256];

        // count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // store unique chars in array
        char[] arr = new char[256];
        int n = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                arr[n++] = (char) i;
            }
        }

        // convert to Character[] JUST for sorting (safe way)
        Object[] temp = new Object[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];  // no explicit Character usage
        }

        // Comparator here 🔥
        Arrays.sort(temp, new Comparator<Object>() {
            public int compare(Object a, Object b) {
                char c1 = (char) a;
                char c2 = (char) b;
                return freq[c2] - freq[c1];
            }
        });

        // back to char[]
        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            res[i] = (char) temp[i];
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortString("tree")));
    }
}