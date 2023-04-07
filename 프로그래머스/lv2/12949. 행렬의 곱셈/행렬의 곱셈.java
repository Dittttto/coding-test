class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int N = arr1.length;
        int M = arr2[0].length;
        int[][] result = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int tmp = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    tmp += arr1[i][k] * arr2[k][j];
                }

                result[i][j] = tmp;
            }
        }
        return result;
    }
}