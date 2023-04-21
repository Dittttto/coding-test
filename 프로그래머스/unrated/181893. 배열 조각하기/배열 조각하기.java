class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        int len = arr.length;
        for(int i = 0; i< query.length; i++) {
            if(i%2 == 0) {
            if(query[i] > end) continue;
                
                end = start + query[i]  - 1;
            }else {
                start += query[i];
            }
        }
        if(start == end) return new int[]{arr[start]};
        if(end < start) return new int[]{-1};
        
        int[] answer = new int[end - start + 1];
        for(int i = 0; i<answer.length;i++) {
            answer[i] = arr[start + i];
        }
        
        return answer;
    }
    
}