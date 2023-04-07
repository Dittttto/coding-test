class Solution {
    public int[] solution(String[][] places) {
        int[] list = new int[places.length];
        int idx = 0;
        for (String[] row : places) {
            String[][] map = new String[row.length][];
            for (int i = 0; i < row.length; i++) {
                map[i] = row[i].split("");
            }
            boolean answer = true;
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if(map[i][j].equals("P")){
                        answer = isGood(map, j, i);
                        if(!answer) break;
                    }    
                }
                if(!answer) break;
            }

            if (answer){
                list[idx++] = 1;
            }else {
                list[idx++] = 0;
            }
        }

        return list;
    }
    
private static boolean isGood(String[][] map, int x, int y){
        int[][] top = new int[][] {{-1,0}, {-2,0}};
        int[][] left = new int[][] {{0,-1}, {0, -2}};
        int[][] right = new int[][] {{0,1}, {0,2}};
        int[][] bottom = new int[][] {{1,0},{2,0}};

        int[][][] direction = new int[][][] {top, left, right, bottom};
        boolean answer = true;
        for (int i = 0; i < direction.length; i++) {
            for(int[] dd: direction[i]) {
                int dx = dd[1];
                int dy = dd[0];

                int nx = x + dx;
                int ny = y + dy;

                if( ny <= -1 || ny >= map.length || nx <= -1 || nx >= map.length || map[ny][nx].equals("X")) break;
                if(map[ny][nx].equals("P")) {
                    answer = false;
                    break;
                }
            }
            if (!answer) return false;

        }


        int[][] lt = new int[][] {{-1,-1}, {-1, 0}, {0,-1}};
        int[][] lb = new int[][] {{1, -1}, {0,-1}, {1,0}};
        int[][] rt = new int[][] {{-1, 1}, {-1,0},{0,1}};
        int[][] rb = new int[][] {{1,1}, {0,1}, {1,0}};

        direction = new int[][][]{lt, lb, rt, rb};
        for (int i = 0; i < direction.length; i++) {
            int dx = direction[i][0][1];
            int dy = direction[i][0][0];

            int dx2 = direction[i][1][1];
            int dy2 = direction[i][1][0];

            int dx3 = direction[i][2][1];
            int dy3 = direction[i][2][0];

            int nx = x + dx;
            int ny = y +dy;

            if(ny == -1 || ny == map.length || nx == -1 || nx == map.length || map[ny][nx].equals("X")) continue;
            if(map[ny][nx].equals("P")){
                if(y+dy2  >= 0 && y+dy2 < map.length && x+dx2 >= 0 && x+dx2 < map.length && !map[y+dy2][x+dx2].equals("X")){
                    answer = false;
                    break;
                }

                if(y+dy3  >= 0 && y+dy3 < map.length && x+dx3 >= 0 && x+dx3 < map.length && !map[y+dy3][x+dx3].equals("X")){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}