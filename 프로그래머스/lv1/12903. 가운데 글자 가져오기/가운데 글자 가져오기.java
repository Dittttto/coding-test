class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        if(arr.length == 1) return s;
        
        if(arr.length % 2 != 0) {
            return arr[arr.length / 2];
        }else {
            int mid = arr.length / 2;
            return arr[mid-1] + arr[mid];
        }
    }
}