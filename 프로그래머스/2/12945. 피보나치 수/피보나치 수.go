const Mod = 1234567

func solution(n int) int {
    return Fino(n)
}

func Fino(n int) int {
    memo := []int{0,1}
    
    for i := 2; i < n + 1; i++ {
        memo = append(memo, (memo[i-1] % Mod) + (memo[i-2] % Mod))
    }
    
    return memo[n] % Mod
}