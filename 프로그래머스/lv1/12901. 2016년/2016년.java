class Solution {
    public String solution(int a, int b) {
        int[] arr = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        String[] month = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int tmp = b;
        for(int i = 0; i< a - 1;i++) {
            tmp += arr[i];
        }
        
        String answer = month[tmp % 7];
        return answer;
    }
}