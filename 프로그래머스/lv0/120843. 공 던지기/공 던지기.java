class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = numbers.length;
        while(k > 1) {
            answer = (answer + 2 + n) % n;
            k--;
        }
        return numbers[answer];
    }
}