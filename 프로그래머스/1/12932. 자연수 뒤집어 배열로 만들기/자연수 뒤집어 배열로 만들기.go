func solution(n int64) []int {
    var slice []int
    
    for {
        mod := n % 10
        n /= 10
        
        slice = append(slice, int(mod))
        if n == 0 {
            break;
        }
    }
    
    return slice
}