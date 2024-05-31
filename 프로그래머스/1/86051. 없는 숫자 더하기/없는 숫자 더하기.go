func solution(numbers []int) int {
    answer := 45
    for _, v := range numbers {
        answer -= v
    }
    return answer
}