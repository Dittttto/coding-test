func solution(s string) string {
    mid := len(s) / 2
    length := 1

    if len(s) % 2 == 0 {
        mid--
        length++
    }
    
    return s[mid:mid+length]
}