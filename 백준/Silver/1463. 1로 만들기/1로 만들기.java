import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        boolean[] checked = new boolean[n+1];
        int[] orders = new int[n + 1];

        checked[1] = true;
        orders[1] = 0;
        for (int i = 1; i < n; i++) {
            if(!checked[i]) {
                continue;
            }

            checked[i + 1]= true;
            if(orders[i+1] > 0) {
                orders[i+1] = Math.min(orders[i+1], orders[i] + 1);
            }else {
                orders[i+1] = orders[i] + 1;
            }

            if(i*2 <= n) {
                checked[i * 2]= true;
                if(orders[i*2] > 0) {
                    orders[i*2] = Math.min(orders[i*2], orders[i] + 1);
                }else {
                    orders[i*2] = orders[i] + 1;
                }
            }

            if(i*3 <= n) {
                checked[i * 3]= true;
                if(orders[i*3] > 0) {
                    orders[i*3] = Math.min(orders[i*3], orders[i] + 1);
                }else {
                    orders[i*3] = orders[i] + 1;
                }
            }
        }
        System.out.println(orders[n]);
    }
}
