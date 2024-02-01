import sys

input = sys.stdin.readline


def swap(arr, i, j):
    arr[i], arr[j] = arr[j], arr[i]


def next_permutation(arr, n):
    i = n - 1
    while i > 0 and arr[i - 1] < arr[i]:
        i -= 1
    if i == 0:
        return False

    j = n - 1
    while arr[i - 1] < arr[j]:
        j -= 1
    swap(arr, i-1, j)

    j = n - 1
    while i < j:
        swap(arr, i, j)
        j -= 1
        i += 1

    return True


def main():
    n = int(input())
    arr = list(map(int, input().split()))
    result = next_permutation(arr, n)

    if result:
        for num in arr:
            print(num, end=" ")
    else:
        print(-1)


main()
