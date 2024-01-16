import sys
sys.setrecursionlimit(10000)

input = sys.stdin.readline

visited = []

def dfs(v, nodes):
    global visited

    if visited[v]:
        return

    visited[v] = True

    for node in nodes[v]:
        if visited[node] == False:
            dfs(node, nodes)



def main():
    global visited
    n, m = map(int, input().split())
    nodes = [[] for _ in range(n+1)]
    visited = [False] * (n+1)

    for _ in range(m):
        u, v = map(int, input().split())
        nodes[u].append(v)
        nodes[v].append(u)

    count = 0
    for s in range(1, n+1):
        if visited[s] == False:
            dfs(s, nodes)
            count += 1

    print(count)

main()
