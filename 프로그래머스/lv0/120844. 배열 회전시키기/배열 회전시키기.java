class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        for(int i = 0; i < length; i++){
            if(direction.equals("right")) {
                answer[(i + 1)%length] = numbers[i];
            }else {
                answer[(i - 1 + length) % length] = numbers[i];
            }
        }
        return answer;
    }
}