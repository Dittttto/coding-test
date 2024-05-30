func solution(x int) bool {
    origin := x
    sum := 0
    
    for x != 0 {
        sum += x % 10
        x /= 10
    }
    
    return origin % sum == 0
}