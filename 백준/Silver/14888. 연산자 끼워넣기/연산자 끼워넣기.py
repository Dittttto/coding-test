import sys
def permutaion(arr):

    n = len(arr)
    i = j = n-1
    while i>0 and  arr[i-1] >= arr[i]: i-=1
    if i <=0 : return -1
    while arr[i-1]>=arr[j]:j-=1
    arr[i-1],arr[j] = arr[j],arr[i-1]
    arr = arr[:i] + sorted(arr[i:])
    return arr

def solve(arr):
    result = numbers[0]
    for i in range(1,n):
        if arr[i-1] == 0:
            result += numbers[i]
        elif arr[i-1] == 1:
            result -= numbers[i]
        elif arr[i-1] == 2:
            result *= numbers[i]
        elif arr[i-1] == 3:
            if result <0:
                result = -1*(abs(result) // numbers[i])
                result
            else:
                result //= numbers[i]
    return result


n = int(input())
numbers = list(map(int,sys.stdin.readline().split()))
G = []
for i,j in enumerate(sys.stdin.readline().split()):
    G+=[i]*int(j)
ans = G[:]
total = []
while True:
    if ans == -1:
        break
    temp = solve(ans)
    total.append(temp)
    ans = permutaion(ans)
total.sort()
print(total[-1])
print(total[0])