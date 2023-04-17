class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n];
        for(int num: section) {
            arr[num-1] = -1;
        }
        
        int idx = 0;
        while(idx < n) {
            if(arr[idx] == -1) {
                idx = idx+m-1;
                answer++;
            }
            
            idx++;
        }
        
        return answer;
    }
}