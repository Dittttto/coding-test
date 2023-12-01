import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> name = new HashMap<>();
        List<String[]> message = new ArrayList<>();
        
        for(String row: record) {
            String[] token = row.split(" ");
            
            if(token[0].equals("Change")) {
                name.put(token[1], token[2]);
            }else {
                message.add(new String[]{token[0], token[1]});
                if(token[0].equals("Enter")) {
                    name.put(token[1], token[2]);
                }
            }
        }
        
        return getMessage(message, name);
    }
    
    public static String[] getMessage(List<String[]> message, Map<String, String> name) {
        List<String> result = new ArrayList<>();
        for(String[] row: message) {
            if(row[0].equals("Enter")) {
                result.add(name.get(row[1]) + "님이 들어왔습니다.");
            }else {
                result.add(name.get(row[1]) + "님이 나갔습니다.");
            }
        }
        
        return result.toArray(new String[0]);
    }
}