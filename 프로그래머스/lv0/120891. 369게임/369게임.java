class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 0) { 
            int dom = order%10;
            if(dom == 3 || dom == 6 || dom == 9) answer++;
            order/=10;
        }
        return answer;
    }
}