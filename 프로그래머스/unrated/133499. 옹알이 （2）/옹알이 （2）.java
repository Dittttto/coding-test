class Solution {
    public int solution(String[] babbling) {
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(String text: babbling) {
            String textCopy = text;
            for(String word: words) {
                int idx = textCopy.indexOf(word);
                if(idx == -1) continue;
                
                String tmp= textCopy.replace(word, "");
                int textLen = textCopy.length();
                int tmpLen = tmp.length();
                int wordLen = word.length();
                if(textLen - tmpLen == wordLen){
                    textCopy = textCopy.replace(word, "*");
                }else {
                    boolean flag = true;
                    for(int i = 1;i < (textLen - tmpLen) / wordLen; i++){
                        int step = textCopy.indexOf(word, idx+1);
                        if(step == idx + wordLen) {
                            flag = false;
                            break;
                        }
                        idx = textCopy.indexOf(word, idx+1);
                    }
                    
                    if(flag){
                        textCopy = textCopy.replace(word, "*");;                       
                    }
                }
            }
            
            if(textCopy.replace("*","").length() == 0) answer++;
        }
        return answer;
    }
}