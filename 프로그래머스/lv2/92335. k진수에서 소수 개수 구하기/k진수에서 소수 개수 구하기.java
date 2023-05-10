class Solution {
    public int solution(int n, int k) {
        String trans = "";
        while(n > 0) {
            trans = n%k + trans;
            n /= k;
        }
        
        String[] arr = trans.split("0");
        int cnt = 0;
        for(String str: arr) {
            str = str.replaceAll(" ", "");
            if(!str.equals("") && check(str)) cnt++;
        }
        
        return cnt;
    }
    
    public boolean check(String str) {
        int num = Integer.parseInt(str, 10);
//         if(num < 2) return false;
        
//         for(int i = 2; i*i <= num ;i++) {
//             if(num % i == 0) return false;
//         }
        
        return true;
    }
}