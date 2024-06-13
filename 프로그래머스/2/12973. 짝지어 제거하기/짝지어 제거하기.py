def solution(s):
    q = []
    
    for c in s:
        if len(q) != 0 and q[-1] == c:
            q.pop()
        else:
            q.append(c)

    return 1 if len(q) == 0 else 0