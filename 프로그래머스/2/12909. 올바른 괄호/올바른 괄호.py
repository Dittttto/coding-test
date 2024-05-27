def solution(s):
    left = []
    for i in s:
        if i == ")":
            if len(left) == 0:
                return False
            
            left.pop()
        else:
            left.append(i)

    if len(left) == 0:
        return True

    return False