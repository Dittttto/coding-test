func solution(n int64) int64 {
    if n == 1 {
        return 4
    }
    
    if n < 3 {
        return -1
    }
    
    var i int64
    for i = 2 ; i*i <= n; i++ {
        if i*i == n {
            return (i+1) * (i+1)
        }
    }
    
    return -1
}