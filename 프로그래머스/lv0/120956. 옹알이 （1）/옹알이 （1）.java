class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        for(String str : babbling) {
            char[] temp = str.toCharArray();
            int wordIndex = 0;
            int index = 0;
            boolean flag = false;
            while(index < temp.length){
                char[] word = findWord(temp[wordIndex]);
                if(word[index - wordIndex] != temp[index] || (temp.length - wordIndex) < word.length){
                    flag = true;
                    break;
                }

                if (index == wordIndex + word.length - 1){
                    wordIndex += word.length;
                }

                index += 1;
            }

            if(!flag){
                result += 1;
            }
        }
        
        return result;
    }
    
     static char[] findWord(char ch) {
        char[] a = {'a', 'y','a'};
        char[] b = {'y','e'};
        char[] c = {'w', 'o','o'};
        char[] d = {'m','a'};

        switch (ch) {
            case 'a':
                return a;
            case 'y':
                return b;
            case 'w':
                return c;
            default:
                return d;
        }
    }
}