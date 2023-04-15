import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] arr = my_str.split("");
        ArrayList<String> list = new ArrayList<>();
        String tmp = "";
        for(int i = 0; i< arr.length; i++) {
            tmp += arr[i];
            if((i+1)% n == 0) {
                list.add(tmp);
                tmp = "";
            }
        }
        
        if(!tmp.equals("")) {
            list.add(tmp);            
        }
        
        return list.toArray(new String[0]);
    }
}