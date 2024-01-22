import sys

input = sys.stdin.readline


def main():
    n = int(input())

    for i in range(n):
        total_price = int(input())
        num = int(input())
        for i in range(num):
            q, p = map(int, input().split())
            total_price += q * p
        print(total_price)


main()
