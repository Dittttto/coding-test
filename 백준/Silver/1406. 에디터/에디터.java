import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        String[] strings = reader.readLine().split("");
        Stack<String> leftS = new Stack<>();
        Stack<String> rightS = new Stack<>();
        int T = Integer.parseInt(reader.readLine());

        for (String string: strings) {
            leftS.push(string);
        }

        for (int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            String operator = stringTokenizer.nextToken();

            if(operator.equals("L")){
                if(!leftS.isEmpty()){
                    rightS.push(leftS.peek());
                    leftS.pop();
                }
            }else if(operator.equals("D")){
                if(!rightS.isEmpty()){
                    leftS.push(rightS.peek());
                    rightS.pop();
                }
            }else if(operator.equals("B")){
                if(!leftS.isEmpty()){
                    leftS.pop();
                }
            }else {
                String word = stringTokenizer.nextToken();
                leftS.push(word);
            }
        }

        String result = "";
        while(!leftS.isEmpty()) {
            rightS.push(leftS.peek());
            leftS.pop();
        }

        while(!rightS.isEmpty()) {
            writer.write(rightS.peek());
            rightS.pop();
        }

        writer.flush();
        writer.close();
    }
}
