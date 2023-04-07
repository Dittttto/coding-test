import java.math.BigInteger;
import java.util.HashMap;

class Solution {
    public int solution2(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>(){{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        
        char[] str = s.toCharArray();
        int idx = 0;
        String word = "";
        String result = "";
        while(idx < str.length){
            if(str[idx] - '0' < 10) {
                result += str[idx];
                idx++;
                continue;
            }

            word += str[idx];
            if(word.length() >= 3 && hashMap.containsKey(word)) {
                result += hashMap.get(word);
                word = "";
            }

            idx++;
        }
        
        BigInteger bigInteger = new BigInteger(result);
        return bigInteger.intValue();
    }
    
    public int solution3(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>(){{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};

        char[] arr = s.toCharArray();
        int idx = 0;

        while(idx < arr.length) {
            if(arr[idx] > 'a') {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(arr[idx]);
                while(idx++ < arr.length) {
                    if(arr[idx] < 'a') break;
                    sb2.append(arr[idx]);
                    if(hm.containsKey(sb2.toString())){
                        sb.append(hm.get(sb2.toString()));
                        break;
                    }
                }
            }else {
                sb.append(arr[idx]);
            }

            idx++;
        }
        
        return Integer.parseInt(sb.toString());
    }
    
    public int solution(String s) {
        String[] words = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", 
        };

        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}