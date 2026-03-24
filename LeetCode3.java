public class LeetCode3 {

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

    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;
        boolean left = true;

        while (remaining > 1) {

            if (left || remaining % 2 == 1) {
                head += step;
            }

            remaining /= 2;
            step *= 2;
            left = !left;
        }

        return head;
    }

    public int passThePillow(int n, int time) {
        int a = time % (n - 1);
        if ((time / (n - 1)) % 2 == 0)
            return (a + 1);
        else
            return (n - a);
    }


    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    } 
    
        public int maxArea(int[] height) {
        int left =0,right=height.length-1;
        int max=0, ans=0;
        while(left<right){
            if(height[left]<height[right]){
                ans= height[left]*(right-left);
                left++;
            }
                
            else{
                ans= height[right]*(right-left);
                right--;
            }
            max= Math.max(ans, max);
            
        }
        return max;
    }


    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftmax = 0, rightmax = 0, ar = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftmax) {
                    leftmax = height[left];
                } else {
                    ar += leftmax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightmax) {
                    rightmax = height[right];
                } else {
                    ar += rightmax - height[right];
                }
                right--;
            }
        }
        return ar;
    } 
    
    
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0;
        int dir = 0;
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                if (dir == 0)
                    y++;
                else if (dir == 1)
                    x++;
                else if (dir == 2)
                    y--;
                else
                    x--;
            } else if (c == 'L') {
                dir = (dir + 3) % 4;
            } else {
                dir = (dir + 1) % 4;
            }
        }
        return (x == 0 && y == 0) || dir != 0;
    }

    public int arrangeCoins(int n) {
        int i = 1;
        while (n >= i) {
            n = n - i;
            i++;

        }
        return i - 1;
    }
}
