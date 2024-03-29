class Solution {
    public String solution2(String new_id) {
        return run(new_id);
    }
    
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
        new_id = new_id.replaceAll("\\.+", ".");
        new_id = new_id.replaceAll("^\\.+|\\.+$", "");
        if(new_id.length() == 0) new_id = "a";
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15).replaceAll("\\.+$", "");
        }
        if(new_id.length() <= 2) {
            while(new_id.length() <3) {
                new_id += new_id.charAt(new_id.length() -1 );
            }
        }
        
        return new_id;
    }
    public static String run(String new_id) {
        String answer = "";
        answer = step1(new_id);
        answer = step2(answer);
        answer = step3(answer);
        if(answer.length() > 15) {
            answer = step2(answer.substring(0, 15));
        }else {
            answer = step2(answer);
        }
        answer = step4(answer);
        return answer;
    }
    public static String step1(String s) {
        return s.toLowerCase();
    }

    public static String step2(String s) {
        String tmp = "";
        char prev = ' ';
        int idx = 0;
        int lastIdx = s.length() - 1;
        for(char i: s.toCharArray()) {
            if(i >= 'a' && i <= 'z' || i >= '0' && i <= '9') {
                tmp += String.valueOf(i);
                prev = i;
            } else if(i == '-' || i == '_' || i == '.') {
                if(tmp.equals("") && i == '.') continue;
                if(prev == '.' && i == '.') continue;
                if(idx == lastIdx && i == '.') continue;
                tmp += String.valueOf(i);
                prev = i;
            }
            idx++;
        }
        return tmp;
    }

    public static String step3(String s) {
        return s.length() == 0 ?  "a" : s;
    }

    public static String step4(String s) {
        String[] arr = s.split("");
        String tmp = s;

        if(arr.length <= 2) {
            while(tmp.length()< 3){
                tmp+= arr[arr.length-1];
            }
        }

        return tmp;
    }
    
}