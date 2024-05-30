func solution(x int, n int) []int64 {
    var arr []int64
    
    c := 0
    for i := x ; c < n ; i+= x{
        arr = append(arr, int64(i))
        c += 1
    } 
    
    return arr
}