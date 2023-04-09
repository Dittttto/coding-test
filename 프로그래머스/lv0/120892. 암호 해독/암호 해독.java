class Solution {
    public String solution(String cipher, int code) {
        char[] arr = cipher.toCharArray();
        String answer = "";
        for(int i = code -1; i < arr.length; i+= code){
            answer += arr[i];
        }
        return answer;
    }
}