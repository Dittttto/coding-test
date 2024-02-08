import sys

input = sys.stdin.readline


def main():
    n = int(input())
    print("CY" if n % 2 == 0 else "SK")


main()
