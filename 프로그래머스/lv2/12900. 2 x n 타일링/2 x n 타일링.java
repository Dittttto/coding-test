class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] list = new int[60001];
        list[1] = 1;
        list[2] = 2;
        for(int i = 3; i <=n; i++) {
            list[i] = (list[i-2] % 1000000007 + list[i-1] % 1000000007) % 1000000007;
        }
        return list[n];
    }
}