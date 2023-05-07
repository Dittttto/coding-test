import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int maxP = 0;
        for(int i =0 ;i < priorities.length; i++) {
            int p = priorities[i];
            q.offer(new int[]{p, i});
            list.add(p);
        }
        
        list.sort(Comparator.reverseOrder());
        System.out.println(list.toString());
        
        int pIdx = 0;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            if(cur[0] == list.get(pIdx)) {
                if(cur[1] == location) {
                    return pIdx+1;
                }else {
                    pIdx++;                    
                }
            }else {
                q.offer(cur);
            }
        }
        
        return -1;
    }
}