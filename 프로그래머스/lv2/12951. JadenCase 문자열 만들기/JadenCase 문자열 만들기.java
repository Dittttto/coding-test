import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        int mode = 1;
        int left = 0;
        boolean capital = false;
        while(left < arr.length) {
            if(arr[left] - '0' >=0 && arr[left] - '0' <= 9) {
                mode = 0;
            }else if(arr[left] == ' ') {
                mode = 1;
                capital = false;
            }else {
                if(mode == 0) {
                        arr[left] = Character.toLowerCase(arr[left]);
                }else if(mode == 1) {
                    if(!capital){
                        arr[left] = Character.toUpperCase(arr[left]);
                        capital = true;
                    }else {
                        arr[left] = Character.toLowerCase(arr[left]);
                    }
                }
            }
            
            left++;
        }
        
        return new String(arr);
    }
}