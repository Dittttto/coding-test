import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Node[] arr = new Node[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Node(Integer.parseInt(reader.readLine()), i);
        }

        Arrays.sort(arr);

        int max = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i].idx - i > max) {
                max = arr[i].idx - i;
            }
        }

        System.out.println(max+1);
    }

    static class Node implements Comparable<Node>{
        int val;
        int idx;

        public Node(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node o) {
            return this.val - o.val;
        }
    }
}
