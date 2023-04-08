class Solution {
    static int idx = 0;
    static boolean finish = false;
    static int answer = 0;

    public int solution(String word) {
        go("", word);
        return answer;
    }
    
    private static void go(String out, String target){
        idx++;
        if(finish) return;
        if(out.equals(target)){
            finish = true;
            answer = --idx;
            return;
        }

        if(out.length() >= 5) return;

        go(out + "A", target);
        go(out + "E", target);
        go(out + "I", target);
        go(out + "O", target);
        go(out + "U", target);
    }
}