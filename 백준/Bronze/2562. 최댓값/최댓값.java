import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt;
        int maxValue = -1;
        int maxIndex = 0;

        for (int i =1; i <= 9; i++) {
            srt = new StringTokenizer(reader.readLine());
            int num = Integer.parseInt(srt.nextToken());

            if(num > maxValue){
                maxValue = num;
                maxIndex = i;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
