import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // 나누어 떨어지는 숫자 배열
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
    }

    static int[] solution(int[] arr, int divisor) {
        ArrayList list = new ArrayList();

        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        list.sort(Comparator.naturalOrder());

        return list.stream().mapToInt(x -> (int) x).toArray();
    }

    static int[] solution2(int[] arr, int divisor) {
        int[] answer = IntStream.of(arr).filter(x -> x % divisor == 0).sorted().toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
