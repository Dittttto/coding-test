import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());

        int mcd = getMCD(N, M);
        int mcm = getMCM(mcd, N, M);
        System.out.println(mcd);
        System.out.println(mcm);
    }
    static int getMCM(int mcd, int number1, int number2) {
        return (number1 * number2) / mcd;
    }
    static int getMCD(int number1, int number2){
        int mcd = -1;
        ArrayList divisorsA = getDivisor(number1);
        ArrayList divisorsB = getDivisor(number2);

        for(int itemA: (ArrayList<Integer>)divisorsA) {
            for(int itemB: (ArrayList<Integer>)divisorsB) {
                if(itemA == itemB) {
                    if(itemA > mcd) {
                        mcd = itemA;
                    }
                }
            }
        }

        return mcd;
    }

    static ArrayList getDivisor(int number) {
        ArrayList result = new ArrayList();

        for (int i = 1; i <= (int)number/2 ; i++) {
            if(number % i == 0) {
                result.add(i);
            }
        }
        result.add(number);

        return result;
    }
}
