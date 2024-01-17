import sys
sys.setrecursionlimit(100000)

input = sys.stdin.readline
visited = []
find = False

def dfs(v, depth, nodes):
    global visited, find
    
    if find:
        return
    if depth == 5:
        find = True
        return

    visited[v] = True
    for node in nodes[v]:
        if visited[node] == False:
            dfs(node, depth+1, nodes)
            visited[node] = False

def main():
    global visited

    n, m = map(int, input().split())
    nodes = [[] for _ in range(n)]

    for _ in range(m):
        u, v = map(int, input().split())
        nodes[u].append(v)
        nodes[v].append(u)


    for i in range(n):
        visited = [False] * (n)
        dfs(i, 1, nodes)

    print(+find)

main()