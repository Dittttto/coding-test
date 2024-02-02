N, M = map(int, input().split())
numbers = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            temp = numbers[i] + numbers[j] + numbers[k]
            if ans < temp and temp <= M:
                ans = temp

print(ans)