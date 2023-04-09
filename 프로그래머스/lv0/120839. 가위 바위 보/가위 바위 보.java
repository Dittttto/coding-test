class Solution {
    public String solution(String rsp) {
        int[] arr = {5,0,0,0,0,2};
        String answer = "";
        for(char ch: rsp.toCharArray()){
            answer += String.valueOf(arr[ch -'0']);
        }
        return answer;
    }
}