class Solution {
    public int[] solution(String s) {
        int cntB = 0;
        int cntS = 0;

        while(true) {
            StringBuilder sb = new StringBuilder();
            for(char ch: s.toCharArray()) {
                if(ch == '0'){
                    cntS++;
                    continue;
                }

                sb.append(ch);
            }

            s = Integer.toBinaryString(sb.length());
            cntB++;
            if(s.equals("1")){
                break;
            }
        }
        return new int[]{cntB, cntS};
    }
}