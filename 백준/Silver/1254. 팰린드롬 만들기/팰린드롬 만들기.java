import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution1254 {
    static String s;
    public Solution1254() {}
    public void read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
    }

    public int run() {
        if (s.length()== 1) {
            return 1;
        }

        if(check(s)) {
            return s.length();
        }

        int idx;
        for (idx = 0; idx<s.length() ; idx++) {
            if(check(s.substring(idx))){
                break;
            }
        }

        return idx + s.length();
    }

    public boolean check(String s) {
        String[] arr = s.split("");
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
