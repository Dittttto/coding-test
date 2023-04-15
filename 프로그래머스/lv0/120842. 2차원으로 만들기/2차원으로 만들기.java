class Solution {
    public int[][] solution(int[] num_list, int n) {
        int m = num_list.length/n;
        int[][] answer = new int[m][n];
        int i = 0;
        int j = 0;
        for(int num: num_list){
            answer[i][j] = num;
            if(j + 1 == n) i++;
            j = (j + 1) % n;
        }
        return answer;
    }
}