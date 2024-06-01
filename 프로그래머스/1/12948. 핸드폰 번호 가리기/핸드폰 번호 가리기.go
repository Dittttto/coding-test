func solution(phone_number string) string {
    limit := len(phone_number) - 4
    answer := ""
    for i, v := range phone_number {
        if i < limit {
            answer += "*"
        }else {
            answer += string(v)
        }
    }
    return answer
}