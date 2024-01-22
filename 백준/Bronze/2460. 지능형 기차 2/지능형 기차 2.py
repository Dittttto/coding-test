import sys

input = sys.stdin.readline


def main():
    total = 0
    max_value = 0
    for i in range(10):
        n, m = map(int, input().split())
        total += m - n
        if max_value < total:
            max_value = total
    print(max_value)

main()
