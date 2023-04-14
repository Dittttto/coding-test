class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        long answer = 0;
        for(int i = 0; i< absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return (int)answer;
    }
}