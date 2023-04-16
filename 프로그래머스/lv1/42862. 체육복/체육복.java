class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] member = new int[n];
        for(int i = 0; i<n;i++) member[i] = 1;
        for(int idx: lost) member[idx-1] -= 1;
        for(int idx: reserve) member[idx-1] += 1;
        
        for(int i = 0; i< n ; i++) {
            if(member[i]  == 2) {
                if(i - 1 >= 0 && member[i-1] == 0) {
                    member[i] -=1;
                    member[i-1] = 1;
                    continue;
                }
                
                if(i + 1 < n && member[i+1] == 0) {
                    member[i] -=1;
                    member[i+1] = 1;
                    continue;
                }
            }
        }
        
        for(int i: member) {
            if(i > 0) answer++;
        }
        
        return answer;
    }
}