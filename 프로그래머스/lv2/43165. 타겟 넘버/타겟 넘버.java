class Solution {
    public int solution(int[] numbers, int target) {
        return go(0,0,target,numbers);
    }
    
    public int go(int idx, int sum, int target, int[] numbers) {
        if(idx == numbers.length) {
            if(sum == target) return 1;
            return 0;
        }
        return go(idx + 1, sum + numbers[idx], target, numbers) + go(idx + 1, sum - numbers[idx], target, numbers);
    }
}