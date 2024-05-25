def solution(s):
    x = s
    cnt = 0
    num_of_zero = 0
    zero_cnt = 0
    while s != '1':
        length = len(s)
        has_zero = False
        for i in s:
            if i == '0':
                num_of_zero += 1
                length -= 1
                has_zero = True
            
        s = "{0:b}".format(length)
        cnt += 1
    return [cnt, num_of_zero]