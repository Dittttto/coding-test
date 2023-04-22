class Solution {
    static boolean[] checked = new boolean[1000001];
    Solution() {
        for(int i = 2; i <= 1000000; i++) {
            if(checked[i]) continue;
            for(int j = 2* i; j <= 1000000; j+= i) {
                if(j % i == 0) {
                    checked[j] = true;
                }
            }
        }
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(!checked[i]) answer++;
        }
        return answer;
    }
}