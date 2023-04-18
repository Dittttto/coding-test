class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx = 0;
        int l = 0;
        int r = 0;
        boolean find = true;
        while(idx < goal.length){
            String target = goal[idx++];
            if(cards1[l].equals(target)) {
                if(l < cards1.length -1) {
                    l++;                
                }
            }else if(cards2[r].equals(target)) {
                if(r < cards2.length - 1) {
                    r++;                    
                }
            }else {
                find = false;
                break;
            }
        }
        
        if(!find) return "No";
        return "Yes";
    }
}