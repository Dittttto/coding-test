import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList list = new ArrayList();

        for(int a: arr) {
            if(a % divisor == 0) {
                list.add(a);
            }
        }

        if(list.size() == 0) {
            list.add(-1);
        }

        list.sort(Comparator.naturalOrder());

        return list.stream().mapToInt(x -> (int)x).toArray();
    }
}