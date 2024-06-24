import (
    "strconv"
)

func solution(s string) bool {
    if len(s) != 4 && len(s) != 6 {
        return false
    }
    
    _, err := strconv.Atoi(s);
    
    if err != nil {
        return false
    }
    
    return true
}