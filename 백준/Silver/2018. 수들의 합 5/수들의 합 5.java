import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int left = 1;
        int right = 1;
        int cnt = 1;
        int sum = 1;
        while(right != n){
            if(sum == n) {
                cnt++;
                sum -= left;
                left++;
            }else if(sum < n) {
                right++;
                sum += right;
            }else {
                sum -= left;
                left++;
            }
        }

        System.out.println(cnt);
    }
}
