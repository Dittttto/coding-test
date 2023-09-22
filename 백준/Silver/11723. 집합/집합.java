import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter writer;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int m = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
             st = new StringTokenizer(reader.readLine());
             String command = st.nextToken();
             int num = 0;
             if (st.hasMoreTokens()) {
                 num = Integer.parseInt(st.nextToken());
             }

            switch (command) {
                case "add": {
                    add(num, set);
                    break;
                }
                case "remove": {
                    remove(num, set);
                    break;
                }
                case "check": {
                    check(num, set);
                    break;
                }
                case "toggle": {
                    toggle(num, set);
                    break;
                }
                case "all": {
                    set = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
                    break;
                }
                case "empty": {
                    set = new HashSet<>();
                }
            }
        }

        writer.flush();
        writer.close();
    }

    private static void add(int n, Set<Integer> set) {
        set.add(n);
    }

    private static void remove(int n, Set<Integer> set) {
        set.remove(n);
    }

    private static void check(int n, Set<Integer> set) throws IOException {
        int result = set.contains(n) ? 1 : 0;
        writer.write(result +"\n");
    }

    private static void toggle(int n, Set<Integer> set) {
        if (set.contains(n)) {
            set.remove(n);
        }else {
            set.add(n);
        }
    }
}
