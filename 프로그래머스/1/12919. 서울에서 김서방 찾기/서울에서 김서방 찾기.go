import "strconv"
func solution(seoul []string) string {
    for i, v := range seoul {
        if v == "Kim" {
            return "김서방은 " + strconv.Itoa(i) + "에 있다"
        }
    }
    
    return ""
}