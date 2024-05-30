func solution(x int) bool {
    origin := x
    sum := 0
    
    for x != 0 {
        sum += x % 10
        x /= 10
    }
    
    if origin % sum == 0 {
        return true
    }
    
    return false
}