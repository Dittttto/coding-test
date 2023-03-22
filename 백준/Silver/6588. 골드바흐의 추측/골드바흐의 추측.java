import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] checked = new boolean[1000001];

        for (int i = 3; i < checked.length; i += 2) {
            if (!checked[i]) {
                for (int j = i*i; j < checked.length; j += i) {
                    if (j % i == 0) {
                        checked[j] = true;
                    }
                }
            }
        }

        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == 0) {
                break;
            }

            boolean flag = false;
            int num = 0;
            for (int i = 3; i < n; i += 2) {
                if(!checked[i] && !checked[n-i]) {
                    num = i;
                    flag = true;
                    break;
                }
            }

            if(flag) {
                System.out.println(n + " = " + num + " + " + (n-num));
            }else {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
