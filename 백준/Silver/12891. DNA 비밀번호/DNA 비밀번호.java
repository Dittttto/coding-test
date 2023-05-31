import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int S = Integer.parseInt(srt.nextToken());
        int p = Integer.parseInt(srt.nextToken());
        String[] arr = reader.readLine().split("");
        String[] less = reader.readLine().split(" ");
        HashMap<String, Integer> need = new HashMap<>(){{
            put("A", Integer.parseInt(less[0]));
            put("C", Integer.parseInt(less[1]));
            put("G", Integer.parseInt(less[2]));
            put("T", Integer.parseInt(less[3]));
        }};
        HashMap<String, Integer> hm = new HashMap<>();

        int left = 0;
        int right = p - 1;
        int cnt = 0;
        for(int i = 0; i< p; i++) {
            String cur = arr[i];
            hm.put(cur, hm.getOrDefault(cur, 0) + 1);
        }

        if(check(hm, need)) {
            cnt++;
        }


        while(right < arr.length) {
            hm.put(arr[left], hm.getOrDefault(arr[left], 0) - 1);
            left++;
            right++;

            if(right >= arr.length) break;

            hm.put(arr[right], hm.getOrDefault(arr[right], 0) + 1);

            if(check(hm, need)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

     public static boolean check(HashMap<String, Integer> hm, HashMap<String, Integer> need) {
        for (Map.Entry<String, Integer> entry : need.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(value > 0) {
                if(!hm.containsKey(key)) {
                    return false;
                }else {
                    if(hm.get(key) < value){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
