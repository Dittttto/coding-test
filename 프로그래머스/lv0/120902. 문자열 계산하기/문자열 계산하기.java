class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1; i< arr.length-1;i+= 2) {
            String num = arr[i];
            if(num.equals("+") || num.equals("-")) {
                answer = calc(answer,Integer.parseInt(arr[i+1]),num);
            }
        }
        return answer;
    }
    
    public int calc(int x, int y, String o) {
        return o.equals("+") ? x+y : x-y;
    }
}