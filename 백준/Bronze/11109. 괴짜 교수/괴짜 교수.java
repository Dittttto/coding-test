import java.io.*;
import java.util.Arrays;

public class Main {

    /**
     * 병렬버전의 프로그램을 개발
     * 프로그램 개발에 걸리는 시간을 측정
     * 병렬버전과 직렬버전의 실행 시간을 측정
     * 어떤 경우에 병렬화를 통해 전반적인 작업량을 최고화하는지 알고 싶다!
     * 병렬 버전 개발 일정 + 실행 횟수 * 병렬 프로그램 실행 시간
     * 비교
     * 실행 횟수 * 직렬 프로그램 실행 시간
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();;
            int d = input[0];
            int n = input[1];
            int s = input[2];
            int p = input[3];

            int resultSerialize =  n * s;
            int resultParallelize = d + n * p;
            if (resultSerialize == resultParallelize) {
                writer.write("does not matter\n");
            }else if (resultSerialize < resultParallelize) {
                writer.write("do not parallelize\n");
            }else{
                writer.write("parallelize\n");
            }
        }

        writer.flush();
        writer.close();
    }
}
