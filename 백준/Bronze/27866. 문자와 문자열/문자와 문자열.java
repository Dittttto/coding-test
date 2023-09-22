import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        
        System.out.println(input.charAt(n-1));
    }
}