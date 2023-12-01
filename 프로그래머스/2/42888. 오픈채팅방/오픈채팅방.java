import java.util.*;

class Solution {
    private static final String ENTER_MESSAGE = "%s님이 들어왔습니다.";
    private static final String LEAVE_MESSAGE = "%s님이 나갔습니다.";
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
        return message.stream()
            .map(str -> String.format(str[0].equals("Enter") ? ENTER_MESSAGE : LEAVE_MESSAGE, name.get(str[1])))
            .toArray(array -> new String[message.size()]);
    }
}