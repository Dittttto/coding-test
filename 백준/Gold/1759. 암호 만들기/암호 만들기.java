import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int L = Integer.parseInt(srt.nextToken());
        int C = Integer.parseInt(srt.nextToken());
        String[] arr = reader.readLine().split(" ");
        Arrays.sort(arr);
        calc(L, arr, "", 0);
        writer.flush();
        writer.close();
    }

    public static void calc(int L, String[] arr, String pw, int depth)  throws IOException{
        if(pw.length() == L) {
            if (check(pw)) {
                writer.write(pw +"\n");
            }
            return;
        }

        if(depth >= arr.length) return;
        calc(L, arr, pw + arr[depth], depth+1);
        calc(L,  arr, pw, depth+1);
    }

    public static boolean check(String pw) {
        int m  = 0;
        int j = 0;
        for(String ch: pw.split("")) {
            if(ch.equals("a") ||ch.equals("e") || ch.equals("u")|| ch.equals("i")|| ch.equals("o") ) {
                m += 1;
            }else {
                j += 1;
            }
        }

        return m >= 1 & j >= 2;
    }
}
