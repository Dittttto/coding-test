import sys

input = sys.stdin.readline


def main():
    n, m = map(int, input().split())
    arr = {}
    arr_a = list(map(int, input().split()))
    arr_b = list(map(int, input().split()))
    for i in arr_a:
        arr[i] = True
    flag = n
    for i in arr_b:
        if i in arr:
            del arr[i]
            flag -= 1

    if flag <= 0:
        print("0")
    else:
        print(flag)
        for i in dict(sorted(arr.items())).keys():
            print(i, end=" ")




main()
