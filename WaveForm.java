public class WaveForm {
    public static void main(String[] args){
        String s="PAYPALISHIRING";
        //System.out.print(Wave(s));
        //System.out.println(NonRepeatingChar(s));
        //K_Pattern(s);
         System.out.println(ZigZag( s, 3));

    }
    public static String Wave(String s){
        int n=s.length();
        char[] a=new char[n];
       for(int i=0;i<n;i+=2){
        a[i]=s.charAt(i);
       }
       for(int i=1;i<n;i+=2){
        a[i]=s.charAt(i);
       }
        return new String(a);
    }
    public static String evenLength(String s){
        StringBuilder sb=new StringBuilder();
        String[] a=s.split(" ");
        for(String c:a){
          if((c.length())%2==0){
                sb.append(c+" ");
            }
        }
       return sb.toString();
    }
    public static String evenLength(String s){
        StringBuilder sb=new StringBuilder();
        StringBuilder w=new StringBuilder();
        s=s+" ";
       for(char c:s.toCharArray()){
            if(c ==' '){
                if(w.length()%2==0)sb.append(w).append(" ");
                w.setLength(0);
            }else w.append(c);
        }
        return sb.toString();
    }

    public static char NonRepeatingChar(String s){
        s=s.toLowerCase();
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;

        }
        for(char c:s.toCharArray()){
            if(freq[c-'a']==1)return c;
        }
        return '#';
    }

    public static void K_Pattern(String s){
        int n=s.length();
        int j=n-1,i=0;
        while(i<=j){
            for(int k=i;k<n;k++){
                if(k==i||k==j)System.out.print(s.charAt(k));
                else System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
            i++;
            j--;
        }
        while(i<n&&j>=0){
            for(int k=i;k>=0;k--){
                if(k==i||k==j)System.out.print(s.charAt(k));
                else System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
            i++;
            j--;
        }

    }
    public static String ZigZag(String s, int n){
        int l=s.length();
        StringBuilder res[]=new StringBuilder[n];
        int i=0;
        for(int k=0;k<n;k++){
            res[k]=new StringBuilder();
        }
        while(i<l){
            for(int j=0;j<n;j++){
                if(i==l)break;
                res[j].append(s.charAt(i));
                i++;
            }
            for(int j=n-2;j>0;j--){
                if(i==l)break;
                res[j].append(s.charAt(i));
                i++;
            } 
        }
        StringBuilder a=new StringBuilder();
        for(int k=0;k<n;k++){
            a.append(res[k]);
        }

        return a.toString();
    }


}
