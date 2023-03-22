import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int H = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());

        int newM = M - 45;
        if(newM <0) {
            H = (H-1 + 24)% 24;
            newM = 60 - Math.abs(newM);        
        }

        System.out.println(H +" "+ newM);
    }
}