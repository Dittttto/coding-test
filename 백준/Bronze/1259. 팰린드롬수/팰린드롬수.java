import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = reader.readLine();
            if(s.equals("0")) break;
            if(check(s.split(""))){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    public static boolean check(String[] s){
        int l =0;
        int r = s.length-1;
        boolean answer = true;
        while (l < r) {
            if(!s[l++].equals(s[r--])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
