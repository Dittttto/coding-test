from collections import deque
import sys
input = sys.stdin.readline

n, m, k = list(map(int, input().split()))

arr = [[] for _ in range(n+1)]
visited = [0] * (n+1)

for i in range(m):
    f, t = list(map(int, input().split()))
    arr[f].append(t)
    arr[t].append(f)

def bfs(v):
    q = deque([v])
    order = 1
    visited[v] = order
    order += 1
    while q:
        cur = q.popleft()

        arr[cur].sort(reverse=True)
        for i in arr[cur]:
            if(visited[i] > 0): continue
            visited[i] = order
            order += 1
            q.append(i)

bfs(k)

for i in visited[1:]:
    print(i)
