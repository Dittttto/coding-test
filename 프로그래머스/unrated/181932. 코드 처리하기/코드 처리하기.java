class Solution {
    public String solution(String code) {
        String mode = "0";
        String answer = "";
        char[] arr = code.toCharArray();
        for(int i =0; i<arr.length; i++ ){
            if(arr[i] == '0' || arr[i] == '1') {
                mode = mode.equals("0") ? "1" : "0";
                continue;
            }
            
            if(mode.equals("0") && i %2 == 0) {
                answer+=arr[i];
            }else if(mode.equals("1") && i % 2 != 0){
                answer+=arr[i];
            }
        }
        
        if(answer.equals("")) return "EMPTY";
        return answer;
    }
}