class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n,m), (int)glc(n,m)};
    }
    
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public double glc(int n, int m) {
        return (n * m) / (double)gcd(n,m);
    }
}