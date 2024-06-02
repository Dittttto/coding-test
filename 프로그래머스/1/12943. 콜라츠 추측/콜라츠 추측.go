func solution(num int) int {
    limit := 500
    
    if num == 1 {
        return 0
    }
    
    cnt := 1
    for {
        if num % 2 == 0 {
            num /= 2
        }else {
            num *= 3
            num += 1
        }
        
        if num == 1 {
            break
        }
        
        cnt += 1
        
        if cnt >= limit {
            return -1
        }
    }
    
    return cnt
}