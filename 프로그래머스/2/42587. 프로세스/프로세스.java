import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Task> q = new LinkedList<>();
        boolean[] visited = new boolean[priorities.length];
        for(int i = 0; i < priorities.length; i++)  {
            q.offer(new Task(i, priorities[i]));
        }
        
        int answer = 0;
        boolean find = false;
        while(q.size() > 0) {
            int max = 0;
            int maxP = -1;
            for(Task task: q) {
                if(maxP < task.priority) {
                    maxP = task.priority;
                }
            }
            
            
            while(!q.isEmpty()) {
                Task task = q.poll();
                if(task.priority == maxP) {
                    answer += 1;
                    if(task.idx == location) {
                        find = true;
                    }
                    break;
                }
                
                q.offer(task);
            }
            
            if(find) {
                break;
            }
        }
        
        return answer;
    }
    
    class Task {
        public int idx;
        public int priority;
        
        public Task(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
        
        
        @Override
        public String toString() {
            return idx+"";
        }
    }
}