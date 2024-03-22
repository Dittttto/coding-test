import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> reported = new HashMap<>();
        HashMap<String, ArrayList<String>> reporter = new HashMap<>();
        HashMap<String, Integer> mail = new HashMap<>();

        for(String id: id_list) {
            reporter.put(id, new ArrayList<>());
            reported.put(id, 0);
            mail.put(id, 0);
        }

        for (String issue: report) {
            String[] temp = issue.split(" ");
            String from = temp[0];
            String to = temp[1];

            if(!reporter.get(from).contains(to)) {
                reporter.get(from).add(to);
                reported.replace(to, reported.get(to) +1);
            }
        }

        for (Map.Entry<String, Integer> entry: reported.entrySet()){
            String id = entry.getKey();
            int value = entry.getValue();
            if (value >= k) {
                for(Map.Entry<String, ArrayList<String>> item: reporter.entrySet()){
                    ArrayList<String> list = item.getValue();
                    String key = item.getKey();
                    if(list.contains(id)){
                        mail.replace(key, mail.get(key) + 1);
                    }
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length ; i++) {
            answer[i] = mail.get(id_list[i]);
        }
        return answer;
    }
}