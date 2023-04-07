class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        // while(n > 0) {
        //     sb.append(n%3);
        //     n /= 3;
        // }

        // return Integer.parseInt(sb.toString(), 3);
        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}