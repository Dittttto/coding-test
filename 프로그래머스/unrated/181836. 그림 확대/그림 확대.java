import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
        
        for(String row: picture) {
            StringBuilder sb = new StringBuilder();
            for(char c: row.toCharArray()){
                for(int i = 0; i< k;i++) {
                    sb.append(c);
                }
            }
            
            for(int i = 0; i< k;i++) {
                list.add(sb.toString());
            }
        }
        
        return list.toArray(new String[0]);
    }
}