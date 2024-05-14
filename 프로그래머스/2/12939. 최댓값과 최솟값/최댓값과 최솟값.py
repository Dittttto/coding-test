def solution(s):
    sorted = list(map(int, s.split(" ")))
    sorted.sort()
    return str(sorted[0]) + " " + str(sorted[-1])