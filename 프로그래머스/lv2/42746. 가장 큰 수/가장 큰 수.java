import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        List<Integer> tmp = Arrays.stream(numbers).boxed().sorted((x, y) -> {
            String dx = Integer.toString(x);
            String dy = Integer.toString(y);
            long tmp1 = Integer.parseInt(dx+dy);
            long tmp2 = Integer.parseInt(dy+dx);
            if(tmp1 > tmp2) return 1;
            else if (tmp1 < tmp2) return -1;
            return 0;
        }).collect(Collectors.toList());
        
        String answer = "";
        boolean hasOnlyZero = true;
        for(int num: tmp) {
            if(num != 0) hasOnlyZero = false;
            answer = num + answer;
        }
        
        if(hasOnlyZero) return "0";
        
        return answer;
    }
}