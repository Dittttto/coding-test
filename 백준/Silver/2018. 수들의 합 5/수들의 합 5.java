import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int left = 0;
        int right = 0;
        int sum = arr[left];
        int cnt =0;
        while(left < n){

            if(sum == n) {
                cnt++;
                sum -= arr[left];
                left++;
            }else if(sum < n) {
                right++;
                if(right >= n) {
                    break;
                }

                sum += arr[right];
            }else {
                sum -= arr[left];
                left++;
            }
        }

        System.out.println(cnt);
    }
}
