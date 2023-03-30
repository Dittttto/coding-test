class Solution {
    public int[] solution(String[] wallpaper) {
        String[][] map = new String[wallpaper.length][wallpaper[0].length()];

        for (int i = 0; i < wallpaper.length; i++) {
            map[i] = wallpaper[i].split("");
        }

        int iT = Integer.MAX_VALUE;
        int iB = Integer.MIN_VALUE;
        int jR = Integer.MIN_VALUE;
        int jL = Integer.MAX_VALUE;

        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j].equals("#")) {
                    iT = Math.min(iT, i);
                    iB = Math.max(iB, i);
                    jL = Math.min(jL, j);
                    jR = Math.max(jR, j);
                }
            }
        }
        
        int[] answer = {iT, jL, (iB+1), (jR+1)};
        return answer;
    }
}