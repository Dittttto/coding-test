def solution(s):
    cnt = 0
    num_of_zero = 0
    while s != '1':
        length = len(s)
        for i in s:
            if i == '0':
                num_of_zero += 1
                length -= 1
            
        s = "{0:b}".format(length)
        cnt += 1
    return [cnt, num_of_zero]