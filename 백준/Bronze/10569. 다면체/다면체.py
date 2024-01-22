import sys

input = sys.stdin.readline


def main():
    n = int(input())
    for i in range(n):
        c, v = map(int, input().split())
        print(2 - c + v)


main()
