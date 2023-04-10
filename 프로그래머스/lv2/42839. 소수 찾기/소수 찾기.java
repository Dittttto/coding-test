import java.util.*;

class Solution {
    private static int[] list;
    private static HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        list = Arrays.stream(numbers.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <=list.length ; i++) {
            permutation2(new int[i], new boolean[list.length+1], 0, list.length, i);
        }
        return set.size();
    }
    
    public static void permutation2(int[] out, boolean[] visited, int depth, int n, int m){
        if(depth ==  m) {
            Integer tmp = checkPrime(out);
            if(tmp != null) {
                set.add(tmp);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[depth] = i;
                permutation2(out, visited, depth+1, n, m);
                visited[i] = false;
            }
        }
    }

    public static Integer checkPrime(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n += Math.pow(10, i) * list[arr[i]];
        }

        if(n <= 1) return null;

        for (int i = 2; i * i <= n ; i++) {
            if(n%i == 0) {
                return null;
            }
        }

        return n;
    }
}