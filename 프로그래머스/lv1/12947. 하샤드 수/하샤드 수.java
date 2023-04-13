class Solution {
    int res = 0;
    public boolean solution(int x) {
        Integer.toString(x).chars().forEach(i -> res += (i - '0'));
        if(x % res == 0 ) return true;
        return false;
    }
}