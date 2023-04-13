import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] tmp = String.valueOf(n).split("");
        Arrays.sort(tmp, (x, y) -> Integer.parseInt(y) - Integer.parseInt(x));
        String answer  = Arrays.stream(tmp).reduce("", (x,y) -> x+y);
        
        return Long.parseLong(answer);
    }
}