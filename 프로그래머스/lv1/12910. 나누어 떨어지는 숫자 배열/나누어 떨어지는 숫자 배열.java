import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = IntStream.of(arr).filter(x -> x%divisor == 0).sorted().toArray();
      return answer.length == 0 ? new int[]{-1} : answer;
    }
}