import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int size = 5;
        for (int i = 0; i < size; i++) {
            boolean isSwapped = false;
            for(int j = 1; j < size - i; j++) {
                if (numbers[j-1] > numbers[j]) {
                    isSwapped = true;
                    swap(numbers, j);
                    print(numbers, writer);
                }
            }

            if (!isSwapped) break;
        }

        writer.flush();
        writer.close();
    }

    private static void print(int[] numbers, BufferedWriter writer) throws IOException {
        for (int number : numbers) {
            writer.write(number + " ");
        }
        writer.write("\n");
    }

    private static void swap(int[] numbers, int j) {
        int number = numbers[j];
        numbers[j] = numbers[j -1];
        numbers[j -1] = number;
    }
}
