class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int item: box) {
            answer *= item / n;
        }
        return answer;
    }
}