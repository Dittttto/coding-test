class Solution {
    public int solution(String s) {
        String[] arr = s.split("");
        
        if(arr.length == 1) return 1;
        int idx = 1;
        int xc = 1;
        int yc = 0;
        String x = arr[0];
        int answer =0;
        while(idx < s.length()) {
            if(arr[idx].equals(x)) xc++;
            else yc++;

            if(xc == yc && (idx + 1) < s.length()) {
                answer++;
                xc = 1;
                yc = 0;
                x = arr[++idx];
            }
            idx++;
        }
        return ++answer;
    }
}