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
                if(textCopy.length() - tmp.length() == word.length()){
                        textCopy = textCopy.replace(word, "*");
                }else {
                    boolean ok = true;
                    for(int i = 1;i < (textCopy.length() - tmp.length()) / word.length(); i++){
                        int step = textCopy.indexOf(word, idx+1);
                        if(step == idx + word.length()) {
                            ok = false;
                            break;
                        }
                        idx = textCopy.indexOf(word, idx+1);
                    }
                    
                    if(ok){
                        textCopy = textCopy.replace(word, "*");;                       
                    }
                }
            }
            
            if(textCopy.replace("*","").length() == 0) answer++;
        }
        return answer;
    }
}