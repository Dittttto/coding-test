from collections import deque

memo = []
def bfs(b, t, d, words):
    q = deque()
    q.append(b)
    memo.append(b)
    count = 1

    while q:
        temp = len(q)
        for _ in range(temp):
            cur = q.pop()
            if cur == t:
                return count-1
            
            for j in range(len(cur)):
                idx = j+1
                for v in d[idx]:
                    newW = cur[:j] + v + cur[j+1:]
                    if newW not in words: continue
                    if newW in memo: continue
                    memo.append(newW)
                    q.append(newW)
        count += 1

def solution(begin, target, words):
    d = {}
    
    for i in range(len(words[0])):
        d[i+1] = set()
        for j in words:
            d[i+1].add(j[i:i+1])

    if target not in words:
        return 0
    
    return bfs(begin, target, d, words)
