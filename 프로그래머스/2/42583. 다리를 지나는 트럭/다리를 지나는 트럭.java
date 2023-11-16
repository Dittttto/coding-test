import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> q = new LinkedList<>();
        List<Truck> trucks = new ArrayList<>();
        int size = truck_weights.length;
        int idx = 0;
        int time =0;
        int bCurW = 0;
        while(trucks.size() < size) {
            if(!q.isEmpty()) {
                if(q.peek().isOverTime(time, bridge_length)){
                    Truck truck = q.poll();
                    bCurW -= truck.weight;
                    trucks.add(truck);
                }
            }
            
            if(bCurW + truck_weights[idx] <= weight && q.size() +1 <= bridge_length) {
                q.offer(new Truck(truck_weights[idx], time));
                bCurW += truck_weights[idx];
                if(idx + 1 < size){
                    idx += 1;                    
                }
            }
            
            time += 1;
        }
        
        
        return time;
    }
    
    class Truck {
        public int weight;
        public int inTime;
        
        public Truck(int weight, int inTime) {
            this.weight = weight;
            this.inTime = inTime;
        }
        
        public boolean isOverTime(int time, int limit) {
            return time - inTime == limit;
        }
        
        @Override
        public String toString() {
            return weight + "";
        }
    }
}