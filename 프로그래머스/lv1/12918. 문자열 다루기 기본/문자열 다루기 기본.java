class Solution {
    public boolean solution(String s) {
        boolean onlyNum = true;
        boolean len = s.length() == 4 || s.length() == 6;
        for(char ch: s.toCharArray()) {
            if(ch > '9'){
                onlyNum = false;
                break;
            }
        }
        
        return len && onlyNum;
    }
}