import sys

input = sys.stdin.readline


def main():
    while True:
        n = int(input())

        if n == 0:
            return

        result = 0
        for i in range(1, n+1):
            result += i ** 2

        print(result)

main()
