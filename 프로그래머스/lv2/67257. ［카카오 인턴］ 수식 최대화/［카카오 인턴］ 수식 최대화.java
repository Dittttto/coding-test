import java.util.*;

class Solution {
    private static final String [][] PATTERN = new String[][]{{"+","-","*"},{"+","*","-"},{"-","+","*"},{"-","*","+"},{"*","+","-"},{"*","-","+"}};
    
    public long solution(String expression) {
        long result = Long.MIN_VALUE;
        List<String> list = splitString(expression);
        for (int i = 0; i < 6; i++) {
            List<String> tmpList = new ArrayList<>(list);
            String[] operators = PATTERN[i];
            int opIdx = 0;

            while(tmpList.size() > 1) {
                String operator = operators[opIdx];
                boolean hasOperator = false;
                for (int j = 1; j < tmpList.size() - 1 ; j++) {
                    if(tmpList.get(j).equals(operator))  {
                        hasOperator = true;
                        String tmp = calc(tmpList.get(j-1), tmpList.get(j+1), operator);
                        tmpList.add(j-1, tmp);
                        tmpList.remove(j+2);
                        tmpList.remove(j+1);
                        tmpList.remove(j);
                        break;
                    }
                }

                if(!hasOperator) opIdx++;
            }

            result = Math.max(Math.abs(Long.parseLong(tmpList.get(0))), result);
        }
        
        return result;
    }
    
    public String calc(String a, String b, String operator) {
        long x = Long.parseLong(a);
        long y = Long.parseLong(b);

        switch(operator) {
            case "+":
                return String.valueOf(x+y);
            case "-":
                return String.valueOf(x-y);
            default:
                return String.valueOf(x*y);
        }
    }
    
    public List<String> splitString(String s) {
        List<String> arr = new ArrayList<>();
        String tmp = "";
        for (char ch: s.toCharArray()) {
            if(Character.isDigit(ch)) {
                tmp += ch;
            }else {
                arr.add(tmp);
                arr.add(String.valueOf(ch));
                tmp = "";
            }
        }

        arr.add(tmp);
        return arr;
    }
}