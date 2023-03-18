import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] S = reader.readLine().split("");
        String result = "";
        String word = "";

        boolean tagStarted = false;
        int idx = 0;
        while(idx < S.length) {
            if(S[idx].equals("<")) {
                tagStarted = true;
            }else if(S[idx].equals(">")){
                result += word + ">";
                word = "";
                tagStarted = false;
                idx += 1;
                continue;
            }

            if(tagStarted) {
                word += S[idx];
            }else {
                if(!S[idx].equals(" ")){
                    word = S[idx] + word;
                }else {
                    result += word + " ";
                    word = "";
                }
            }

            idx +=1;
        }

        result += word;
        System.out.println(result);
    }
}
