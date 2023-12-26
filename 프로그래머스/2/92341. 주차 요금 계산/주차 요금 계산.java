import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Long> cumulativeTime = new HashMap<>();
        Map<String, Long> parkTime = new HashMap<>();
        Map<String, String> state = new HashMap<>();
        
        for(String record: records) {
            String[] recordArr = record.split(" ");
            Long time = convertTime(recordArr[0]);
            String number = recordArr[1];
            String parkState = recordArr[2];
            state.put(number, parkState);
            
//             if(!numbers.contains(number)){
//                 numbers.add(number);
//             }
            
            if(parkState.equals("IN")) {
                parkTime.put(number, time);
            }else {
                Long subtract = time - parkTime.get(number);
                cumulativeTime.put(number, cumulativeTime.getOrDefault(number, 0L) + subtract);
                parkTime.put(number, 0L);
            }
        }
        
        for(Map.Entry<String, String> entry: state.entrySet()) {
            String number = entry.getKey();
            String stateStr = entry.getValue();
            
            if(stateStr.equals("IN")) {
                Long subtract = (23 * 60 + 59L) - parkTime.get(number);
                cumulativeTime.put(number, cumulativeTime.getOrDefault(number, 0L) + subtract);
            }
        }
        
        List<String> numbers = new ArrayList<>(cumulativeTime.keySet());
        Collections.sort(numbers);
        int[] answer = new int[numbers.size()];
        for(int i = 0; i < numbers.size(); i++) {
            String number = numbers.get(i);
            Long parkingTime = cumulativeTime.get(number);
            answer[i] = (int)calculateFee(fees, parkingTime);
        }
        
        return answer;
    }
    
    private long calculateFee(int[] fees, Long parkingTime) {
        if(parkingTime <= fees[0]) {
            return (long)(fees[1]);
        }
        
        double overTime = (parkingTime - fees[0]) / (double)fees[2];
        
        if(overTime % 1 != 0.0) {
            overTime = (long)overTime / 1 + 1;
        }else {
            overTime = (long)overTime / 1;
        }
        return (long)(fees[1] + (double)(overTime * (double)fees[3]));
    }
    
    private long convertTime(String time) {
        String[] splitTime = time.split(":");
        return Long.parseLong(splitTime[0]) * 60 + Long.parseLong(splitTime[1]);
    }
}