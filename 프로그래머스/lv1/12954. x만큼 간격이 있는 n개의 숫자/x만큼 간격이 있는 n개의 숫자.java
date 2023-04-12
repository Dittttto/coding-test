import java.util.*;
class Solution {
    public double[] solution(int x, int n) {
        double[] answer = {};
        ArrayList<Double> list = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < n; i++) {
            list.add(x + (double)x*i);
        }
        return list.stream().mapToDouble(e->e).toArray();
    }
}