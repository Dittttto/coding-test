class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i <=n; i++) {
            int tmp = i;
            for(int j = i+1;j<=n;j++) {
                tmp += j;
                if(tmp == n) {
                    answer++;
                    break;
                }else if(tmp > n) {
                    break;
                }
            }
        }
        return answer;
    }
}