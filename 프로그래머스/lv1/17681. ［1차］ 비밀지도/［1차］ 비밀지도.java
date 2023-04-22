class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];
        for(int i = 0; i< n; i++) {
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(tmp.length() < n) {
                for(int j = 0; j <= n - tmp.length(); j++) {
                    tmp = "0" + tmp;
                }
            }
            
            map[i] = tmp.replaceAll("1", "#").replaceAll("0"," ");
            System.out.println(map[i]);
        }
        
        return map;
    }
}