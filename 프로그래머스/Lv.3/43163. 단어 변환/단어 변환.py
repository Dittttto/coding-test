from collections import deque

memo = []
def bfs(b, t, d, words):
    q = deque()
    q.append((b, 0))
    memo.append(b)

    while q:
        temp = len(q)
        for _ in range(temp):
            cur, count = q.pop()
            if cur == t:
                return count
            for j in range(len(cur)):
                idx = j+1
                for v in d[idx]:
                    newW = cur[:j] + v + cur[j+1:]
                    print(cur,":",newW)
                    if newW not in words: continue
                    if newW in memo: continue
                    memo.append(newW)
                    q.append((newW, count+1))
                print(q)
        print(count)

def solution(begin, target, words):
    d = {}
    
    for i in range(len(words[0])):
        d[i+1] = set()
        for j in words:
            d[i+1].add(j[i:i+1])
    print(d)
    if target not in words:
        return 0
    
    return bfs(begin, target, d, words)
