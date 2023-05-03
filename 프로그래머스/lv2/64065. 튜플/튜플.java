import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.replace("{{", "").replaceAll("}}", "").replace("},{", " ").split(" ");
        HashSet<Integer> set = new HashSet<>(); 
        ArrayList<String[]> list = new ArrayList<>();
        for(String str: arr) {
            String[] tmp = str.split(",");
            list.add(tmp);
        }
        
        Collections.sort(list, (x,y) -> x.length - y.length);
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            String[] row = list.get(i);
            for(String numStr: row) {
                int num = Integer.parseInt(numStr);
                if(!set.contains(num)) {
                    answer[i] = num;    
                    set.add(num);
                    break;
                }
            }
        }
        return answer;
    }
}