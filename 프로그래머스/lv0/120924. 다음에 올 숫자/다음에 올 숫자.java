class Solution {
    public int solution(int[] common) {
        long diff;
        if(common[1] - common[0] == common[2] - common[1]){
            return common[common.length - 1] + common[1] - common[0];
        }
        diff = common[1] / common[0];            
        return common[0] * (int)Math.pow(diff, common.length);
    }
}