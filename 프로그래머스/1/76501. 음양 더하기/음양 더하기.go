func solution(absolutes []int, signs []bool) int {
    answer := 0
    for i := 0; i < len(absolutes); i++ {
        if signs[i] {
            answer += absolutes[i]
        }else {
            answer -= absolutes[i]
        }
    }
    return answer
}