import sys

input = sys.stdin.readline


def main():
    n = int(input())
    for i in range(n):
        c, v = map(int, input().split())
        print(f"You get {c // v} piece(s) and your dad gets {c - (c//v) * v } piece(s).")


main()
