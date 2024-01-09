def solution(n, s):
    if s < n:
        return [-1]
    
    share, remain = divmod(s, n)
    answer = [share] * n
    
    if remain != 0:
        idx = 0
        while remain > 0:
            answer[idx] += 1
            remain -=1
            idx = (idx + 1) % n
    
    answer.sort()
    return answer