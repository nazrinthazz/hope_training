public class ZigZag {
    public static String zz(String s,int n){
        StringBuilder rows[]=new StringBuilder[n];
        for(int i=0;i<n;i++){
            rows[i]=new StringBuilder();
        }
        int row = 0;
        boolean goingDown = false;
        if(n==1)return s;
        for (char c : s.toCharArray()) {
            rows[row].append(c);

            // change direction at top or bottom
            if (row == 0||row == n - 1) goingDown = !goingDown ;

            //move row
            row += goingDown ? 1 : -1;
        }

        // combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb);
        }

        return result.toString();
    }

    public static void main (String[] args){
        String s="PAYPALISHIRING";
        int n=3;
        System.out.println(zz(s,n));

    }
}
