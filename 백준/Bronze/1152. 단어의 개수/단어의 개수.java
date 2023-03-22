import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int result = 0;

        for(String word: arr) {
            if(!word.equals("")){
                result += 1;
            }
        }
        System.out.println(result);
    }
}