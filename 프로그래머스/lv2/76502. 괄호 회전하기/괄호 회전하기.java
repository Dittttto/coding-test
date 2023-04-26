import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = s.length();
        while(idx-- > 0) {
            s = s.substring(1) + s.charAt(0);
            if(check(s)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean check(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()){
                stack.offerLast(arr[i]);
            }else {
                char ch = arr[i];
                if(stack.peekLast() == '(' && ch == ')'){
                    stack.pollLast();
                }else if(stack.peekLast() == '{' && ch == '}'){
                    stack.pollLast();
                }else if(stack.peekLast() == '[' && ch == ']'){
                    stack.pollLast();
                }else {
                    stack.offerLast(ch);
                }
            }
        }
        
        if(stack.size() != 0 ) return false;
        
        return true;
    }
}