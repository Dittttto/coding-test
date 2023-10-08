import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < line.length; i++) {
            for(int j = i+1; j < line.length; j++) {
                Point intersection = getIntersection(line[i], line[j]);
                if(intersection != null) {
                    points.add(intersection);
                }
            }
        }
        
        Point minP = getMinPoint(points);
        Point maxP = getMaxPoint(points);
        
        int sizeY = (int)(maxP.getY() - minP.getY()) + 1;
        int sizeX = (int)(maxP.getX() - minP.getX()) + 1;
        
        String[][] board = new String[sizeY][sizeX];
        for(String[] l: board) {
            Arrays.fill(l, ".");
        }
        
        for(Point point: points) {
            int x = (int)(point.getX() - minP.getX());
            int y = (int)(maxP.getY() - point.getY());
            
            board[y][x] = "*";
        }
        
        int idx =0;
        String[] result = new String[sizeY];
        for(String[] arr: board) {
            StringBuilder sb = new StringBuilder();
            for(String str: arr) {
              sb.append(str);
            }
            result[idx++] = sb.toString();
        }

        return result;
    }
    
    public class Point {
        private final long x;
        private final long y;
        
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
        
        public long getX() {
            return this.x;
        }
        
        public long getY() {
            return this.y;
        }
    }
    
    public Point getIntersection(int[] f1, int[] f2) {
        double x = (double)((long)f1[1]*f2[2] - (long)f1[2]*f2[1]) / ((long)f1[0]*f2[1] - (long)f1[1]*f2[0]);
        double y = (double)((long)f1[2]*f2[0] - (long)f1[0]*f2[2]) / ((long)f1[0]*f2[1] - (long)f1[1]*f2[0]);
        
        if(x % 1 != 0 || y % 1 != 0) return null;
        
        return new Point((long) x, (long) y);
    }
    
    public Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for(Point point: points) {
            if(x > point.getX()) x = point.getX();
            if(y > point.getY()) y = point.getY();
        }
        
        return new Point(x, y);
    }
    
    public Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for(Point point: points) {
            if(x < point.getX()) x = point.getX();
            if(y < point.getY()) y = point.getY();
        }
        
        return new Point(x, y);
    }
}