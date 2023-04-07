class Solution {
    int[][] map;
    int[] result = new int[]{0,0};
    public int[] solution(int[][] arr) {
        map = arr;
        go(map.length, 0, 0);

        return result;
    }

    public void go(int n,int i,int j){
        if(n == 1) {
            result[map[i][j]]+=1;
            return;
        }

        int num = map[i][j];
        boolean hasOne = true;
        for (int k = i; k < i+n; k++) {
            for (int l = j; l < j+n; l++) {
                if(map[k][l] != num){
                    hasOne = false;
                    break;
                }
            }

            if(!hasOne) break;
        }

        if(hasOne) {
            result[num] += 1;
        }else {
            go(n/2, i, j);
            go(n/2, i, j +n/2);
            go(n/2, i+n/2, j);
            go(n/2, i+n/2, j+n/2);
        }
    }
}