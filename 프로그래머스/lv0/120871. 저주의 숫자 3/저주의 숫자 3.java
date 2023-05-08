class Solution {
    public int solution(int n) {
        int idx = 0;
        for(int i = 0; i< n; i++) {
            idx += 1;
            while(true) {
                String tmp = Integer.toString(idx);
                int cnt = 0;
                if(tmp.replaceAll("3","").length() != tmp.length()){
                    idx++;
                    cnt++;
                }
                
                if(idx%3 == 0){
                    idx++;
                    cnt++;
                }
                
                if(cnt == 0) break;
            }
                
        }
        
        return idx;
    }
}