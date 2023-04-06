import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private static class Point {
        final long x,y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public String[] solution(int[][] line) {
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i+1; j < line.length; j++) {
                Point intersection = calcIntersection(line[i][0], line[i][1],line[i][2],line[j][0],line[j][1],line[j][2]);
                if(intersection!=null) {
                    list.add(intersection);
                }
            }
        }

        Point minPoint = getMinimumPosition(list);
        Point maxPoint = getMaximumPosition(list);
        int width = (int)(maxPoint.x - minPoint.x) + 1;
        int height = (int)(maxPoint.y - minPoint.y) + 1;

        String[][] map = new String[height][width];
        for (String[] strings : map) {
            Arrays.fill(strings, ".");
        }

        for (Point point : list) {
            int x = (int) (point.x - minPoint.x);
            int y = (int) (maxPoint.y - point.y);
            map[y][x] = "*";
        }
        
        String[] answer = new String[map.length];
        for (int i = 0; i < map.length; i++) {
            answer[i] = Arrays.stream(map[i]).reduce("", String::concat);
        }
        return answer;
    }
    
    private Point calcIntersection(long A, long B, long E, long C, long D, long F) {
        double x = (double) (B*F - E*D) / (A*D-B*C);
        double y = (double) (E*C - A*F) / (A*D-B*C);
        if(x%1 != 0 || y%1 != 0) return null;

        return new Point((long)x,(long)y);
    }

    private Point getMinimumPosition(List<Point> list) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p: list) {
            if(x > p.x) x = p.x;
            if(y > p.y) y = p.y;
        }

        return new Point(x,y);
    }

    private Point getMaximumPosition(List<Point> list) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p: list) {
            if(x < p.x) x = p.x;
            if(y < p.y) y = p.y;
        }

        return new Point(x,y);
    }
}