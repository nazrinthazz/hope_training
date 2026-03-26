
public class LeetCode4 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char c[] = command.toCharArray();
        int i = 0, n = c.length;
        while (i < n) {
            if (c[i] == 'G') {
                sb.append("G");
                i++;
            } else if (c[i] == '(' && c[i + 1] == ')') {
                sb.append("o");
                i += 2;
            } else {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }


    public String toLowerCase1(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((int) c <= 90 && (int) c >= 65)
                c = (char) (c + 32);
            sb.append(c);
        }
        return sb.toString();
    }

    public boolean detectCapitalUse(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                cnt++;
        }
        return (cnt == 0 || (cnt == 1 && Character.isUpperCase(s.charAt(0))) || cnt == s.length());
    }


    public boolean detectCapitalUse1(String word) {
        if(word.length() == 1) return true;

        boolean firstUpper = Character.isUpperCase(word.charAt(0));
        boolean secondUpper = Character.isUpperCase(word.charAt(1));

        if(!firstUpper && secondUpper) return false;

        for(int i = 2; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)) != secondUpper){
                return false;
            }
        }
        return true;
    }
    

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }

}
