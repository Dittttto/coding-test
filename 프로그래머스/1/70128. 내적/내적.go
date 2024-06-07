func solution(a []int, b []int) int {
    answer := 0
    
    for i := 0 ; i < len(a); i++ {
        answer += a[i]*b[i]
    }
    return answer
}