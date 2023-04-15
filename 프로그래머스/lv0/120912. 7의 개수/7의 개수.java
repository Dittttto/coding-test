class Solution {
    public int solution(int[] array) {
        String num = "";
        for(int i : array) {
            num += i; 
        }
        return num.length() - num.replace("7", "").length();
    }
}