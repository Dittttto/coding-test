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
                    return false;
                }
            }
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
                    return false;
                }

                if(y+dy3  >= 0 && y+dy3 < map.length && x+dx3 >= 0 && x+dx3 < map.length && !map[y+dy3][x+dx3].equals("X")){
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean checkSafety(String[][] map, int x, int y) {
        int[][] top = new int[][] {{-1,0}, {-2,0}};
        int[][] left = new int[][] {{0,-1}, {0, -2}};
        int[][] right = new int[][] {{0,1}, {0,2}};
        int[][] bottom = new int[][] {{1,0},{2,0}};
        int[] leftTop = new int[] {-1,-1 , 0, -1, -1, 0};
        int[] rightTop = new int[] {-1,1, 0, -1, 0,1};
        int[] leftBottom = new int[] {1,-1, 0,-1,1,0};
        int[] rightBottom = new int[] {1,1, 1,0, 0,1};

        int[][][] direct = new int[][][]{top, left, right, bottom};
        boolean answer = true;
        for (int[][] row: direct){
            for (int i = 0; i < row.length; i++) {
                int cx = x;
                int cy = y;
                int dx = row[i][1];
                int dy = row[i][0];

                if (cx + dx < 0 || cx + dx >= map.length) continue;
                if (cy + dy < 0 || cy + dy >= map.length) continue;
                if (map[cy + dy][cx + dx].equals("X")) break;
                if (map[cy + dy][cx + dx].equals("P")) {
                    answer = false;
                    break;
                }
            }
            
            if(!answer) break;
        }
        
        if(!answer) return answer;

        int[][] direct2 = new int[][]{leftTop, rightTop, leftBottom, rightBottom};
        for (int i = 0; i < direct2.length; i++) {
            int cx = x;
            int cy = y;
            int dx = direct2[i][1];
            int dy = direct2[i][0];
            int y2 = direct2[i][2];
            int x2 = direct2[i][3];
            int y3 = direct2[i][4];
            int x3 = direct2[i][5];

            if (cx + dx < 0 || cx + dx >= map.length) continue;
            if (cy + dy < 0 || cy + dy >= map.length) continue;
            if (map[cy + dy][cx + dx].equals("X")) continue;
            if (map[cy + dy][cx + dx].equals("P")) {
                if(cy + y2 >= 0 && cy + y2 < map.length && cx + x2 >= 0 && cx + x2 < map.length && !map[cy+y2][cx+x2].equals("X")) {
                    answer = false;
                    break;
                } else if(cy + y3 >= 0 && cy + y3 < map.length && cx + x3 >= 0 && cx + x3 < map.length && !map[cy+y3][cx+x3].equals("X")){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}