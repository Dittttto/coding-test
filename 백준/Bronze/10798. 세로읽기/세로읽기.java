import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] map = new String[5][15];
        int maxLen = 0;
        for (int i = 0; i < 5; i++) {
            String[] tmp = reader.readLine().split("");
            for (int j = 0; j < tmp.length; j++) {
                map[i][j] = tmp[j];
            }
            maxLen = Math.max(maxLen, tmp.length);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if(map[j][i] != null) {
                    sb.append(map[j][i]);
                }
            }
        }

        writer.write(sb.toString() + "");
        writer.flush();
        writer.close();
    }
}
