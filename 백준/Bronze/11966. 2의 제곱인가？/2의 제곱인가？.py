import sys
input = sys.stdin.readline


def main():
    n = int(input().strip())
    if n == 1:
        print(1)
        return

    while n > 1:
        if n % 2 != 0:
            print(0)
            return
        n //= 2
    print(1)


main()
