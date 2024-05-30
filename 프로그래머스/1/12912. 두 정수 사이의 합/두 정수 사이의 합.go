func solution(a int, b int) int64 {
    var sum int64 = 0
    if a > b {
        a,b = b,a
    }
    
    for i := a; i <= b ;i++ {
        sum += int64(i)
    }
    return sum
}