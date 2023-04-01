class Solution {
    public String solution(String s, String skip, int index) {
                char[] chArr = skip.toCharArray();
        boolean[] checkSkip = new boolean[26];
        for(char ch: chArr) {
            checkSkip[ch - 'a'] = true;
        }

        String answer = "";
        for(char ch: s.toCharArray()){
            int start =ch - 'a';
            int cnt = index;
            while(cnt > 0) {
                start = (start + 1) % 26;
                if(!checkSkip[start]) {
                    cnt--;
                }
            }

            answer += (char)(start + 'a');
        }

        return answer;
    }
}