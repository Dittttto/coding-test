import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 0; i< arr.length; i++) {
            int left =0;
            int right = N - 1;

            while(left < right) {
                if(arr[left] + arr[right] == arr[i]) {
                    if(left != i && right!=i) {
                        cnt++;
                        break;
                    }else if(left == i) {
                        left++;
                    }else {
                        right--;
                    }
                }else if(arr[left] + arr[right] > arr[i]) {
                    right--;
                }else{
                    left++;
                }
            }
        }

        System.out.println(cnt);
    }
}