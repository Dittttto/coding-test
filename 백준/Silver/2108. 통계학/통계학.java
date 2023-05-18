import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        writer.write(avg(arr,T) + "\n");
        writer.write(mid(arr,T) + "\n");
        writer.write(cnt(arr,T) + "\n");
        writer.write(diff(arr,T) + "\n");

        writer.flush();
        writer.close();
    }

    public static long avg(int[] arr, int n) {
        long sum = 0;
        for(int num: arr) {
            sum += num;
        }

        return Math.round((double) sum / n);
    }

    public static int mid(int[] arr, int n) {
        Arrays.sort(arr);
        int mid = n / 2;
        return arr[mid];
    }

    public static int cnt(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num: arr) {
            hm.put(num, hm.getOrDefault(num, 0) +  1);
        }

        int max = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (max == entry.getValue()) {
                list.add(entry.getKey());
            }
        }

        list.sort(Comparator.naturalOrder());

        return list.size() == 1 ? list.get(0) : list.get(1);
    }

    public static int diff(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[arr.length-1] - arr[0];
    }
}
