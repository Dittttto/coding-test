import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = Arrays.stream(s.split("")).sorted((x, y) -> y.charAt(0) - x.charAt(0)).reduce("", (i,j) -> i+j);
        return answer;
    }
}