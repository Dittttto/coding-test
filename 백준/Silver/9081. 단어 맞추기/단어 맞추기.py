import sys

input = sys.stdin.readline


def swap(arr, i, j):
    arr[i], arr[j] = arr[j], arr[i]


def next_permutation(arr, n):
    i = n - 1
    while i > 0 and arr[i - 1] >= arr[i]:
        i -= 1
    if i == 0:
        return False

    j = n - 1
    while arr[i - 1] >= arr[j]:
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
    for _ in range(n):
        arr = list(input().strip())
        length = len(arr)

        result = next_permutation(arr, length)
        if not result:
            print("".join(arr))
            continue

        print("".join(arr))

main()
