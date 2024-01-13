import sys
from collections import deque

input = sys.stdin.readline

visited = [False] * 100001


def bfs(n, k):
    count = 0
    q = deque([n])
    visited[n] = True

    while q:
        r = len(q)
        for _ in range(r):
            cur = q.popleft()
            if cur == k:
                print(count)
                return

            if cur + 1 <= 100000 and not visited[cur+1]:
                q.append(cur+1)
                visited[cur + 1] = True

            if cur -1 >= 0 and not visited[cur-1]:
                q.append(cur-1)
                visited[cur - 1] = True

            if cur * 2 <= 100000 and not visited[2 * cur]:
                q.append(cur * 2)
                visited[cur * 2] = True

        count += 1




def main():
    n, k = list(map(int, input().split()))

    bfs(n, k)



main()