import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumHeight = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(reader.readLine());
            sumHeight += num;
            arr.add(num);
        }

        for (int i = 0; i < 8; i++) {
            boolean find = false;
            for (int j = i+1; j < 9; j++) {
                if(sumHeight - arr.get(i) - arr.get(j) == 100) {
                    arr.remove(arr.get(j));
                    arr.remove(arr.get(i));
                    find = true;
                    break;
                }
            }

            if(find) {
                break;
            }
        }

        arr.sort(Comparator.naturalOrder());
        for(int num: arr) {
            System.out.println(num);
        }
    }
}
