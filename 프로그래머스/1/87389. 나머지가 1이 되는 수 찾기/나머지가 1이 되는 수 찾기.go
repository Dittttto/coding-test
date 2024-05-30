func solution(n int) int {
    for i:= 2; i < n; i++ {
        if n % i == 1{
            return i
        }
    }
    
    return 0
}