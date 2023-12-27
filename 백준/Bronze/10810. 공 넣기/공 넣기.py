n ,m = map(int, list(input().split()))

arr = [0] * n

for i in range(m):
    i ,j, k = map(int, list(input().split()))
    i -= 1
    j -= 1
    arr[i:j+1] = [k] * (j - i + 1)

for i in arr:
    print(i, end= " ")