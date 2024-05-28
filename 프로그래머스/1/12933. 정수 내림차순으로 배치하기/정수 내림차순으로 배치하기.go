import (
    "sort"
    "math"
)

func solution(n int64) int64 {
    var slice []int64
    
    for {
        mod := n % 10
        n /= 10
        
        slice = append(slice, mod)
        if n == 0 {
            break;
        }
    }
    
    sort.Slice(slice, func(i, j int) bool {
        return slice[i] < slice[j]
    })
    
    var answer int64
    for i, v := range slice {
        answer += v * int64(math.Pow(10, float64(i)))
    }
    
    return answer
}