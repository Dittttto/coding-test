func solution(s string) string {
    length := len(s)
    if length == 1 {
        return s
    }
    mid := length/2
    if length % 2 == 0 {
        return s[mid-1 : mid+1]
    }else {
        return s[mid: mid+1]
    } 
}