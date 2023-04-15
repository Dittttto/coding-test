class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String tmp = my_string.replaceAll("[a-zA-z]", " ").replaceAll("\\s+", " ").trim();
        if(tmp.length() == 0) return 0;
        
        String[] arr = tmp.split(" ");
        for(String num: arr) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}