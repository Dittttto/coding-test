import sys

input = sys.stdin.readline


def main():
    n = int(input())
    num_of_computer = 0
    for i in range(n):
        num_of_computer += int(input()) if i == n - 1 else int(input()) - 1

    print(num_of_computer)


main()
