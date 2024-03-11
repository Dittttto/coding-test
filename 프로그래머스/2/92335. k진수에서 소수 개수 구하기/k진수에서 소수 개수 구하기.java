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
            if(!str.replaceAll("[^0-9]", "").equals("") && checkIsPrime(str)) cnt++;
        }
        
        return cnt;
    }
    
    public boolean checkIsPrime(String str) {
        long num = Long.parseLong(str);
        if(num < 2) return false;
        
        for(long i = 2; i*i <= num ;i++) {
             if(num % i == 0) return false;
        }
        
        return true;
    }
}