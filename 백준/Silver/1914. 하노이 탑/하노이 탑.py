import sys

input = sys.stdin.readline


def hanoi(n, f, t, o):
    if n > 0:
        hanoi(n - 1, f, o, t)
        print(f, t)
        hanoi(n - 1, o, t, f)


def main():
    n = int(input())

    print(2 ** n - 1)
    if n <= 20:
        hanoi(n, 1, 3, 2)

main()
