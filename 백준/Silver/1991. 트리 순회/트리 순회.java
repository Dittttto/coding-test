import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        HashMap<String, String[]> map = new HashMap<>();
        String[] list = new String[27];
        list[1] = "A";
        for (int i = 1; i <= N; i++) {
            String[] tmp = reader.readLine().split(" ");
            map.put(tmp[0], new String[]{tmp[1], tmp[2]});
        }

        preOrder(map, "A");
        System.out.println();
        inOrder(map, "A");
        System.out.println();
        postOrder(map, "A");
    }

    public static void preOrder(HashMap<String, String[]> map, String v) {
        System.out.print(v);
        String left = map.get(v)[0];
        String right = map.get(v)[1];
        if(!left.equals(".")) preOrder(map, left);
        if(!right.equals(".") ) preOrder(map, right);
    }
    public static void inOrder(HashMap<String, String[]> map, String v) {
        String left = map.get(v)[0];
        String right = map.get(v)[1];
        if(!left.equals(".")) inOrder(map, left);
        System.out.print(v);
        if(!right.equals(".") ) inOrder(map, right);
    }

    public static void postOrder(HashMap<String, String[]> map, String v) {
        String left = map.get(v)[0];
        String right = map.get(v)[1];
        if(!left.equals(".")) postOrder(map, left);
        if(!right.equals(".") ) postOrder(map, right);
        System.out.print(v);
    }

}
