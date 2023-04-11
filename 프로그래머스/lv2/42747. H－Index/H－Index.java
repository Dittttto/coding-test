import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length; i > 0  ; i--) {
            if(isValid(citations, i)) return i;
        }
        return 0;
    }
    
    private boolean isValid(int[] citations, int h){
        int index = citations.length - h;
        return citations[index] >= h;
    }
}