def solution(n):
    s = bin(n)[2:]
    num_of_one = 0
    for i in s:
        if i == '1':
            num_of_one += 1
    
    while True:
        n += 1
        cnt_one = 0
        for i in bin(n)[2:]:
            if i == '1':
                cnt_one += 1
        if cnt_one == num_of_one:
            return n;