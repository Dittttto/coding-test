import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split("");
        int depth = nums.length % 3 == 0 ? 2 : nums.length % 3 - 1;
        long temp = 0;
        int idx = 0;

        while(idx < nums.length){
            int digit = Integer.parseInt(nums[idx]);
            temp += digit * Math.pow(2, depth);
            depth -= 1;
            idx +=1;

            if(depth < 0){
                System.out.print(temp);
                depth = 2;
                temp = 0;
            }
        }
    }
}
