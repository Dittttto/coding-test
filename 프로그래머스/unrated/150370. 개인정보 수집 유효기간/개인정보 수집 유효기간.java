import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> termHm = new HashMap<>();
        int[] todayList = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(terms).map(x -> x.split(" ")).forEach(x -> {termHm.put(x[0], Integer.parseInt(x[1]));});
        ArrayList<Integer> answer = new ArrayList<>();
         for(int i = 0; i < privacies.length; i++) {
            String[] temp = privacies[i].split(" ");
            int[] date = Arrays.stream(temp[0].split("\\.")).mapToInt(Integer::parseInt).toArray();
            String target = temp[1];
            int raise = date[1] + termHm.get(target);
            int year = date[0];
            int month = date[1];
            int day = date[2];

            if(raise <= 12) {
                month = raise;
            }else {
                int x = raise/12;
                int y = raise%12;
                year += x;
                if(y == 0) {
                    month = 12;
                    year -=1;
                }else {
                    month = y;
                }

            }

            if(day-1 == 0) {
                if(month == 1) {
                    year -=1;
                    month = 12;
                }else {
                    month-=1;
                }
                day = 28;
            }else {
                day-=1;
            }

            if(year > todayList[0])  continue;
            if(year == todayList[0]){
                if(month > todayList[1]){
                    continue;
                }else if(month == todayList[1]) {
                    if(day >= todayList[2]) {
                        continue;
                    }
                }
            }
            answer.add(i+1);
        }
        
        return answer.stream().mapToInt(x -> (int)x).toArray();
    }
}