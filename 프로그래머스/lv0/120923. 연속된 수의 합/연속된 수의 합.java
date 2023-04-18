class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int tmp = 0;
        for(int i = 0; i< num;i++) {
            tmp += i;
        }
        
        int start = (total - tmp) / num;
        int idx = 0;
        while(idx < num) {
            answer[idx++] = start++;
        }
        return answer;
    }
}