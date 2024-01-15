from collections import deque

def bfs(begin, target, alphabetDict, words, memo, wordDict):
    q = deque()
    q.append((begin, 0))
    memo.add(begin)

    while q:
        temp = len(q)

        for _ in range(temp):
            cur, count = q.popleft()
            if cur == target:
                return count

            for j in range(len(cur)):
                for v in alphabetDict[j+1]:
                    newW = cur[:j] + v + cur[j+1:]
                    if newW not in wordDict: continue
                    if newW in memo: continue
                    memo.add(newW)
                    q.append((newW, count+1))
    return 0
                    
def solution(begin, target, words):
    if target not in words:
        return 0

    alphabetDict = {}
    wordDict = {}
    for i in words:
        wordDict[i] = 1
    for i in range(len(words[0])):
        alphabetDict[i+1] = set()
        for j in words:
            alphabetDict[i+1].add(j[i:i+1])

    
    return bfs(begin, target, alphabetDict, words, set(), wordDict)