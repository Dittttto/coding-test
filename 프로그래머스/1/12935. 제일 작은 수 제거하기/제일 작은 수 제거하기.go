func solution(arr []int) []int {
    if len(arr) == 1 {
        return []int{-1}
    }
    
    minIdx := 0
    minValue := arr[minIdx]
    
    for i,v := range arr {
        if minValue > v {
            minIdx = i
            minValue = v
        }
    }
    
    
    return append(arr[:minIdx], arr[minIdx+1:]...)
}