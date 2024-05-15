def solution(n):
    answer = 1
    left = 1
    right = 1
    sumValue = 0
    
    while left <= right:
        if sumValue > n:
            sumValue -= left
            left += 1
        elif sumValue < n:
            sumValue += right
            right += 1
            if right > n:
                break
        else:
            answer += 1
            sumValue -= left
            left += 1
            
            
    return answer