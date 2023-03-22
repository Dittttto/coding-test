import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int A = Integer.parseInt(srt.nextToken());
        int B = Integer.parseInt(srt.nextToken());
        int aCopy = A;
        int bCopy = B;
        boolean aIsBig = false;
        while(aCopy > 0) {
            int ad = aCopy % 10;
            int bd = bCopy % 10;

            if(ad > bd) {
                aIsBig = true;
                break;
            }else if(ad == bd) {
                aCopy /= 10;
                bCopy /= 10;
            }
            else {
                break;
            }
        }

        int big = A;
        if (!aIsBig){
            big = B;
        }

        while(big> 0) {
            System.out.print(big%10);
            big/=10;
        }
    }
}