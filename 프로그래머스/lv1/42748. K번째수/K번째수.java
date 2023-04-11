import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length ; i++) {
            int[] command = commands[i];
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if(j >= (command[0]-1) && j <= (command[1]-1)) {
                    list.add(array[j]);
                }
            }

            list.sort(Comparator.naturalOrder());
            result[i] = list.get((command[2]-1));
        }
        return result;
    }
}