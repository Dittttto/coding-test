import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        static StringBuilder sb;

        public static void main(String[] args) throws IOException {

                int T = Integer.parseInt(reader.readLine());

                for (int i = 0; i < T; i++) {
                        String[] operations = reader.readLine().split("");
                        int n = Integer.parseInt(reader.readLine());
                        String numbers = reader.readLine();
                        numbers = numbers.substring(1, numbers.length() - 1);
                        int[] nums;
                        if (n == 0) {
                                nums = new int[0];
                        }else {
                                nums = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
                        }

                        Deque<String> oper = new ArrayDeque<>();
                        for (String operation : operations) {
                                if (!oper.isEmpty() && oper.peekLast().equals("R") && operation.equals("R")) {
                                        oper.pollLast();
                                        continue;
                                }

                                oper.offerLast(operation);
                        }

                        boolean hasError = false;
                        boolean isReverse = false;
                        int left =0;
                        int right = nums.length -1;
                        for (String operation : oper) {
                                if (operation.equals("R")) {
                                        isReverse = !isReverse;
                                } else {
                                        if (right - left +1 == 0) {
                                                hasError = true;
                                                break;
                                        }

                                        if (isReverse) {
                                                right -=1;
                                        }else {
                                                left += 1;
                                        }
                                }

                        }

                        if (hasError) {
                                writer.write("error\n");
                        } else {
                                List<Integer> result = new ArrayList<>();
                                for (int j = left; j <= right; j++) {
                                        result.add(nums[j]);
                                }


                                if (isReverse){
                                        result = reverse(result);
                                }

                                sb = new StringBuilder();
                                sb.append("[");
                                for (int j = 0; j <result.size() ; j++) {
                                        sb.append(result.get(j)).append(j != result.size()-1 ? "," : "");
                                }

                                sb.append("]");
                                writer.write(sb + "\n");
                        }

                }

                writer.flush();
                writer.close();
        }

        private static List<Integer> reverse(List<Integer> list) {
                List<Integer> result = new ArrayList<>();

                for (int i = list.size() -1 ; i > -1 ; i--) {
                        result.add(list.get(i));
                }

                return result;
        }
}
 // boxing 비용까지 아껴야 한다.
// List<Integer> 의 경우 Integer 로 박싱이 된다.
