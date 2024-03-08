class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int m = arr2[0].length;
        
        int[][] result = new int[n][m];
        
        for(int i = 0; i < n;i++) {
            int[] arr = arr1[i];
            
            for(int j = 0; j < arr2[0].length; j++) {
                for(int k = 0; k <arr2.length;k++) {
                    result[i][j] += arr2[k][j]*arr[k];
                }
            }
            
        }
        return result;
    }
}