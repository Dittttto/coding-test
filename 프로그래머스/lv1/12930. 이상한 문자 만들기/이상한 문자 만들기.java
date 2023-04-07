import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                idx =0; 
                sb.append(arr[i]);
                continue;
            }
            
            if(idx++ % 2 == 0) {
                sb.append(Character.toUpperCase(arr[i]));
            }else {
                sb.append(Character.toLowerCase(arr[i]));
            }
        }

        return sb.toString();
    }
}