import sys

input = sys.stdin.readline


def main():
    n = int(input())
    total = 0
    for i in range(n+1):
        for j in range(i, n+1):
            total += i + j
    print(total)


main()
