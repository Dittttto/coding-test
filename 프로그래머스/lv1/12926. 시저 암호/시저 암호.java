class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char tmp = arr[i];
            if(tmp ==' ') continue;
            // for(int j= 0; j < n;j++) {
                // tmp+=1;
                if(tmp >= 'a') {
                tmp  = (char)((tmp - 'a' + n) %(int)('z' - 'a'+1) + 'a');
                }else {
                    tmp  = (char)((tmp - 'A' + n) %(int)('Z' - 'A'+1) + 'A');    
                }
            // }
            arr[i] = tmp;
        }
        String answer = new String(arr);
        return answer;
    }
}