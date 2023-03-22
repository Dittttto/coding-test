import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] checked = new boolean[43];
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            checked[num%42] = true;
        }

        int cnt = 0;
        for (boolean check: checked) {
            if(check) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}