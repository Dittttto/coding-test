func solution(x int, n int) []int64 {
    var arr []int64
    for i := 1 ; i <= n ; i++ {
        arr = append(arr, int64(i * x))
    } 
    
    return arr
}