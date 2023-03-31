import java.io.*;
import java.util.Arrays;

public class Main {
    static String[] list;
    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;
    static String maxString = "";
    static String minString = "";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        list = reader.readLine().split(" ");
        int[] out = new int[N+1];
        boolean[] visited = new boolean[10];

        permutation(out, visited, 0, N);
        writer.write(maxString + "\n");
        writer.write(minString +  " ");
        writer.flush();
        writer.close();
    }

    public static void permutation(int[] out, boolean[] visited, int depth, int N) {
        if(depth == N+1){
            if (isPossible(out)) {
                int tmp =0;
                String tmpS = "";
                for(int i: out) {
                    tmp +=i;
                    tmpS += i;
                }

                if(maxValue <= tmp) {
                    maxValue = tmp;
                    maxString = tmpS;
                }

                if(minValue > tmp) {
                    minValue =tmp;
                    minString = tmpS;
                }
            }
            return;
        }

        for (int j = 0; j < 10; j++) {
            if(!visited[j]) {
                visited[j] = true;
                out[depth] = j;
                permutation(out, visited, depth+1, N);
                visited[j] = false;
            }
        }
    }

    public static boolean isPossible(int[] out) {
        for (int i = 0; i <out.length-1 ; i++) {
            if(!check(out[i], out[i+1],list[i])){
                return false;
            }

        }
        return true;
    }

    public static boolean check(int x, int y, String key){
        if (key.equals(">")) {
            return x > y;
        }
        return x < y;
    }
}

