import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        boolean[] checked = new boolean[1000000];
        checked[0] = true;
        checked[1] = true;

        for (int i = 2; i < checked.length; i++) {
            if(!checked[i]) {
                for (int j = i*i; j < checked.length; j += i) {
                    if(j%i == 0) {
                        checked[j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(reader.readLine());
            boolean[] visited = new boolean[1000000];
            int cnt = 0;

            for (int j = 2; j < num ; j++) {
                if(!checked[j] && !checked[num -j]) {
                    if(visited[j] || visited[num-j]) {
                        continue;
                    }
                    visited[num - j] = true;
                    visited[j] = true;
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

    }
}
