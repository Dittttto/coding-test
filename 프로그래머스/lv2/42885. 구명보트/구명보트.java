import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int answer = 0;
        int boat = 0;
        int left = 0;
        int right = people.length - 1;
        boolean[] visited = new boolean[people.length];
        while(left < people.length && left < right) {
            if(!visited[right] && limit >= people[right] + people[left]) {
                visited[left] = true;
                visited[right] = true;
                left++;
                right--;
                answer++;
            }else {
                right--;
            }
        }
        
        for(boolean visit: visited) {
            if(!visit) answer++;
        }
        
        return answer;
    }
}