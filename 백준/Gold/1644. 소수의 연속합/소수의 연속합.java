import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        
        if (n == 1) {
            System.out.println(0);
            return;
        }
        
        if (n == 2) {
            System.out.println(1);
            return;
        }
        int cnt = 0;
        boolean[] ch = new boolean[n + 1];
        ch[0] = ch[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!ch[i]) {
                for (int j = i * i; j <= n; j += i) {
                    ch[j] = true;
                }
            }
        }

        List<Integer> prime = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!ch[i]) prime.add(i);
        }

        int size = prime.size();
        int value = prime.get(0);
        int left = 0;
        int right = 0;

        while (left < size || right < size) {
            if (value < n) {
                right += 1;
                if (right >= size) break;
                value += prime.get(right);
            } else if (value > n) {
                if (left >= size) break;
                value -= prime.get(left);
                left += 1;
            } else {
                cnt += 1;
                value -= prime.get(left);
                left += 1;
            }
        }

        if (!ch[n]) cnt += 1;

        writer.write(cnt + "");
        writer.flush();
        writer.close();
    }
}
