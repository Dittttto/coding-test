def next_permutation(arr):

    n = len(arr)
    i = j = n-1

    while i>0 and arr[i-1] >= arr[i]: i-=1
    if i <= 0: return -1

    while arr[i-1] >= arr[j]: j-=1

    arr[j],arr[i-1] = arr[i-1],arr[j]
    arr = arr[:i]+sorted(arr[i:])
    return arr


arr = [i for i in range(1,int(input())+1)]
ans = arr[:]
while True:
    if ans == -1:
        break
    print(' '.join(map(str,ans)))
    ans = next_permutation(ans)