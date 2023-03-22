import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split("");
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v","w","x","y","z"};
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], i);
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            String key = alphabet[i];
            if(hm.containsKey(key)) {
                System.out.print(hm.get(key));
            }else {
             System.out.print(-1);
            }

            if(i != alphabet.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
