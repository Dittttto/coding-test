import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String dartResult) {
        LinkedList<Integer> list = new LinkedList();
        char[] arr = dartResult.toCharArray();
        int answer = 0;
        int l = 0;
        String tmp = "";
        while(l < arr.length) {
            if(!Character.isDigit(arr[l])) {
                int sum = calc(Integer.parseInt(tmp), arr[l]);
                tmp = "";
                if(l+1 < arr.length && !Character.isDigit(arr[l+1])){
                    if(arr[l+1] == '*'){
                        if(!list.isEmpty()) {
                            list.offerLast(list.pollLast() * 2);
                        }

                        list.offerLast(sum * 2);
                    }else{
                        list.offerLast(sum * -1);
                    }
                    
                    l+=1;
                }else {
                    list.offerLast(sum);
                }                
            }else {
                tmp += arr[l];
            }
            
            l++;
        }
        
        for(int num: list){
            answer+=num;
        }
        return answer;
    }
    
    public int calc(int n, char bonus) {
        switch(bonus) {
            case 'S':
                return n;
            case 'D':
                return n * n;
            default:
                return n * n * n;
        }
    } 
}