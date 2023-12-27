n,m = map(int, input().split())
arr = []
for i in range(1, n+1):
    arr.append(i)

for i in range(m):
    f, t = map(int, input().split())
    f -=1
    t -=1
    arr[f], arr[t] = arr[t], arr[f]

for i in arr:
    print(i, end=" ")

