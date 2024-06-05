func solution(s string) string {
    length := len(s)
    if length == 1 {
        return s
    }
    
    answer := ""
    if length % 2 == 0 {
        for i, v := range s {
            if i == length /2 -1  {
                answer += string(v)
            }
            if i == length / 2{
                answer += string(v)
                break
            }
        }
    }else {
        for i, v := range s {
            if i == length / 2 {
                answer = string(v)
            }
        }
    } 
    return answer
}