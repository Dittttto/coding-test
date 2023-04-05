class Solution {
    public int solution(int[][] dots) {
        boolean[] visited = new boolean[dots.length+1];
        int[] out = new int[dots.length];
        int N = dots.length;
        return permutation(dots, visited, out, 0, N);
    }
    
    public static int calc(int[][] arr, int[] out) {
        double slope = (double) Math.abs(arr[out[0]][1] - arr[out[1]][1]) / Math.abs(arr[out[0]][0] - arr[out[1]][0]);
        double slope2 = (double)Math.abs(arr[out[2]][1] - arr[out[3]][1]) / Math.abs(arr[out[2]][0] - arr[out[3]][0]);
        return slope2 == slope ? 1 : 0;
    }

    public static int permutation(int[][] arr, boolean[] visited, int[] out, int depth, int N) {
        if(depth == N){
            return calc(arr, out);
        }

        int result = 0;
        for (int i = 0; i < 4; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[depth] = i;
                result = permutation(arr, visited, out, depth+1, N);
                visited[i] = false;
            }

            if(result == 1) {
                break;
            }
        }

        return result;
    }
}