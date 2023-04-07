class Solution {
    public int[] solution(String s) {
        int cntB = 0;
        int remove = 0;
        while(true) {
            int cntS = 0;
            StringBuilder sb = new StringBuilder();
            for(char ch: s.toCharArray()) {
                if(ch == '0'){
                    cntS++;
                    continue;
                }

            }
            
            remove += cntS;
            s = Integer.toString(s.length() - cntS, 2);
            cntB++;
            if(s.equals("1")){
                break;
            }
        }
        return new int[]{cntB, remove};
    }
}