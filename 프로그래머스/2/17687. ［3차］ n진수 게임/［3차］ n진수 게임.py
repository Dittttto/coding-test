import string

memo = string.digits + string.ascii_uppercase

def convert(num, base):
    share, remainder = divmod(num, base)
    if share == 0:
        return memo[remainder]

    return convert(share, base) + memo[remainder]

def solution(n, t, m, p):
    
    convertToBase = ''
    answer = ''
    num = 0
    while True:
        convertToBase += convert(num, n)
        num += 1
        if(len(convertToBase) >= t * m):
            break
    
    for i in range(p - 1, len(convertToBase), m):
        answer += convertToBase[i]
        if len(answer) == t:
            break
        
    return answer