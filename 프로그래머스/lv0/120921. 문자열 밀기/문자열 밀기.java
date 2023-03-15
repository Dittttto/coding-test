import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(String A, String B) {
        Deque<String> deque = new ArrayDeque<>();

        for(String str: A.split("")){
            deque.addLast(str);
        }

        if(A.equals(B)) {
            return 0;
        }

        int idx = 0;
        int cnt = 0;

        while(idx < deque.size()){
            String result = "";
            deque.addFirst(deque.pollLast());
            cnt +=1;

            for(String str: deque){
                result += str;
            }

            if(result.equals(B)) {
                break;
            }

            idx += 1;
        }

        if(idx < deque.size()){
            return cnt;
        }else {
            return -1;
        }
    }
}