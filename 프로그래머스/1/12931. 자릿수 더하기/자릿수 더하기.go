func solution(n int) int {
    answer := 0
    
    for ;n != 0; {
        mod := n % 10
        answer += mod
        n /= 10
    }

    return answer
}