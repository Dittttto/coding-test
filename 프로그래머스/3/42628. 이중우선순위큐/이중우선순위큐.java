import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQ = new PriorityQueue<>(); 
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder()); 
        List<Command> commands = Arrays.stream(operations)
            .map(command -> command.split(" "))
            .map(command -> new Command(command[0], command[1]))
            .collect(Collectors.toList());
        
        for(Command command: commands) {
            if(command.flag.equals("I")) {
                maxQ.offer(command.target);
                minQ.offer(command.target);
            } else if(maxQ.size()> 0 &&command.target.equals(1)) {
                int peek = maxQ.poll();
                minQ.remove(peek);
            } else if(minQ.size() >0 && command.target.equals(-1)) {
                int peek = minQ.poll();
                maxQ.remove(peek);
            }
            
        }
        
        int maxV = maxQ.peek() == null ? 0 : maxQ.peek();
        int minV = minQ.peek() == null ? 0 : minQ.peek();
        return new int[]{maxV, minV};
    }
    
    class Command {
        public String flag;
        public Integer target;
        
        public Command(String flag, String target) {
            this.flag = flag;
            this.target = Integer.parseInt(target);
        }
    }
}