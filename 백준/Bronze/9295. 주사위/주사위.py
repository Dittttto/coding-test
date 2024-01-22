import sys

input = sys.stdin.readline


def main():
    n = int(input())
    for i in range(n):
        c, v = map(int, input().split())
        print(f"Case {i+1}: {c+v}")


main()
