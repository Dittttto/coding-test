import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            String[] strings = reader.readLine().split("");
            int size = 0;

            for (int j = 0; j < strings.length; j++) {
                if(strings[j].equals("(")) {
                    size += 1;
                }else {
                    if(size == 0) {
                        size = -1;
                        break;
                    }

                    size -= 1;
                }
            }

            if(size == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
