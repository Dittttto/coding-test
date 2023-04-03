import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Solution1254 {
    static String s;
    static String[] arr;
    public Solution1254() {}
    public void read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        arr = s.split("");
    }

    public int run() {
        if (arr.length == 1) {
            return 1;
        }

        if(check(arr)) {
            return arr.length;
        }

        int idx;
        for (idx = 0; idx<s.length() ; idx++) {
            if(check(s.substring(idx).split(""))){
                break;
            }
        }

        idx -=1;
        ArrayList<String> tmp = new ArrayList<>(Arrays.asList(arr));
        while(idx >= 0) {
            tmp.add(arr[idx]);
            if(check(tmp.toArray(new String[0]))) {
                return tmp.size();
            }
            idx--;
        }
        return tmp.size();
    }

    public boolean check(String[] arr) {
        int l = 0;
        int r = arr.length - 1;
        boolean good = true;
        while(l < r) {
            if(!arr[l].equals(arr[r])){
                good = false;
                break;
            }
            l++;
            r--;
        }

        return good;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Solution1254 solution1254 = new Solution1254();
        solution1254.read();
        System.out.println(solution1254.run());
    }
}
