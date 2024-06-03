import (
    "sort"
)

func solution(arr []int, divisor int) []int {
    sort.Slice(arr, func(i, j int) bool {
        return arr[i] < arr[j]
    })    
    
    var answer []int
    
    for _, v := range arr {
        if v % divisor == 0 {
            answer = append(answer, v)
        }
    }
    
    if len(answer) == 0 {
        answer = append(answer, -1)
    }
    
    return answer
}