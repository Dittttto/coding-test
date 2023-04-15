class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        int[] answer = new int[arr.length - 1];
        int minValue = Integer.MAX_VALUE;
        
        for(int num : arr) {
            if(minValue > num) minValue = num;
        }
        
        int idx =0;
        for(int num: arr) {
            if(num != minValue) answer[idx++] = num;
        }
        
        return answer;
    }
}